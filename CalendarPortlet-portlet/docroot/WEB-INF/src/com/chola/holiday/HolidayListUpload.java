package com.chola.holiday;

import java.io.File;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.chola.calendar.model.eventcalendar;
import com.chola.calendar.service.eventcalendarLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Portlet implementation class HolidayListUpload
 */
public class HolidayListUpload extends MVCPortlet {
 

public void uploadFile(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException, IOException, InvalidFormatException, ParseException {

	System.out.println("upload...action.....");
	
	UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
	File userFile = uploadPortletRequest.getFile("file");
	InputStream inputStream = new FileInputStream (userFile);
	
	System.out.println("User File Name : "+userFile);
	
	Workbook workbook = WorkbookFactory.create(inputStream);
	Sheet mySheet = workbook.getSheetAt(0);
	 ArrayList<List<Cell>> cellVectorHolder = new ArrayList<List<Cell>>();
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
     
	 
        	  for (int i = 1; i <= mySheet.getPhysicalNumberOfRows()-1; i++) {
        		  List list = new ArrayList();
              for (int j = 0; j <= 5; j++) {    
        	  Row row = mySheet.getRow(i);
              Cell cell = row.getCell(j);
              String val = handleCell(cell.getCellType(), cell);
        	  list.add(val);
        	  
          }
              System.out.println(list);
              cellVectorHolder.add(list);
              
        	  }
        	  System.out.println(cellVectorHolder);
        	  for (Iterator iterator = cellVectorHolder.iterator(); iterator.hasNext();) {
                  List list = (List) iterator.next();
                  
              System.out.println("Inside vector  : "+list);
            
            int count = CounterLocalServiceUtil.getCountersCount();
      		
            eventcalendar details=eventcalendarLocalServiceUtil.createeventcalendar(count);
      		details.setName(list.get(1).toString());
      		details.setStartdate((list.get(2)==null || list.get(2).toString().equalsIgnoreCase("")) ? null : sdf.parse(list.get(2).toString()));
      		details.setEnddate((list.get(3)==null || list.get(3).toString().equalsIgnoreCase("")) ? null : sdf.parse(list.get(3).toString()));
      		details.setColor((list.get(4)==null || list.get(4).toString().equalsIgnoreCase("")) ? "" : (list.get(4).toString()));
      		details.setUrl((list.get(5)==null || list.get(5).toString().equalsIgnoreCase("")) ? "" : (list.get(5).toString()));
      		
      		details = eventcalendarLocalServiceUtil.addeventcalendar(details);
      		System.out.println("SR NO created in DB : "+details.getId());
      		
          }
        	  
	  
}

private static String handleCell(int type, Cell cell) {
    String cell_value = null;
    if (type == HSSFCell.CELL_TYPE_STRING) {
        cell_value = (cell.getStringCellValue());
    } else if (type == HSSFCell.CELL_TYPE_NUMERIC) {
        cell_value = String.valueOf(cell.getNumericCellValue());
        if (HSSFDateUtil.isCellDateFormatted(cell)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
            cell_value = sdf.format(cell.getDateCellValue());
        }
    } else if (type == HSSFCell.CELL_TYPE_BOOLEAN) {
        cell_value = String.valueOf(cell.getNumericCellValue());
    } else if (type == HSSFCell.CELL_TYPE_FORMULA) {
        switch (cell.getCachedFormulaResultType()) {
            case Cell.CELL_TYPE_NUMERIC:
                cell_value = String.valueOf(cell.getNumericCellValue());
                break;
            case Cell.CELL_TYPE_STRING:
                cell_value = String.valueOf(cell.getRichStringCellValue());
                break;
        }

    } else {
        cell_value = String.valueOf("");
    }
    return cell_value;
}
}