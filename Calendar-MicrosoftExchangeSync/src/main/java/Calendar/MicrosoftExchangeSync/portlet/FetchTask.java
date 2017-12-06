/*package Calendar.MicrosoftExchangeSync.portlet;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.portlet.ActionRequest;
import microsoft.exchange.webservices.data.core.ExchangeService;
import microsoft.exchange.webservices.data.core.PropertySet;
import microsoft.exchange.webservices.data.core.enumeration.misc.ExchangeVersion;
import microsoft.exchange.webservices.data.core.enumeration.property.DefaultExtendedPropertySet;
import microsoft.exchange.webservices.data.core.enumeration.property.MapiPropertyType;
import microsoft.exchange.webservices.data.core.enumeration.property.WellKnownFolderName;
import microsoft.exchange.webservices.data.core.enumeration.service.SendInvitationsMode;
import microsoft.exchange.webservices.data.core.exception.misc.ArgumentOutOfRangeException;
import microsoft.exchange.webservices.data.core.exception.service.local.ServiceLocalException;
import microsoft.exchange.webservices.data.core.service.folder.CalendarFolder;
import microsoft.exchange.webservices.data.core.service.item.Appointment;
import microsoft.exchange.webservices.data.core.service.item.Item;
import microsoft.exchange.webservices.data.core.service.item.Task;
import microsoft.exchange.webservices.data.core.service.schema.AppointmentSchema;
import microsoft.exchange.webservices.data.credential.ExchangeCredentials;
import microsoft.exchange.webservices.data.credential.WebCredentials;
import microsoft.exchange.webservices.data.property.complex.MessageBody;
import microsoft.exchange.webservices.data.property.definition.ExtendedPropertyDefinition;
import microsoft.exchange.webservices.data.search.CalendarView;
import microsoft.exchange.webservices.data.search.FindItemsResults;
import microsoft.exchange.webservices.data.search.ItemView;
import microsoft.exchange.webservices.data.search.filter.SearchFilter;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class FetchTask {
	private static ExchangeService service;
	private static final Log _log = LogFactoryUtil.getLog(FetchTask.class);
public FetchTask(String url,String username,String pass) {
	try{
		
		service = new ExchangeService(ExchangeVersion.Exchange2010); //depending on the version of your Exchange. 
        service.setUrl(new URI(url));
        ExchangeCredentials credentials = new WebCredentials(username, pass);
        service.setCredentials(credentials);
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    		_log.error("Not able to access Microsoft Exchange Server with logged in username and password");
    	}
}
	
		public static void main(String[] args) throws Exception {
		    String input = "Thu Apr 20 04:30:00 GMT 2017";
		    DateFormat inputFormat = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		    Date date = inputFormat.parse(input);

		    DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		   
		    

		    String output = outputFormat.format(date);
		    _log.info(output);
		    
		    String serviceURL="https://mail.murugappa.com/ews/Exchange.asmx";
			String domain="@cholamandalam.com";
			String userName="visuks"+domain;
			String pass="welcome@123";
			FetchTask ft=new FetchTask(serviceURL, userName, pass);
			ft.createAppointment("demo", "demo", "2017-05-22 09:30:00", "2017-05-22 11:00:00", null);
		  }
		
		public static boolean createAppointment(String subject,String body,List<String> attendees,String startDate,String endDate,ActionRequest actionRequest) throws ArgumentOutOfRangeException, ServiceLocalException, Exception{
			
			try{
				System.out.println("In Create Appointment Module");
				
				if(attendees!=null){
					Appointment appointment = new Appointment(service);
					appointment.setSubject(subject);
					appointment.setBody(MessageBody.getMessageBodyFromText(body));
					
					for(int i=0;i<attendees.size();i++){
						System.out.println("Email Id : "+attendees.get(i).replaceAll("^\"|\"$", ""));
						appointment.getRequiredAttendees().add(attendees.get(i).replaceAll("^\"|\"$", ""));
					}
				
					
					System.out.println(startDate);
					System.out.println(endDate);
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
					Date startDate1 = formatter.parse(startDate.replace("/", "-"));
					Date endDate1 = formatter.parse(endDate.replace("/", "-"));

					appointment.setStart(startDate1);//new Date(2010-1900,5-1,20,20,00));
					appointment.setEnd(endDate1); //new Date(2010-1900,5-1,20,21,00));

					//Date recurrenceEndDate = formatter.parse("2010-07-20");

					//appointment.setRecurrence(new Recurrence.DailyPattern(appointment.getStart(), 3));

					//appointment.getRecurrence().setStartDate(appointment.getStart());
					//appointment.getRecurrence().setEndDate(recurrenceEndDate);
					appointment.save(SendInvitationsMode.SendToAllAndSaveCopy);
					//appointment.save();
					
					return true;
				}else{
					
					
					Appointment appointment = new Appointment(service);
					appointment.setSubject(subject);
					appointment.setBody(MessageBody.getMessageBodyFromText(body));
					
					String[] attendees={"mohit.mehral@cloverinfotech.cm","ashish.singh@cloverinfotech.com"};
					for(int i=0;i<attendees.length;i++){
						appointment.getRequiredAttendees().add(attendees[i]);
					}
					
					
					System.out.println(startDate);
					System.out.println(endDate);
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
					Date startDate1 = formatter.parse(startDate.replace("/", "-"));
					Date endDate1 = formatter.parse(endDate.replace("/", "-"));

					appointment.setStart(startDate1);//new Date(2010-1900,5-1,20,20,00));
					appointment.setEnd(endDate1); //new Date(2010-1900,5-1,20,21,00));

					//Date recurrenceEndDate = formatter.parse("2010-07-20");

					//appointment.setRecurrence(new Recurrence.DailyPattern(appointment.getStart(), 3));

					//appointment.getRecurrence().setStartDate(appointment.getStart());
					//appointment.getRecurrence().setEndDate(recurrenceEndDate);
					//appointment.save(SendInvitationsMode.SendToAllAndSaveCopy);
					appointment.save();
					return true;
				}

			}
			catch (Exception e) {
				e.printStackTrace();
				_log.error("Not able to access Microsoft Exchange Server with logged in username and password");
				return false;
				
			}
			
		}
	    public static boolean createTask(String subject,String body,String startDate,String endDate,ActionRequest actionRequest) throws Exception{
	    	try{
	    	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	         Date startTime = dateFormat.parse(startDate.replace("/", "-"));
	         Date endTime = dateFormat.parse(endDate.replace("/","-"));
	    	Task t=new Task(service);
	    	
	    	t.setSubject(subject);
	    	t.setBody(MessageBody.getMessageBodyFromText(body));
	    	t.setStartDate(startTime);
	    	t.setDueDate(endTime);
	    	t.save();
	    	_log.info("success");
	    	return true;
	    	}catch (Exception e) {
	    		e.printStackTrace();
	    		_log.error("Not able to access Microsoft Exchange Server with logged in username and password");
				return false;
			}
	    }
		
	    public static List<Task> readTask() throws Exception{
	    	//Create the extended property definition.
	    	List apntmtDataList = new ArrayList ();
	    	 try {
	    	Task t=new Task(service);
	    	ExtendedPropertyDefinition taskCompleteProp = new ExtendedPropertyDefinition(DefaultExtendedPropertySet.Task, 0x0000811C, MapiPropertyType.Boolean);
	    	SearchFilter.IsEqualTo filter = new SearchFilter.IsEqualTo(taskCompleteProp, false);                    
	    
	    	FindItemsResults<Item> tasks = service.findItems(WellKnownFolderName.Tasks, filter, new ItemView(50));
	    	service.loadPropertiesForItems(tasks.getItems(), new PropertySet());
	    	
	    	for(Item task:tasks){
	    		task.load();
	    		Task tde=(Task) task;
	    		_log.info(tde.getSubject());
	    		_log.info(tde.getBody());
	    		_log.info(tde.getStartDate());
	    		_log.info(tde.getDueDate());
	    		apntmtDataList.add(tde);
	    	}
	        } catch (Exception e) {
	        	e.printStackTrace();
	        	_log.error("Not able to access Microsoft Exchange Server with logged in username and password");
	       return null;
	        }
	    	return apntmtDataList;
	    }
		
	    public static List<Map>  readAppointments() {
	        List apntmtDataList = new ArrayList ();
	        Calendar now = Calendar.getInstance();
	        Date startDate = Calendar.getInstance().getTime();
	        now.add(Calendar.DATE, 30);
	        Date endDate = now.getTime();
	        try {
	            CalendarFolder calendarFolder = CalendarFolder.bind(service, WellKnownFolderName.Calendar, new PropertySet());
	            CalendarView cView = new CalendarView(startDate, endDate, 5);
	            cView.setPropertySet(new PropertySet(AppointmentSchema.Subject, AppointmentSchema.Start, AppointmentSchema.End));// we can set other properties 
	            // as well depending upon our need.
	            FindItemsResults<Appointment> appointments = calendarFolder.findAppointments(cView);
	            int i = 1;
	            ArrayList<Appointment> appList = appointments.getItems();
	            for (Appointment appointment : appList) {
	                Map appointmentData = new HashMap();
	                appointmentData = readAppointment(appointment);
	                //_log.info("subject : " + appointmentData.get("appointmentSubject").toString());
	                //_log.info("On : " + appointmentData.get("appointmentStartTime").toString());
	                apntmtDataList.add(appointmentData);
	            }
	        } catch (Exception e) {
	        	e.printStackTrace();
	        	_log.error("Not able to access Microsoft Exchange Server with logged in username and password");
	        	return null;
	        }
	        return apntmtDataList;
	    }	
	    
	    public static Map readAppointment(Appointment appointment) {
	        Map appointmentData = new HashMap();
	        try {
	            appointmentData.put("appointmentItemId", appointment.getId().toString());
	            appointmentData.put("appointmentSubject", appointment.getSubject());
	            appointmentData.put("appointmentStartTime", appointment.getStart() + "");
	            appointmentData.put("appointmentEndTime", appointment.getEnd() + "");
	        } catch (ServiceLocalException e) {
	        	_log.error("Not able to access Microsoft Exchange Server with logged in username and password");
	        	return null;
	        }
	        return appointmentData;
	    }
		
	
public static List<Task> fetchTaskList(String serviceURL,String userName,String pass){

	  try
      {
         // Service service = new Service("https://myserver/ews/Exchange.asmx", "username", "password");
          //https://mail.murugappa.com/ews
      
          Service service = new Service(serviceURL, userName , pass);
        // IsEqualTo restriction = new IsEqualTo(TaskPropertyPath, true);
         // _log.info(restriction);
          
         // IsEqualTo restriction = new IsEqualTo(TaskPropertyPath.IS_COMPLETE, true);

          //FindItemResponse response = service.findItem(StandardFolder.TASKS, TaskPropertyPath.getAllPropertyPaths(), restriction);

        FindItemResponse response = service.findItem(StandardFolder.TASKS, TaskPropertyPath.getAllPropertyPaths());

_log.info(response.getItems().size());

List<Task> tl=new ArrayList<Task>();
          for (int i = 0; i < response.getItems().size(); i++)
          {
       
              if (response.getItems().get(i) instanceof Task)
              {

                  Task task = (Task) response.getItems().get(i);
                  tl.add(task);
                  _log.info("Subject = " + task.getSubject());
                  _log.info("StartDate = " + task.getStartDate());
                  _log.info("DueDate = " + task.getDueDate());
                  _log.info("Owner = " + task.getOwner());
                  _log.info("Body Preview = " + task.getBodyPlainText());
                  _log.info("----------------------------------------------------------------");
              }
          }
          
          return tl;
      }
      catch (Exception e)
      {
    	  e.printStackTrace();
         }

return null;
	}

public static boolean createTask(String subject,String body,String startDate,String endDate,ActionRequest actionRequest) throws ParseException{
	boolean isCreated=false;
	
	 try
     {
		 ThemeDisplay themeDisplay=(ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			HttpServletRequest request = PortalUtil.getHttpServletRequest(
					actionRequest);

			String password = com.liferay.util.CookieUtil.get(request, "pwd");
			
			_log.info("Cookie Value :  "+password);

			String domain="@cholamandalam.com";
			
			User particularUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
			String userScreenName=particularUser.getScreenName();
		 
		 
		  Service service = new Service("https://mail.murugappa.com/ews/Exchange.asmx", "v481@cholamandalam.com" , "welcome*123456");

         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
         Date startTime = dateFormat.parse(startDate);
         Date endTime = dateFormat.parse(endDate);

         Task task = new Task();
         task.setSubject(subject);
         task.setBody(new Body(body));
         task.setOwner("Dummy");
         task.setStartDate(startTime);
         task.setDueDate(endTime);
         task.setReminderIsSet(true);
         task.setReminderDueBy(startTime);
         

         ItemId itemId = service.createItem(task);
         
         _log.info("Hello World" +itemId.getId().toString());
         
         if(itemId.getId()!=null){
        	 isCreated=true;
         }
     return isCreated;
     }
     catch (Exception e)
     {
         e.printStackTrace();
     return isCreated;
     }
}

}
*/