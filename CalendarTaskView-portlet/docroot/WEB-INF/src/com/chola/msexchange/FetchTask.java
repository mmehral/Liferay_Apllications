package com.chola.msexchange;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import javax.portlet.ActionRequest;

import microsoft.exchange.webservices.data.core.ExchangeService;
import microsoft.exchange.webservices.data.core.PropertySet;
import microsoft.exchange.webservices.data.core.enumeration.misc.ExchangeVersion;
import microsoft.exchange.webservices.data.core.enumeration.property.DefaultExtendedPropertySet;
import microsoft.exchange.webservices.data.core.enumeration.property.MapiPropertyType;
import microsoft.exchange.webservices.data.core.enumeration.property.WellKnownFolderName;
import microsoft.exchange.webservices.data.core.enumeration.service.ConflictResolutionMode;
import microsoft.exchange.webservices.data.core.enumeration.service.DeleteMode;
import microsoft.exchange.webservices.data.core.enumeration.service.SendCancellationsMode;
import microsoft.exchange.webservices.data.core.enumeration.service.SendInvitationsMode;
import microsoft.exchange.webservices.data.core.enumeration.service.SendInvitationsOrCancellationsMode;
import microsoft.exchange.webservices.data.core.exception.misc.ArgumentOutOfRangeException;
import microsoft.exchange.webservices.data.core.exception.service.local.ServiceLocalException;
import microsoft.exchange.webservices.data.core.service.folder.CalendarFolder;
import microsoft.exchange.webservices.data.core.service.item.Appointment;
import microsoft.exchange.webservices.data.core.service.item.Item;
import microsoft.exchange.webservices.data.core.service.item.Task;
import microsoft.exchange.webservices.data.core.service.schema.AppointmentSchema;
import microsoft.exchange.webservices.data.credential.ExchangeCredentials;
import microsoft.exchange.webservices.data.credential.WebCredentials;
import microsoft.exchange.webservices.data.property.complex.ItemId;
import microsoft.exchange.webservices.data.property.complex.MessageBody;
import microsoft.exchange.webservices.data.property.complex.time.TimeZoneDefinition;
import microsoft.exchange.webservices.data.property.definition.ExtendedPropertyDefinition;
import microsoft.exchange.webservices.data.search.CalendarView;
import microsoft.exchange.webservices.data.search.FindItemsResults;
import microsoft.exchange.webservices.data.search.ItemView;
import microsoft.exchange.webservices.data.search.filter.SearchFilter;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;


public class FetchTask {
	private static microsoft.exchange.webservices.data.core.ExchangeService service;
	private static final Log _log = LogFactoryUtil.getLog(FetchTask.class);

	public FetchTask(String url, String username, String pass) {
		try {
			service = new ExchangeService(ExchangeVersion.Exchange2010); // depending on the version of your Exchange.
			service.setUrl(new URI(url));
			ExchangeCredentials credentials = new WebCredentials(username, pass);
			service.setCredentials(credentials);
		} catch (Exception e) {
			_log.error(e.getMessage());
			_log.error("Not able to access Microsoft Exchange Server with logged in username and password");
		}
	}

	public static void main(String[] args) throws Exception {
		
	}
	
	public static String checkConnection(String url, String username, String pass){
		
	
			try {
				/*service = new ExchangeService(ExchangeVersion.Exchange2010); // depending on the version of your Exchange.
				service.setUrl(new URI(url));
				ExchangeCredentials credentials = new WebCredentials(username, pass);
				service.setCredentials(credentials);*/
				
				ExtendedPropertyDefinition taskCompleteProp = new ExtendedPropertyDefinition(
						DefaultExtendedPropertySet.Task, 0x0000811C, MapiPropertyType.Boolean);
				
				SearchFilter.IsEqualTo filter = new SearchFilter.IsEqualTo(taskCompleteProp, false);
				FindItemsResults<Item> tasks = service.findItems(WellKnownFolderName.Tasks, filter, new ItemView(15));
				
				_log.info("Connection Successful!!!");
				
				return "true";
			}  catch (Exception e) {
				//e.printStackTrace();
			_log.error(e.getMessage());
			return "false";
		}
		
	}

