package com.chola.trainingcalendar.action;

import com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil;
import com.chola.ppcontent.service.contentupdateLocalServiceUtil;
import com.chola.trainingcalendar.model.trainingcalendardata;
import com.chola.trainingcalendar.model.trainingcontentuniqueinformation;
import com.chola.trainingcalendar.service.trainingcalendarLocalServiceUtil;
import com.chola.trainingcalendar.service.trainingcalendardataLocalServiceUtil;
import com.chola.trainingcalendar.service.trainingcontentuniqueinformationLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;
import peoplepowerapi.PeoplePowerAPI;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Sheet;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AdminAssignTraining extends MVCPortlet {
	
	private static final Log logger = LogFactoryUtil.getLog(AdminAssignTraining.class);
	
	public void deleteAllTrainings(ActionRequest actionRequest, ActionResponse response) throws ParseException, PortalException, InvalidFormatException, IOException {
		
		logger.info("Delete Corporate Events Action");
		boolean deleteStatus=trainingcalendarLocalServiceUtil.deletAllTrainings();
		
		
	}
	
	public void exportCSVData(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws ParseException, PortalException, InvalidFormatException, IOException {
		logger.info("In Export CSV");
		String[] columnNames = { "Training Title", "Location", "Employee Name",
				"EmailAddress","Response"};
	 String CSV_SEPARATOR = ",";
	 try{
			StringBundler sb = new StringBundler();
			for (String columnName : columnNames) {
			sb.append(getCSVFormattedValue(columnName));
			sb.append(CSV_SEPARATOR);
			}
			sb.setIndex(sb.index() - 1);
			sb.append(CharPool.NEW_LINE);
			
			List<Object[]> lt = trainingcalendarLocalServiceUtil.gettrainingresponses();
			for (Object[] trResponses : lt) {
			sb.append(getCSVFormattedValue(trResponses[0].toString()));
			sb.append(CSV_SEPARATOR);
			sb.append(getCSVFormattedValue(trResponses[1].toString()));
			sb.append(CSV_SEPARATOR);
			sb.append(getCSVFormattedValue(trResponses[2].toString()));
			sb.append(CSV_SEPARATOR);
			sb.append(getCSVFormattedValue(trResponses[3].toString()));
			sb.append(CSV_SEPARATOR);
			sb.append(getCSVFormattedValue(trResponses[4].toString()));
			sb.append(CSV_SEPARATOR);
			sb.setIndex(sb.index() - 1);
			sb.append(CharPool.NEW_LINE);
			}

			String fileName = "TrainingResponses.csv";
			byte[] bytes = sb.toString().getBytes();
			String contentType = ContentTypes.APPLICATION_TEXT;
			
			
			PortletResponseUtil.sendFile(resourceRequest, resourceResponse,
			fileName, bytes, contentType);
	 }catch (Exception e) {
logger.error(e.getMessage());
}
			}
	
	
	protected String getCSVFormattedValue(String value) {
		StringBundler sb = new StringBundler(3);
		sb.append(CharPool.QUOTE);
		sb.append(StringUtil.replace(value, CharPool.QUOTE,
		StringPool.DOUBLE_QUOTE));
		sb.append(CharPool.QUOTE);
		return sb.toString();
		}
	
	public void uploadXcelFile(ActionRequest actionRequest, ActionResponse response) throws ParseException, PortalException, InvalidFormatException, IOException {
		
		logger.info("upload...action.....");
		
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		File userFile = uploadPortletRequest.getFile("file");
		InputStream inputStream = new FileInputStream(userFile);
		logger.info("User File Name : "+userFile);
		
		Workbook workbook = WorkbookFactory.create(inputStream);
		Sheet mySheet = workbook.getSheetAt(0);
		 ArrayList<List<Cell>> cellVectorHolder = new ArrayList<List<Cell>>();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
	     
		 
	        	  //for (int i = 1; i <= mySheet.getPhysicalNumberOfRows()-1; i++) {
		 for (int i = 1; i <=mySheet.getPhysicalNumberOfRows()-1; i++) {
	        		  List list = new ArrayList();
	              for (int j = 0; j <= 6; j++) {    
	        	  Row row = mySheet.getRow(i);
	              Cell cell = row.getCell(j);
	              if(cell!=null){
	            	  String val = handleCell(cell.getCellType(), cell);
	            	  if(val!=null&&val!=""){
	            		  list.add(val);  
	            	  }
	            	  
	              }
	              
	        	  
	        	  
	          }
	              logger.info(list);
	              cellVectorHolder.add(list);
	              
	        	  }
	        	  logger.info(cellVectorHolder);
	        	  for (Iterator iterator = cellVectorHolder.iterator(); iterator.hasNext();) {
	                  List list = (List) iterator.next();
	                  if(!list.isEmpty()){
	    	              logger.info("Inside vector  : "+list);
	    	              StringBuilder tf=new StringBuilder(list.get(3).toString());
	    	              String startTime=tf.substring(0, 5).trim().replace(".", ":");
	    	              String endTime=tf.substring(12, 17).trim().replace(".", ":");
	    	              StringBuilder sd = new StringBuilder(list.get(5).toString());
	    	              StringBuilder ed = new StringBuilder(list.get(6).toString());
	    	              sd.delete(2,4);
	    	              ed.delete(2,4);
	    	            String startDate=sd.toString().trim().replace(" ", "-").toUpperCase();
	    	            String endDate=ed.toString().trim().replace(" ", "-").toUpperCase();
	    	            logger.info(startDate+" : : : "+endDate);
	    	            SimpleDateFormat sdf1=new SimpleDateFormat("dd-MMM-yyyy hh:mm");
	    	            Date date=sdf1.parse(startDate+" "+startTime);
	    	            logger.info("Date start : "+date);
	    	            sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
	    	            Date date1=sdf1.parse(endDate+" "+endTime);
	    	            logger.info("Date end : "+date1);
	    	            
	    	            startDate=sdf.format(date);
	    	            endDate=sdf.format(date1);
	    	              
	    	            
	    	            logger.info("Start Date before inserting : "+startDate);
	    	            logger.info(sdf.parse(startDate));
	    	            logger.info("End Date before inserting : "+endDate);
	    	            logger.info(sdf.parse(endDate));
	    	            
	    	            int count = CounterLocalServiceUtil.getCountersCount();
	    	      		
	    	            trainingcalendardata details=trainingcalendardataLocalServiceUtil.createtrainingcalendardata(count);
	    	      		details.setTitle(list.get(1).toString());
	    	      		details.setDescription(list.get(2).toString());
	    	      		details.setSchedulestartdate((startDate==null || startDate.toString().equalsIgnoreCase("")) ? null : sdf.parse(startDate));
	    	      		details.setScheduleenddate((endDate==null || endDate.toString().equalsIgnoreCase("")) ? null : sdf.parse(endDate));
	    	      		details.setLocation(list.get(4).toString());
	    	      		 trainingcalendardataLocalServiceUtil.addtrainingcalendardata(details);
	                  }
	                  else{
	                	logger.info("else");  
	                  }
	                  
	        	  
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
	
	public void save(ActionRequest actionRequest, ActionResponse response) throws ParseException, PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long trainingId = ParamUtil.getLong(actionRequest, "trainingList");
		
		int arrLength = ParamUtil.getParameterValues(actionRequest, "secondList").length;
		int arrLength1 = ParamUtil.getParameterValues(actionRequest, "thirdList").length;

		logger.info("Second List length : " + arrLength);
		logger.info("Third List length : " + arrLength1);


		String eventDetails = ParamUtil.getString(actionRequest, "eventdetails");
		logger.info("eventDetails : " + eventDetails);
		
		SimpleDateFormat df2 = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
		Date date = new Date();
		long uniqueContentId = Long.parseLong(df2.format(date));
		
		
		String optionValue = ParamUtil.getString(actionRequest, "option");
		String businessId = ParamUtil.getString(actionRequest, "business");
		String gender = ParamUtil.getString(actionRequest, "gender");
		String ageArr = ParamUtil.getString(actionRequest, "age");
		String lessThanAge = ParamUtil.getString(actionRequest, "lessthanvalue");
		String greaterThanAge = ParamUtil.getString(actionRequest, "greaterthanvalue");
		String betweenFromAge = ParamUtil.getString(actionRequest, "betweenfromvalue");
		String betweenToAge = ParamUtil.getString(actionRequest, "betweentovalue");
		String betweenFromToAge=betweenFromAge+"&"+betweenToAge;
		String ageType=ageArr;
		if ("all".equalsIgnoreCase(ageArr)) {
		} else if ("lessthan".equalsIgnoreCase(ageArr)) {
			ageType = "Less than";
		} else if ("greaterthan".equalsIgnoreCase(ageArr)) {
			ageType = "Greater than";
		} else if ("between".equalsIgnoreCase(ageArr)) {
			ageType = "Between";
		}
		
		logger.info("Gender : "+gender);
		if ("all".equalsIgnoreCase(ageArr)) {
		} else if ("lessthan".equalsIgnoreCase(ageArr)) {
			ageArr = "Less than " + lessThanAge;
		} else if ("greaterthan".equalsIgnoreCase(ageArr)) {
			ageArr = "Greater than " + greaterThanAge;
		} else if ("between".equalsIgnoreCase(ageArr)) {
			ageArr = "Between " + betweenFromAge + " to " + betweenToAge;
		}
		
		String currentPageUrl=themeDisplay.getURLCurrent();

		if(currentPageUrl.contains("?"))
		{
			currentPageUrl = currentPageUrl.substring(0, currentPageUrl.indexOf("?"));
		}
		String contentType="Training Calendar";
		String trainingName=trainingcalendarLocalServiceUtil.getTrainingName(String.valueOf(trainingId));
		String notificationText=trainingName+" - Training has been assigned to you";
		// list 1
		if (arrLength >= 1) {
			long notification_type=1;
			String[] values = ParamUtil.getParameterValues(actionRequest, "secondList");
			try{
			trainingcontentuniqueinformation tcinfo=trainingcontentuniqueinformationLocalServiceUtil.createtrainingcontentuniqueinformation(CounterLocalServiceUtil.increment());
			tcinfo.setTraining_id(trainingId);
			tcinfo.setContent_id(uniqueContentId);
			tcinfo.setStatus(1);
			tcinfo.setUdflag(1);
			tcinfo.setContent_type(contentType);
			tcinfo.setNotification_text(notificationText);
			tcinfo.setPageurl(currentPageUrl);
			tcinfo=trainingcontentuniqueinformationLocalServiceUtil.addtrainingcontentuniqueinformation(tcinfo);
		
			String trName=trainingcalendarLocalServiceUtil.getTrainingName(String.valueOf(trainingId));
			
Object[] notificationDetails={tcinfo.getContent_id(),1,1,"Training Calendar",trName+" - Training has been assigned",currentPageUrl};
			
			boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
			if(insert1){
			boolean insert2=trainingcalendarLocalServiceUtil.insertIntoTrainingPPContentStore(businessId, values, gender, ageType, optionValue, uniqueContentId, lessThanAge, greaterThanAge, betweenFromToAge, notification_type);
			logger.info(insert2);
			}
			}catch (Exception e) {
				logger.info(e.getMessage());
			}
			
		}
		
		// list 2
		else if(arrLength1>=1){
			long notification_type=2;
			String[] values = ParamUtil.getParameterValues(actionRequest, "thirdList");
			
			trainingcontentuniqueinformation tcinfo=trainingcontentuniqueinformationLocalServiceUtil.createtrainingcontentuniqueinformation(CounterLocalServiceUtil.increment());
			tcinfo.setTraining_id(trainingId);
			tcinfo.setContent_id(uniqueContentId);
			tcinfo.setStatus(1);
			tcinfo.setUdflag(1);
			tcinfo.setContent_type(contentType);
			tcinfo.setNotification_text(notificationText);
			tcinfo.setPageurl(currentPageUrl);
			tcinfo=trainingcontentuniqueinformationLocalServiceUtil.addtrainingcontentuniqueinformation(tcinfo);
			
			List<String> empids=new ArrayList<String>();
			for(int i=0;i<values.length;i++){
				String str = values[i].toString();
		        int firstBracket = str.indexOf('(');
		        String empId = str.substring(firstBracket + 1, str.indexOf(')', firstBracket));
		        logger.info(empId);
		        empids.add(empId);
			}
			logger.info("List Of employee iDs : "+empids.toString());
			String[] finalValues=empids.toArray(new String[0]);
			
			
			String trName=trainingcalendarLocalServiceUtil.getTrainingName(String.valueOf(trainingId));
			Object[] notificationDetails={tcinfo.getContent_id(),1,1,"Training Calendar",trName+" - Training has been assigned",currentPageUrl};
			
boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
			
			if(insert1){
				boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, finalValues, "ALL", "all", optionValue, tcinfo.getContent_id(), null, null, null, notification_type);
				logger.info(insert2);
			}
		}
		
		
		else{
			long notification_type=0;
			String[] values = ParamUtil.getParameterValues(actionRequest, "thirdList");
			
			trainingcontentuniqueinformation tcinfo=trainingcontentuniqueinformationLocalServiceUtil.createtrainingcontentuniqueinformation(CounterLocalServiceUtil.increment());
			tcinfo.setTraining_id(trainingId);
			tcinfo.setContent_id(uniqueContentId);
			tcinfo.setStatus(1);
			tcinfo.setUdflag(1);
			tcinfo.setContent_type(contentType);
			tcinfo.setNotification_text(notificationText);
			tcinfo.setPageurl(currentPageUrl);
			tcinfo=trainingcontentuniqueinformationLocalServiceUtil.addtrainingcontentuniqueinformation(tcinfo);

			String trName=trainingcalendarLocalServiceUtil.getTrainingName(String.valueOf(trainingId));
			Object[] notificationDetails={tcinfo.getContent_id(),1,1,"Training Calendar",trName+" - Training has been assigned",currentPageUrl};
			
			boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
			
			if(insert1){
				boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, values, gender, ageType, optionValue, tcinfo.getContent_id(), lessThanAge, greaterThanAge, betweenFromToAge, notification_type);
			logger.info(insert2);
			}
			
		}
	}


	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		
		
		try {

			String cmd = ParamUtil.getString(resourceRequest, Constants.CMD);
			if ("exportCSV".equals(cmd)) {
				exportCSVData(resourceRequest, resourceResponse);
				}
			else if ("trainingList".equalsIgnoreCase(resourceRequest.getResourceID())) {
			try {
				logger.info("In Training List Fetch Method");
				List<Object[]> lt = trainingcalendarLocalServiceUtil.getTrainingList();
				logger.info(lt.toString());
				PrintWriter writer = resourceResponse.getWriter();
				JSONArray finalOb = new JSONArray();
				for (Object[] obje : lt) {
					logger.info(obje[0]);
					logger.info(obje[1]);
					String title=obje[1].toString()+" ("+obje[5].toString()+")";
					JSONObject obj = new JSONObject();
					obj.put("id", obje[0]);
					obj.put("title", title);
					finalOb.add(obj);

				}

				writer.print(finalOb);
			} catch (Exception e) {
logger.error(e.getMessage());
			}
		}

		else if ("trainingCalendarData".equalsIgnoreCase(resourceRequest.getResourceID())) {
			try {
			
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				logger.info("In TrainingData List Fetch Method");
				List<Object[]> lt = trainingcalendarLocalServiceUtil.getTrainingList();
				
				
				logger.info(lt.toString());
				PrintWriter writer = resourceResponse.getWriter();
				JSONArray finalOb = new JSONArray();
				JSONObject objF = new JSONObject();
				for (Object[] obje : lt) {
					logger.info(obje[0]);
					logger.info(obje[1]);
					logger.info(obje[3]);
					JSONObject obj = new JSONObject();
					obj.put("id", obje[0].toString());
					obj.put("name", obje[2].toString()+" ("+obje[5]+")");
					obj.put("startdate", ((obje[3] == null || obje[3].toString().equalsIgnoreCase(""))) ? ""
							: sdf.format(sdf.parse(obje[3].toString())));
					obj.put("enddate", ((obje[4] == null || obje[4].toString().equalsIgnoreCase(""))) ? ""
							: sdf.format(sdf.parse(obje[4].toString())));
					obj.put("color", "blue");
					finalOb.add(obj);

				}

				objF.put("monthly", finalOb);
				logger.info(objF);
				writer.print(objF);
			} catch (Exception e) {
logger.error(e.getMessage());
			}
		}
		
		
		

		else if ("intendedTrainingList".equalsIgnoreCase(resourceRequest.getResourceID())) {
			try {
				String screenName = resourceRequest.getParameter("scName");
				logger.info("Parameter from javascript : " + screenName);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				logger.info("In TrainingData List Fetch Method");
				List<Long> contentIds = AdminAssignTraining.getUniqueContentIdBasedOnLoggedInUser(screenName);
				
				if(contentIds!=null){
					
				
				logger.info("Training Id " + contentIds.toString());
				
				
				PrintWriter writer = resourceResponse.getWriter();
				JSONArray finalOb = new JSONArray();
				JSONObject objF = new JSONObject();
				for(Long contentId:contentIds){
List<trainingcontentuniqueinformation> tcui=trainingcontentuniqueinformationLocalServiceUtil.getTrainingId(contentId);					
		
			
		
		if(!tcui.isEmpty()){
			for(trainingcontentuniqueinformation tcuidetailed:tcui){
				logger.info("Training Id : "+tcuidetailed.getTraining_id());
				Object[] lt2 = trainingcalendarLocalServiceUtil.getIntendedUserTrainingRecordList(tcuidetailed.getTraining_id());					
				logger.info("Object After Query : "+lt2);
			    if(lt2!=null){ 
				JSONObject objTrData = new JSONObject();
			     objTrData.put("id", lt2[0].toString());
			     objTrData.put("title", lt2[1].toString());
			     objTrData.put("description", lt2[2].toString());
			     objTrData.put("startdate", ((lt2[3] == null || lt2[3].toString().equalsIgnoreCase(""))) ? ""
							: sdf.format(sdf.parse(lt2[3].toString())));
			     objTrData.put("enddate", ((lt2[4] == null || lt2[4].toString().equalsIgnoreCase(""))) ? ""
							: sdf.format(sdf.parse(lt2[4].toString())));
			     objTrData.put("content_id", contentId);
			     objTrData.put("screenname", screenName);
			     finalOb.add(objTrData);
			    }
				}
			}else{
			}
				}
				
				objF.put("monthly", finalOb);
				writer.print(objF);
				
				}else{
					
					JSONObject objTrData = new JSONObject();
					PrintWriter writer = resourceResponse.getWriter();
					JSONArray finalOb = new JSONArray();
					JSONObject objF = new JSONObject();
					String startDate="";
					String endDate="";
					objTrData.put("id", "");
				     objTrData.put("title", "");
				     objTrData.put("description", "");
				     objTrData.put("startdate", ((startDate == null || startDate.toString().equalsIgnoreCase(""))) ? ""
								: sdf.format(sdf.parse(startDate.toString())));
				     objTrData.put("enddate", ((endDate == null ||endDate.toString().equalsIgnoreCase(""))) ? ""
								: sdf.format(sdf.parse(endDate.toString())));
				     objTrData.put("content_id", "");
				     objTrData.put("screenname", "");
				     finalOb.add(objTrData);
				     
				     objF.put("monthly", finalOb);
						writer.print(objF);
				     
				     
				}
				
				
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		
		else if ("updateTrainingIntendedTableFlagToConfirm".equalsIgnoreCase(resourceRequest.getResourceID())) {
			try {
				boolean flag=false;
				String screenName = resourceRequest.getParameter("scName");
				String trainingId=resourceRequest.getParameter("trainingId");
				int statusConfirm=1;
				logger.info("Screen Name : "+screenName+" Id "+trainingId);
				
				flag = trainingcalendarLocalServiceUtil.updateFlag(Integer.parseInt(trainingId), screenName,statusConfirm);
		logger.info("Update Status : "+flag);
				PrintWriter writer = resourceResponse.getWriter();
		
				writer.print(flag);
			} catch (Exception e) {
logger.error(e.getMessage());
			}
		}
		
		else if ("updateTrainingIntendedTableFlagToReject".equalsIgnoreCase(resourceRequest.getResourceID())) {
			try {
				
				boolean flag=false;
				String screenName = resourceRequest.getParameter("scName");
				String trainingId=resourceRequest.getParameter("trainingId");
				String contentId=resourceRequest.getParameter("contentId");
				String statusReject=resourceRequest.getParameter("statusflag");
				logger.info("Screen Name : "+screenName+" Id "+trainingId+" Content Id "+contentId+" Flag "+statusReject);
				flag = trainingcalendarLocalServiceUtil.addAcceptRejectResponse(Integer.parseInt(trainingId), screenName, Long.parseLong(contentId), Integer.parseInt(statusReject));
		logger.info("Update Status : "+flag);
				PrintWriter writer = resourceResponse.getWriter();
		
				writer.print(flag);
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
			
		}
		else if ("usersCall".equalsIgnoreCase(resourceRequest.getResourceID())) {
					logger.info("Fetch User ID");
					List<Object[]> lt = trainingcalendarLocalServiceUtil.getUsersData();
					
					Iterator it = lt.iterator();

					JSONObject obj = new JSONObject();
					JSONArray jArray = new JSONArray();
					PrintWriter writer = resourceResponse.getWriter();

					while (it.hasNext()) {
						Object object = (Object) it.next();
						JSONObject obj1 = new JSONObject();
						obj1.put("tag", object.toString());
						jArray.add(obj1);
					}

					logger.info("Array : " + jArray);
					obj.put("Users", jArray);
					logger.info("Object : " + obj);
					writer.print(obj);
				}

				else if ("serviceCall".equalsIgnoreCase(resourceRequest.getResourceID())) {

					logger.info("Inside Serveresource");
					List<String> lt = contentupdateLocalServiceUtil.getCompany();
					logger.info("List : " + lt.toString());
					Iterator it = lt.iterator();
					JSONArray jArray = new JSONArray();
					PrintWriter writer = resourceResponse.getWriter();

					while (it.hasNext()) {
						Object[] object = (Object[]) it.next();
						JSONObject obj = new JSONObject();
						obj.put("business_id", object[0].toString());
						obj.put("business_name", object[1].toString());
						jArray.add(obj);
					}

					logger.info(jArray);
					writer.print(jArray);

				} else {
					List<String> lt = new ArrayList<>();
					String businessId = ParamUtil.getString(resourceRequest, "business");

					if ("Unit".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getUnit(businessId);
					} else if ("Function".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getFunction(businessId);
					} else if ("Department".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getDepart(businessId);
					}
					
					else if ("Designation".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getDesignation(businessId);
					}
					
					else if ("Product".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getProduct(businessId);
					}
					
					else if ("Zone".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getZone(businessId);
					}
					
					else if ("Branch".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getBranch(businessId);
					}
					
					else if ("Grade".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getGrade(businessId);
					}
					else if ("Region".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getRegion(businessId);
					}
					else if ("Location".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getLocation(businessId);
					}

					logger.info("Inside Serveresource : ");

					JSONObject obj = new JSONObject();
					PrintWriter writer = resourceResponse.getWriter();
					obj.put("unit", lt);
					writer.print(obj);
				}
			} catch (Exception e) {
logger.error(e.getMessage());
			}
	}
	
	public static List<Long> getUniqueContentIdBasedOnLoggedInUser(String empId){
		try{
		empId=trainingcalendarLocalServiceUtil.getEmpIdFromUID(empId);
		logger.info("Employee Id : : : "+empId);
		List<Long> finalList=new ArrayList<>();
		//PeoplePowerAPI pp=new PeoplePowerAPI();
		//org.json.JSONObject employeeinfo=pp.getEmployeeInfo(empId);
		//logger.info("Data from People Power API getEmpInfo : "+employeeinfo.toString());
		List<Object[]> activeEmployeeInfo=NoticationCategoryCountLocalServiceUtil.getActiveEmployeeInfoFromTable(empId);
		
		  String businessVal=null; 
		  String unitVal=null; 
		  String functionVal=null; 
		  String departmentVal=null; 
		  String designationVal=null; 
		  String productVal=null; 
		  String zoneVal=null; 
		  String branchVal=null; 
		  String gradeVal=null; 
		  String regionVal=null; 
		  String locationVal=null; 
		  String genderVal=null; 
		  int age_Val=0;
		
		  String empID="";
		  
			if(activeEmployeeInfo!=null){
				for (Object[] singleObjEmpInfo : activeEmployeeInfo) {
					
					
					 businessVal=singleObjEmpInfo[0].toString();
					  unitVal=singleObjEmpInfo[1].toString();
					  functionVal=singleObjEmpInfo[2].toString();
					  departmentVal=singleObjEmpInfo[3].toString();
					  designationVal=singleObjEmpInfo[4].toString();
					  productVal= singleObjEmpInfo[5].toString();
					  zoneVal=singleObjEmpInfo[6].toString();
					  gradeVal=singleObjEmpInfo[7].toString();
					  regionVal=singleObjEmpInfo[8].toString();
					  branchVal=singleObjEmpInfo[9].toString();
					  locationVal= singleObjEmpInfo[10].toString();
					  if(singleObjEmpInfo[11]!=null){
						  genderVal=singleObjEmpInfo[11].toString();
					  }
					 

					  empID=singleObjEmpInfo[16].toString();
				}
			}
		  String notApplicable="N.A";
		//Condition to Match in PeronalisedContent for  All USer
			List<Object[]> contentForAllUserlist = trainingcalendarLocalServiceUtil
					.getContentBasedOnNotificationTypeAll(0, genderVal, businessVal, String.valueOf(age_Val));
			 for(Object obj: contentForAllUserlist){
				  
				 finalList.add(Long.parseLong(obj.toString()));
			 }
			//Condition to Match in PeronalisedContent for  Intended USer
			  //Unit Match
			  if((unitVal != null && !unitVal.isEmpty() && !unitVal.equals(notApplicable))){
			List<Object[]> contentForUnitIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeUnit(1, genderVal, businessVal, unitVal, String.valueOf(age_Val));
			for(Object objUnit: contentForUnitIntendedUserlist){
				finalList.add(Long.parseLong(objUnit.toString())); 
			  }
			  }
			  
			  //Function Match
			  if((functionVal != null && !functionVal.isEmpty() && !functionVal.equals(notApplicable))){
				  List<Object[]> contentForFunctionIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeFunction(1, genderVal, businessVal, functionVal, String.valueOf(age_Val));
					for(Object objFunction: contentForFunctionIntendedUserlist){
						finalList.add(Long.parseLong(objFunction.toString())); 
					}
			  }
			  
			  //Department Match
			  if((departmentVal != null && !departmentVal.isEmpty() && !departmentVal.equals(notApplicable))){
				  List<Object[]> contentForDepartmentIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeDepartment(1, genderVal, businessVal, departmentVal, String.valueOf(age_Val));
					for(Object objDepartment: contentForDepartmentIntendedUserlist){
						finalList.add(Long.parseLong(objDepartment.toString())); 
						}
			  }
			  
			  //Designation Match
			  if((designationVal != null && !designationVal.isEmpty() && !designationVal.equals(notApplicable))){
				  List<Object[]> contentForDesignationIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeDesignation(1, genderVal, businessVal, designationVal, String.valueOf(age_Val));
					for(Object objDesignation: contentForDesignationIntendedUserlist){
						finalList.add(Long.parseLong(objDesignation.toString())); 
					  }
			  }
			  
			  //Product Match
			  if((productVal != null && !productVal.isEmpty() && !productVal.equals(notApplicable))){
				  List<Object[]> contentForProductIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeProduct(1, genderVal, businessVal, productVal, String.valueOf(age_Val));
					for(Object objProduct: contentForProductIntendedUserlist){
						finalList.add(Long.parseLong(objProduct.toString())); 
					  }
			  }
			  
			  //Zone Match
			  if((zoneVal != null && !zoneVal.isEmpty() && !zoneVal.equals(notApplicable))){
				  List<Object[]> contentForZoneIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeZone(1, genderVal, businessVal, zoneVal, String.valueOf(age_Val));
					for(Object objZone: contentForZoneIntendedUserlist){
						finalList.add(Long.parseLong(objZone.toString())); 
					  }
			  }
			  
			  //Grade Match
			  if((gradeVal != null && !gradeVal.isEmpty() && !gradeVal.equals(notApplicable))){
				  List<Object[]> contentForGradeIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeGrade(1, genderVal, businessVal, gradeVal, String.valueOf(age_Val));
					for(Object objGrade: contentForGradeIntendedUserlist){
						finalList.add(Long.parseLong(objGrade.toString())); 
					  }
			  }
			  
			  //Region Match
			  if((regionVal != null && !regionVal.isEmpty() && !regionVal.equals(notApplicable))){
				  List<Object[]> contentForRegionIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeRegion(1, genderVal, businessVal, regionVal, String.valueOf(age_Val));
					for(Object objRegion: contentForRegionIntendedUserlist){
						finalList.add(Long.parseLong(objRegion.toString())); 
					  }
			  }
			  
			  //Branch Match
			  if((branchVal != null && !branchVal.isEmpty() && !branchVal.equals(notApplicable))){
				  List<Object[]> contentForBranchIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeBranch(1, genderVal, businessVal, branchVal, String.valueOf(age_Val));
					for(Object objBranch: contentForBranchIntendedUserlist){
						finalList.add(Long.parseLong(objBranch.toString())); 
					  }
			  }
			  
			  //Location Match
			  if((locationVal != null && !locationVal.isEmpty() && !locationVal.equals(notApplicable))){
				  List<Object[]> contentForLocationIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeLocation(1, genderVal, businessVal, locationVal, String.valueOf(age_Val));
					for(Object objLocation: contentForLocationIntendedUserlist){
						finalList.add(Long.parseLong(objLocation.toString())); 
					  }
			  }
		//Condition to Match in PeronalisedContent based on userId
			 List<Object[]> contentForUserIdBasedlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeUserId(2, businessVal, empID);
			  
			  for(Object objUserId: contentForUserIdBasedlist){
				  finalList.add(Long.parseLong(objUserId.toString()));
				  }
			  
			  logger.info("Final Intended Content Id List : "+finalList);
			  return finalList;
	}catch (Exception e) {
		logger.error(e.getMessage());
		return null;
	}
	}
}