	public static boolean createAppointment(String subject, String body, List<String> attendees, String startDate,
			String endDate, ActionRequest actionRequest)
			throws ArgumentOutOfRangeException, ServiceLocalException, Exception {

		try {
			_log.info("In Create Appointment Module");

			if (attendees != null) {
				
				
				Collection<TimeZoneDefinition> timeZoneDefinitions = service.getServerTimeZones();
				TimeZoneDefinition timeZoneDefinition = null;
				
				for (TimeZoneDefinition tzd : timeZoneDefinitions) {
					_log.info(tzd.getId());
				    if (tzd.getId().equals("India Standard Time")) {
				        timeZoneDefinition = tzd;
				        break;
				    }
				  
				}
				
				
				Appointment appointment = new Appointment(service);
				appointment.setSubject(subject);
				appointment.setBody(MessageBody.getMessageBodyFromText(body));

				for (int i = 0; i < attendees.size(); i++) {
					_log.info("Email Id : " + attendees.get(i).replaceAll("^\"|\"$", ""));
					appointment.getRequiredAttendees().add(attendees.get(i).replaceAll("^\"|\"$", ""));
				}

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				java.util.Date startDateFormat = new Date(startDate);
				java.util.Date endDateFormat = new Date(endDate);
				String stringStart = sdf.format(startDateFormat);
				String stringEnd = sdf.format(endDateFormat);
				_log.info("Start Date after converting from hh:mm to HH:mm:ss : "+stringStart);
				
				
				
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
				Date startDate1 = formatter.parse(stringStart.replace("/", "-"));
				Date endDate1 = formatter.parse(stringEnd.replace("/", "-"));

				_log.info("Start Date in create Appointment : "+stringStart);
				_log.info("End Date in create Appointment : "+stringEnd);				
				
				appointment.setStart(startDate1);// new
				
				appointment.setStartTimeZone(timeZoneDefinition);
				appointment.setEnd(endDate1); // new
				appointment.setEndTimeZone(timeZoneDefinition);
				appointment.save(SendInvitationsMode.SendToAllAndSaveCopy);

				return true;
			} else {

				Appointment appointment = new Appointment(service);
				appointment.setSubject(subject);
				appointment.setBody(MessageBody.getMessageBodyFromText(body));
				_log.info(startDate);
				_log.info(endDate);
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
				Date startDate1 = formatter.parse(startDate.replace("/", "-"));
				Date endDate1 = formatter.parse(endDate.replace("/", "-"));

				appointment.setStart(startDate1);// new
				appointment.setEnd(endDate1); // new
				appointment.save();
				return true;
			}

		} catch (Exception e) {
			_log.error(e.getMessage());
			_log.error("Not able to access Microsoft Exchange Server with logged in username and password");
			return false;

		}

	}

	public static boolean createTask(String subject, String body, String startDate, String endDate,
			ActionRequest actionRequest) throws Exception {
		try {

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
			dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
			Date startTime = dateFormat.parse(startDate.replace("/", "-"));
			Date endTime = dateFormat.parse(endDate.replace("/", "-"));
			Task t = new Task(service);
			
			_log.info("Start Date in create Task : "+startTime);
			_log.info("End Date in create Task : "+startTime);
			
			t.setSubject(subject);
			t.setBody(MessageBody.getMessageBodyFromText(body));
			t.setStartDate(startTime);
			t.setDueDate(endTime);
			t.save();
			_log.info("success");
			return true;
		} catch (Exception e) {
			_log.error(e.getMessage());
			_log.error("Not able to access Microsoft Exchange Server with logged in username and password");
			return false;
		}
	}

	public static List<Task> readTask() throws Exception {
		// Create the extended property definition.
		List apntmtDataList = new ArrayList();
		try {
			
			ExtendedPropertyDefinition taskCompleteProp = new ExtendedPropertyDefinition(
					DefaultExtendedPropertySet.Task, 0x0000811C, MapiPropertyType.Boolean);
			
			SearchFilter.IsEqualTo filter = new SearchFilter.IsEqualTo(taskCompleteProp, false);
			FindItemsResults<Item> tasks = service.findItems(WellKnownFolderName.Tasks, filter, new ItemView(15));
			
			if(tasks.getItems()!=null){

				for (Item task : tasks) {
					task.load();
					Task tde = (Task) task;
					_log.info(task.getId());
					_log.info(tde.getSubject());
					_log.info(tde.getBody());
					_log.info(tde.getStartDate());
					_log.info(tde.getDueDate());
					apntmtDataList.add(tde);
				}
				
				return apntmtDataList;
			}else{
			
			return null;
			}
		} catch (Exception e) {
			//e.printStackTrace();
			_log.error(e.getMessage());
			_log.error("Not able to access Microsoft Exchange Server with logged in username and password");
			return null;
		}
		
	}

	public static List<Map> readAppointments() {
		List apntmtDataList = new ArrayList();
		Calendar now = Calendar.getInstance();
		Date startDate = Calendar.getInstance().getTime();
		now.add(Calendar.DATE, 30);
		Date endDate = now.getTime();
		try {
			CalendarFolder calendarFolder = CalendarFolder.bind(service, WellKnownFolderName.Calendar,
					new PropertySet());
			CalendarView cView = new CalendarView(startDate, endDate, 5);
			cView.setPropertySet(
					new PropertySet(AppointmentSchema.Subject, AppointmentSchema.Start, AppointmentSchema.End));// we
																												// can
																												// set
																												// other
																												// properties
			// as well depending upon our need.
			FindItemsResults<Appointment> appointments = calendarFolder.findAppointments(cView);
			int i = 1;
			ArrayList<Appointment> appList = appointments.getItems();
			for (Appointment appointment : appList) {
				Map appointmentData = new HashMap();
				appointmentData = readAppointment(appointment);
				apntmtDataList.add(appointmentData);
			}
		} catch (Exception e) {
			_log.error(e.getMessage());
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
		} catch (Exception e) {
			_log.error(e.getMessage());
			_log.error("Not able to access Microsoft Exchange Server with logged in username and password");
			return null;
		}
		return appointmentData;
	}

	public static List<Task> readParticularTask(String id) throws Exception {
		List apntmtDataList = new ArrayList();
		ItemId itemId = new ItemId(id);

		Item item = Item.bind(service, itemId);
		item.load();
		_log.info("Inside readParticularTask method : : : : : : ");
		_log.info(item.getSubject());
		_log.info(item.getBody());
		_log.info(((Task) item).getStartDate());
		_log.info(((Task) item).getDueDate());

		Task task = Task.bind(service, itemId);

		apntmtDataList.add(task);
		return apntmtDataList;

	}

	public static String deleteTask(String taskId) throws Exception {
		try {
			ItemId itemId = new ItemId(taskId);

			Task task = Task.bind(service, itemId);
			task.delete(DeleteMode.SoftDelete);

			return "Success";
		} catch (Exception e) {
			_log.error(e.getMessage());
			return "Error";
		}

	}

	public static String updateTask(String taskId, String taskSubject, String taskBody, String taskStartDate,
			String taskDueDate) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
			dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
			Date startTime = dateFormat.parse(taskStartDate.replace("/", "-"));
			Date endTime = dateFormat.parse(taskDueDate.replace("/", "-"));

			_log.info("Start Date in update Task : "+startTime);
			_log.info("End Date in update Task : "+startTime);
			
			ItemId itemId = new ItemId(taskId);
			Task task = Task.bind(service, itemId);

			task.setSubject(taskSubject);
			task.setBody(MessageBody.getMessageBodyFromText(taskBody));
			task.setStartDate(startTime);
			task.setDueDate(endTime);

			task.update(ConflictResolutionMode.AutoResolve);

			return "Success";

		} catch (Exception e) {
			_log.error(e.getMessage());
			return "Error";
		}

	}

	public static List<Appointment> readParticularAppointment(String appointmentId) throws Exception {

		List apntmtDataList = new ArrayList();

		ItemId itemId = new ItemId(appointmentId);
		Appointment app = Appointment.bind(service, itemId);
		_log.info("Inside readParticularAppointment method : : : : : : ");
		_log.info(app.getSubject());
		_log.info(app.getBody());
		_log.info(app.getRequiredAttendees());
		_log.info(((Appointment) app).getStart());
		_log.info(((Appointment) app).getEnd());

		apntmtDataList.add(app);

		return apntmtDataList;
	}

	public String deleteAppointment(String taskId) {
		try {
			ItemId itemId = new ItemId(taskId);

			Appointment app = Appointment.bind(service, itemId);
			app.delete(DeleteMode.SoftDelete, SendCancellationsMode.SendOnlyToAll);

			return "Success";
		} catch (Exception e) {
			_log.error(e.getMessage());
			return "Error";
		}
	}

	public String updateAppointment(String taskId, String taskSubject, String taskBody, List<String> emailIdsList,
			String taskStartDate, String taskDueDate) {

		try {

			_log.info("In update Appointment Module");
			ItemId itemId = new ItemId(taskId);
			Appointment appointment = Appointment.bind(service, itemId);
			
			appointment.getRequiredAttendees().clear();
			appointment.getOptionalAttendees().clear();
			
			if (emailIdsList != null) {

				appointment.setSubject(taskSubject);
				appointment.setBody(MessageBody.getMessageBodyFromText(taskBody));
				
				if(emailIdsList != null){
					for (int i = 0; i < emailIdsList.size(); i++) {
						_log.info("Email Id : " + emailIdsList.get(i).replaceAll("^\"|\"$", ""));
						appointment.getRequiredAttendees().add(emailIdsList.get(i).replaceAll("^\"|\"$", ""));
					}
				}
				
				_log.info(taskStartDate);
				_log.info(taskDueDate);
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
				formatter.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
				Date startDate1 = formatter.parse(taskStartDate.replace("/", "-"));
				Date endDate1 = formatter.parse(taskDueDate.replace("/", "-"));

				_log.info("Start Date in update Appointment : "+startDate1);
				_log.info("End Date in update Appointment : "+endDate1);	
				
				appointment.setStart(startDate1);// new
				appointment.setEnd(endDate1); // new

				appointment.update(ConflictResolutionMode.AutoResolve,SendInvitationsOrCancellationsMode.SendOnlyToAll);

				return "Success";
			} else {

				appointment.setSubject(taskSubject);
				appointment.setBody(MessageBody.getMessageBodyFromText(taskBody));

				_log.info(taskStartDate);
				_log.info(taskDueDate);
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
				Date startDate1 = formatter.parse(taskStartDate.replace("/", "-"));
				Date endDate1 = formatter.parse(taskDueDate.replace("/", "-"));

				appointment.setStart(startDate1);
				appointment.setEnd(endDate1);

				appointment.update(ConflictResolutionMode.AutoResolve,
						SendInvitationsOrCancellationsMode.SendOnlyToAll);
				return "Success";
			}

		} catch (Exception e) {
			_log.error(e.getMessage());
			return "Error";
		}
	}

}
