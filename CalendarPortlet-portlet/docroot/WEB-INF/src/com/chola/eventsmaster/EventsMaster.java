package com.chola.eventsmaster;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.catalina.connector.Request;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.chola.calendar.model.EmpInfoEntity;
import com.chola.calendar.model.eventcalendar;
import com.chola.calendar.service.EmpInfoEntityLocalServiceUtil;
import com.chola.calendar.service.dataLocalServiceUtil;
import com.chola.calendar.service.eventcalendarLocalServiceUtil;
import com.chola.calendar.service.impl.dataLocalServiceImpl;
import com.chola.calendar.service.persistence.eventcalendarFinder;
import com.chola.calendar.service.persistence.eventcalendarFinderUtil;
import com.chola.calendar.service.persistence.impl.eventcalendarPersistenceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserNotificationEventLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class EventsMaster
 */
public class EventsMaster extends MVCPortlet {

	public boolean isEmptyStringArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				return false;
			}
		}
		return true;
	}

	@SuppressWarnings("unused")
	public void addEventAction(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("--------------------------------------------------------------");

		String[] location = ParamUtil.getParameterValues(actionRequest, "location");
		String[] dept = ParamUtil.getParameterValues(actionRequest, "dept");
		String[] subdept = ParamUtil.getParameterValues(actionRequest, "subdept");
		String[] grade = ParamUtil.getParameterValues(actionRequest, "grade");

		String age_arr = ParamUtil.getString(actionRequest, "age");
		String lessthan_age = ParamUtil.getString(actionRequest, "lessthanvalue");
		String greaterthan_age = ParamUtil.getString(actionRequest, "greaterthanvalue");
		String between_from_age = ParamUtil.getString(actionRequest, "betweenfromvalue");
		String between_to_age = ParamUtil.getString(actionRequest, "betweentovalue");

		String[] companyname = ParamUtil.getParameterValues(actionRequest, "companyname");
		String[] userid = ParamUtil.getParameterValues(actionRequest, "userid");
		String gender_arr = ParamUtil.getString(actionRequest, "gender");
		String eventdetails = ParamUtil.getString(actionRequest, "eventdetails");
		String eventfrom = ParamUtil.getString(actionRequest, "eventfrom");
		String eventto = ParamUtil.getString(actionRequest, "eventto");

		List<eventcalendar> list = EmpInfoEntityLocalServiceUtil.customFinder("EID");

		for (eventcalendar evc : list) {
			System.out.println("NAME : " + evc.getName() + " - " + evc.getStartdate() + " - " + evc.getEnddate());
		}

		List<String> location_arr = Arrays.asList(location);
		location_arr.set(0, location_arr.get(0).replace("[", ""));
		location_arr.set(location_arr.size() - 1, location_arr.get(location_arr.size() - 1).replace("]", ""));
		// System.out.println("location_arr : "+(location_arr)+" - Size :
		// "+location_arr.size()+" - Length : "+location_arr.get(0).length());

		if (location_arr.size() == 1 && location_arr.get(0).length() == 0) {
			location = null;
			System.out.println("Location is Empty");
		} else {
			System.out.println("Location is not Empty");
		}

		List<String> dept_arr = Arrays.asList(dept);
		dept_arr.set(0, dept_arr.get(0).replace("[", ""));
		dept_arr.set(dept_arr.size() - 1, dept_arr.get(dept_arr.size() - 1).replace("]", ""));
		// System.out.println("dept_arr : "+(dept_arr)+" - Size :
		// "+dept_arr.size()+" - Length : "+dept_arr.get(0).length());

		if (dept_arr.size() == 1 && dept_arr.get(0).length() == 0) {
			dept = null;
			System.out.println("dept is Empty");
		} else {
			System.out.println("dept is not Empty");
		}

		List<String> subdept_arr = Arrays.asList(subdept);
		subdept_arr.set(0, subdept_arr.get(0).replace("[", ""));
		subdept_arr.set(subdept_arr.size() - 1, subdept_arr.get(subdept_arr.size() - 1).replace("]", ""));
		// System.out.println("subdept_arr : "+(subdept_arr)+" - Size :
		// "+subdept_arr.size()+" - Length : "+subdept_arr.get(0).length());

		if (subdept_arr.size() == 1 && subdept_arr.get(0).length() == 0) {
			subdept = null;
			System.out.println("subdept is Empty");
		} else {
			System.out.println("subdept is not Empty");
		}

		List<String> grade_arr = Arrays.asList(grade);
		grade_arr.set(0, grade_arr.get(0).replace("[", ""));
		grade_arr.set(grade_arr.size() - 1, grade_arr.get(grade_arr.size() - 1).replace("]", ""));
		// System.out.println("grade_arr : "+(grade_arr)+" - Size :
		// "+grade_arr.size()+" - Length : "+grade_arr.get(0).length());

		if (grade_arr.size() == 1 && grade_arr.get(0).length() == 0) {
			grade = null;
			System.out.println("grade is Empty");
		} else {
			System.out.println("grade is not Empty");
		}

		if (age_arr.equalsIgnoreCase("all")) {
			System.out.println("age : " + age_arr);
		} else if (age_arr.equalsIgnoreCase("lessthan")) {
			age_arr = "Less than " + lessthan_age;
			System.out.println("age : " + age_arr);
		} else if (age_arr.equalsIgnoreCase("greaterthan")) {
			age_arr = "Greater than " + greaterthan_age;
			System.out.println("age : " + age_arr);
		} else if (age_arr.equalsIgnoreCase("between")) {
			age_arr = "Between " + between_from_age + " to " + between_to_age;
			System.out.println("age : " + age_arr);
		}

		String age[] = new String[1];
		if (age_arr.length() >= 1) {
			age[0] = age_arr;
			System.out.println("Age : " + age.toString());
		} else {
			age = null;
			System.out.println("Age is Empty");
		}

		List<String> companyname_arr = Arrays.asList(companyname);
		companyname_arr.set(0, companyname_arr.get(0).replace("[", ""));
		companyname_arr.set(companyname_arr.size() - 1,
				companyname_arr.get(companyname_arr.size() - 1).replace("]", ""));
		// System.out.println("companyname_arr : "+(companyname_arr)+" - Size :
		// "+companyname_arr.size()+" - Length :
		// "+companyname_arr.get(0).length());

		if (companyname_arr.size() == 1 && companyname_arr.get(0).length() == 0) {
			companyname = null;
			System.out.println("companyname is Empty");
		} else {
			System.out.println("companyname is not Empty");
		}

		List<String> userid_arr = Arrays.asList(userid);
		userid_arr.set(0, userid_arr.get(0).replace("[", ""));
		userid_arr.set(userid_arr.size() - 1, userid_arr.get(userid_arr.size() - 1).replace("]", ""));
		// System.out.println("userid_arr : "+(userid_arr)+" - Size :
		// "+userid_arr.size()+" - Length : "+userid_arr.get(0).length());

		if (userid_arr.size() == 1 && userid_arr.get(0).length() == 0) {
			userid = null;
			System.out.println("userid is Empty");
		} else {
			System.out.println("userid is not Empty");
		}

		String gender[];
		if (!(gender_arr.equalsIgnoreCase("") || gender_arr == null)) {
			gender = gender_arr.split(",");

			if (gender.length >= 1) {
				System.out.println("Gender : " + gender.toString());
			}
		} else {
			gender = null;
			System.out.println("gender is Empty");
		}

		System.out.println("eventdetails : " + eventdetails);
		System.out.println("eventfrom : " + eventfrom);
		System.out.println("eventto : " + eventto);

		if (location == null && dept == null && subdept == null && gender == null && grade == null && age == null
				&& companyname == null && userid == null) {
			// all users will receive notification
			System.out.println("All Parameters are null");
		}

		if (location != null && dept != null && subdept != null && gender != null && grade != null && age != null
				&& companyname != null && userid != null) {
			// all users will receive notification
			System.out.println("All Parameters are filled ");
		}

		if (location != null && dept == null && subdept == null && gender == null && grade == null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Location");
		}
		if (location == null && dept != null && subdept == null && gender == null && grade == null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Department");
		}
		if (location == null && dept == null && subdept != null && gender == null && grade == null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for SubDepartment");
		}
		if (location == null && dept == null && subdept == null && gender != null && grade == null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Gender");
		}
		if (location == null && dept == null && subdept == null && gender == null && grade != null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Grade");
		}
		if (location == null && dept != null && subdept == null && gender == null && grade == null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for age group");
		}
		if (location == null && dept == null && subdept == null && gender == null && grade == null && age == null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for Company");
		}
		if (location == null && dept == null && subdept == null && gender == null && grade == null && age == null
				&& companyname == null && userid != null) {
			System.out.println("All Users  -  Only for Users");
		}

		// Two Parameters (Location)

		if (location != null && dept != null && subdept == null && gender == null && grade == null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Location and Department");
		}
		if (location != null && dept == null && subdept != null && gender == null && grade == null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Location and SubDepartment");
		}
		if (location != null && dept == null && subdept == null && gender != null && grade == null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Location and gender");
		}
		if (location != null && dept == null && subdept == null && gender == null && grade != null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Location and grade");
		}
		if (location != null && dept == null && subdept == null && gender == null && grade == null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Location and Age");
		}
		if (location != null && dept == null && subdept == null && gender == null && grade == null && age == null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for Location and Company ");
		}
		if (location != null && dept == null && subdept == null && gender == null && grade == null && age == null
				&& companyname == null && userid != null) {
			System.out.println("All Users  -  Only for Location and Users");
		}

		// Two Parameters (Department)

		if (location == null && dept != null && subdept != null && gender == null && grade == null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Department and SubDepartment");
		}
		if (location == null && dept != null && subdept == null && gender != null && grade == null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Department and Gender");
		}
		if (location == null && dept != null && subdept == null && gender == null && grade != null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Department and Grade");
		}
		if (location == null && dept != null && subdept == null && gender == null && grade == null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Department and age");
		}
		if (location == null && dept != null && subdept == null && gender == null && grade == null && age == null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for Department and company");
		}
		if (location == null && dept != null && subdept == null && gender == null && grade == null && age == null
				&& companyname == null && userid != null) {
			System.out.println("All Users  -  Only for Department and Users");
		}

		// Two Parameters (SubDepartment)

		if (location == null && dept == null && subdept != null && gender != null && grade == null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for SubDepartment and Gender");
		}
		if (location == null && dept == null && subdept != null && gender == null && grade != null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for SubDepartment and grade");
		}
		if (location == null && dept == null && subdept != null && gender == null && grade == null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for SubDepartment and age");
		}
		if (location == null && dept == null && subdept != null && gender == null && grade == null && age == null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for SubDepartment and company");
		}
		if (location == null && dept == null && subdept != null && gender == null && grade == null && age == null
				&& companyname == null && userid != null) {
			System.out.println("All Users  -  Only for SubDepartment and users");
		}

		// Two Parameters (Gender)

		if (location == null && dept == null && subdept == null && gender != null && grade != null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Gender and Grade");
		}
		if (location == null && dept == null && subdept == null && gender != null && grade == null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Gender and Age");
			System.out.println("Gender : " + gender);
			System.out.println("Age : " + age);

			List user_id = EmpInfoEntityLocalServiceUtil.twoParams(gender, age);

			System.out.println("Final List :" + user_id.toString());
		}
		if (location == null && dept == null && subdept == null && gender != null && grade == null && age == null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for Gender and Company");
		}
		if (location == null && dept == null && subdept == null && gender != null && grade == null && age == null
				&& companyname == null && userid != null) {
			System.out.println("All Users  -  Only for Gender and Users");
		}

		// Two Parameters (Grade)

		if (location == null && dept == null && subdept == null && gender == null && grade != null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Grade and Age");
		}
		if (location == null && dept == null && subdept == null && gender == null && grade != null && age == null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for Grade and Company");
		}
		if (location == null && dept == null && subdept == null && gender == null && grade != null && age == null
				&& companyname == null && userid != null) {
			System.out.println("All Users  -  Only for Grade and Users");
		}

		// Three Parameters (Location)

		if (location != null && dept != null && subdept != null && gender == null && grade == null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Location , Department , Subdepartment");
			System.out.println("Department : " + dept);
			System.out.println("Subdepartment : " + subdept);
			System.out.println("Location : " + location);

			List user_id = EmpInfoEntityLocalServiceUtil.threeParams(location, dept, subdept);

			System.out.println("Final List :" + user_id.toString());
		}
		if (location != null && dept != null && subdept == null && gender != null && grade == null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Location , Department , Gender");
		}
		if (location != null && dept != null && subdept == null && gender == null && grade != null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Location , Department , Grade");
		}
		if (location != null && dept != null && subdept == null && gender == null && grade == null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Location , Department , Age");
		}
		if (location != null && dept != null && subdept == null && gender == null && grade == null && age == null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for Location , Department , Company");
		}
		if (location != null && dept != null && subdept == null && gender == null && grade == null && age == null
				&& companyname == null && userid != null) {
			System.out.println("All Users  -  Only for Location , Department , Users");
		}
		if (location != null && dept == null && subdept == null && gender != null && grade == null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Location , Gender , Age");
			System.out.println("Location : " + location);
			System.out.println("Age : " + age);
			System.out.println("Gender : " + gender);

			List user_id = EmpInfoEntityLocalServiceUtil.threeParams(location, gender, age);

			System.out.println("Final List :" + user_id.toString());
		}

		// Three Parameters (Department)

		if (location == null && dept != null && subdept != null && gender != null && grade == null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Department , SubDepartment , Gender");
		}
		if (location == null && dept != null && subdept != null && gender == null && grade != null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Department , SubDepartment , Grade");
		}
		if (location == null && dept != null && subdept != null && gender == null && grade == null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Department , SubDepartment , Age");
		}
		if (location == null && dept != null && subdept != null && gender == null && grade == null && age == null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for Department , SubDepartment , Company");
		}
		if (location == null && dept != null && subdept != null && gender == null && grade == null && age == null
				&& companyname == null && userid != null) {
			System.out.println("All Users  -  Only for Department , SubDepartment , Users");
		}

		// Three Parameters (Gender)
		if (location == null && dept == null && subdept == null && gender != null && grade != null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for Gender , Grade , Age");
		}
		if (location == null && dept == null && subdept == null && gender != null && grade != null && age == null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for Gender , Grade , Company");
		}
		if (location == null && dept == null && subdept == null && gender != null && grade != null && age == null
				&& companyname == null && userid != null) {
			System.out.println("All Users  -  Only for Gender , Grade , Users");
		}

		// Three Parameters (Grade)
		if (location == null && dept == null && subdept == null && gender == null && grade != null && age != null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for  Grade , Age , company");
		}
		if (location == null && dept == null && subdept == null && gender == null && grade != null && age != null
				&& companyname == null && userid != null) {
			System.out.println("All Users  -  Only for  Grade , Age , Users");
		}

		// Three Parameters (Age)
		if (location == null && dept == null && subdept == null && gender == null && grade == null && age != null
				&& companyname != null && userid != null) {
			System.out.println("All Users  -  Only for  Age , company , Users");
		}

		// Four Parameters (Location)
		if (location != null && dept != null && subdept != null && gender == null && grade != null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for  Location , Department , SubDepartment , Grade");
		}
		if (location != null && dept != null && subdept != null && gender != null && grade != null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for  Location , Gender , SubDepartment , Grade");
		}
		if (location != null && dept == null && subdept == null && gender != null && grade != null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for  Location , Gender , Age , Grade");
		}
		if (location != null && dept == null && subdept == null && gender != null && grade == null && age != null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for  Grade , Age , Company , Location");
		}
		if (location != null && dept == null && subdept == null && gender == null && grade == null && age != null
				&& companyname != null && userid != null) {
			System.out.println("All Users  -  Only for  Location , Company , Age , Users");
		}

		// Four Parameters (Department)
		if (location == null && dept != null && subdept != null && gender != null && grade != null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for  Department , SubDepartment , Gender , Grade");
		}
		if (location == null && dept != null && subdept == null && gender != null && grade != null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for  Department , Age , Gender , Grade");
		}
		if (location == null && dept != null && subdept == null && gender != null && grade != null && age != null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for  Department , Age , Company , Grade");
		}
		if (location == null && dept != null && subdept == null && gender == null && grade == null && age != null
				&& companyname != null && userid != null) {
			System.out.println("All Users  -  Only for  Department , Age , Company , Users");
		}

		// Four Parameters (SubDepartment)
		if (location == null && dept == null && subdept != null && gender != null && grade != null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for  SubDepartment , Age , Gender , Grade");
		}
		if (location == null && dept == null && subdept != null && gender != null && grade != null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for  SubDepartment , Age , Gender , Grade");
		}
		if (location == null && dept == null && subdept != null && gender == null && grade != null && age != null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for  SubDepartment , Age , Company , Grade");
		}
		if (location == null && dept == null && subdept != null && gender == null && grade == null && age != null
				&& companyname != null && userid != null) {
			System.out.println("All Users  -  Only for  SubDepartment , Age , Company , Users");
		}

		// Four Parameters (Gender)
		if (location == null && dept == null && subdept == null && gender != null && grade != null && age != null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for  Gender , Age , Company , Grade");
		}
		if (location == null && dept == null && subdept == null && gender != null && grade == null && age != null
				&& companyname != null && userid != null) {
			System.out.println("All Users  -  Only for  Gender , Age , Company , Users");
		}

		// Four Parameters (Grade)
		if (location == null && dept == null && subdept == null && gender == null && grade != null && age != null
				&& companyname != null && userid != null) {
			System.out.println("All Users  -  Only for  Grade , Age , Company , Users");
		}

		// Five Parameters (Location)
		if (location != null && dept != null && subdept != null && gender != null && grade != null && age == null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for  Location , Department , SubDepartment , Gender , Grade");
		}
		if (location != null && dept == null && subdept != null && gender != null && grade != null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for  Location , Age , SubDepartment , Gender , Grade");
		}
		if (location != null && dept == null && subdept == null && gender != null && grade != null && age != null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for  Location , Age , Company , Gender , Grade");
		}
		if (location != null && dept == null && subdept == null && gender == null && grade != null && age != null
				&& companyname != null && userid != null) {
			System.out.println("All Users  -  Only for  Location , Age , Company , Users , Grade");
		}

		// Five Parameters (Department)
		if (location == null && dept != null && subdept != null && gender != null && grade != null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for  Department , SubDepartment , Age , Gender , Grade");
		}
		if (location == null && dept != null && subdept == null && gender != null && grade != null && age != null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for  Department , Age , Company , Gender , Grade");
		}
		if (location == null && dept != null && subdept == null && gender == null && grade != null && age != null
				&& companyname != null && userid != null) {
			System.out.println("All Users  -  Only for  Department , Age , Company , Users , Grade");
		}

		// Five Parameters (SubDepartment)
		if (location == null && dept == null && subdept != null && gender != null && grade != null && age != null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for  SubDepartment , Company , Age , Gender , Grade");
		}
		if (location == null && dept == null && subdept != null && gender == null && grade != null && age != null
				&& companyname != null && userid != null) {
			System.out.println("All Users  -  Only for  SubDepartment , Company , Age , Users , Grade");
		}

		// Five (Gender)
		if (location == null && dept == null && subdept == null && gender != null && grade != null && age != null
				&& companyname != null && userid != null) {
			System.out.println("All Users  -  Only for  Gender , Users , Age , Company , Grade");
		}

		// Six
		if (location != null && dept != null && subdept != null && gender != null && grade != null && age != null
				&& companyname == null && userid == null) {
			System.out.println("All Users  -  Only for  Location , Department , SubDepartment , Age , Gender , Grade");
		}
		if (location != null && dept == null && subdept != null && gender != null && grade != null && age != null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for  Location , SubDepartment , Age , company , Gender , Grade");
		}
		if (location != null && dept == null && subdept == null && gender != null && grade != null && age != null
				&& companyname != null && userid != null) {
			System.out.println("All Users  -  Only for  Location , Users , Age , company , Gender , Grade");
		}

		// six(department)
		if (location == null && dept != null && subdept != null && gender != null && grade != null && age != null
				&& companyname != null && userid == null) {
			System.out.println("All Users  -  Only for  Department , SubDepartment , Age , company , Gender , Grade");
		}
		if (location == null && dept != null && subdept == null && gender != null && grade != null && age != null
				&& companyname != null && userid != null) {
			System.out.println("All Users  -  Only for  Department , Users , Age , company , Gender , Grade");
		}

		// six(subdept)
		if (location == null && dept == null && subdept != null && gender != null && grade != null && age != null
				&& companyname != null && userid != null) {
			System.out.println("All Users  -  Only for  SubDepartment , Users , Age , company , Gender , Grade");
		}

		// Seven(Location)
		if (location != null && dept != null && subdept != null && gender != null && grade != null && age != null
				&& companyname != null && userid == null) {
			System.out.println(
					"All Users  -  Only for  Location , Department, SubDepartment , Age , company , Gender , Grade");
		}
		if (location != null && dept == null && subdept != null && gender != null && grade != null && age != null
				&& companyname != null && userid != null) {
			System.out.println(
					"All Users  -  Only for  Location , Users, SubDepartment , Age , company , Gender , Grade");
		}

		// Seven(Department)
		if (location == null && dept != null && subdept != null && gender != null && grade != null && age != null
				&& companyname != null && userid != null) {
			System.out.println(
					"All Users  -  Only for  Users , Department, SubDepartment , Age , company , Gender , Grade");
		}

		// System.out.println("Location : "+location.toString()+" Department :
		// "+dept.toString()+"SubDepartment : "+subdept.toString()+" CompanyName
		// : "+companyname.toString());
		System.out.println("--------------------------------------------------------------");

	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		try {
			System.out.println("Ajax ID " + resourceRequest.getResourceID());

			if (resourceRequest.getResourceID().equalsIgnoreCase("usersCall")) {
				System.out.println("Fetch User ID");
				List<Object[]> lt = EmpInfoEntityLocalServiceUtil.getUsers();
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

				System.out.println("Array : " + jArray);
				obj.put("Users", jArray);
				System.out.println("Object : " + obj);
				writer.print(obj);
			}

			else if (resourceRequest.getResourceID().equalsIgnoreCase("serviceCall")) {

				System.out.println("Inside Serveresource");
				List<String> lt = dataLocalServiceUtil.getCompany();
				System.out.println("List : " + lt.toString());
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

				System.out.println(jArray);
				writer.print(jArray);

			} else {
				List<String> lt = new ArrayList<String>();
				String businessId = ParamUtil.getString(resourceRequest, "business");
				System.out.println("Business ID : " + businessId);

				if (resourceRequest.getResourceID().equalsIgnoreCase("Unit")) {
					lt = dataLocalServiceUtil.getUnit(businessId);
				} else if (resourceRequest.getResourceID().equalsIgnoreCase("Function")) {
					lt = dataLocalServiceUtil.getFunction(businessId);
				} else if (resourceRequest.getResourceID().equalsIgnoreCase("Department")) {
					lt = dataLocalServiceUtil.getDepart(businessId);
				}

				System.out.println("Inside Serveresource : ");

				System.out.println("List : " + lt.toString());

				Iterator it = lt.iterator();
				JSONObject obj = new JSONObject();
				PrintWriter writer = resourceResponse.getWriter();
				obj.put("unit", lt);
				System.out.println(obj);
				writer.print(obj);

			}

			/*
			 * System.out.println("ID : " + resourceRequest.getResourceID());
			 * 
			 * if (resourceRequest.getResourceID().equalsIgnoreCase("Location"))
			 * { List<String> lt = EmpInfoEntityLocalServiceUtil.getLocation();
			 * Iterator it = lt.iterator(); JSONObject obj = new JSONObject();
			 * PrintWriter writer = resourceResponse.getWriter();
			 * obj.put("location", lt); System.out.println(obj);
			 * writer.print(obj); }
			 * 
			 * if
			 * (resourceRequest.getResourceID().equalsIgnoreCase("Department"))
			 * { //String location = resourceRequest.getParameter("location");
			 * //System.out.println("Location : "+location); List<String> lt =
			 * EmpInfoEntityLocalServiceUtil.getDept(); Iterator it =
			 * lt.iterator(); JSONObject obj = new JSONObject(); PrintWriter
			 * writer = resourceResponse.getWriter(); obj.put("department", lt);
			 * System.out.println(obj); writer.print(obj); }
			 * 
			 * if
			 * (resourceRequest.getResourceID().equalsIgnoreCase("SubDepartment"
			 * )) { //String location =
			 * resourceRequest.getParameter("location");
			 * //System.out.println("Location : "+location); //String department
			 * = resourceRequest.getParameter("department");
			 * //System.out.println("department : "+department); List<String> lt
			 * = EmpInfoEntityLocalServiceUtil.getSubDept(); Iterator it =
			 * lt.iterator(); JSONObject obj = new JSONObject(); PrintWriter
			 * writer = resourceResponse.getWriter(); obj.put("subdepartment",
			 * lt); System.out.println(obj); writer.print(obj); }
			 * 
			 * if (resourceRequest.getResourceID().equalsIgnoreCase("Users")) {
			 * List<String> lt = EmpInfoEntityLocalServiceUtil.getUsers();
			 * Iterator it = lt.iterator(); JSONObject obj = new JSONObject();
			 * PrintWriter writer = resourceResponse.getWriter();
			 * obj.put("Users", lt); System.out.println(obj); writer.print(obj);
			 * }
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void save(ActionRequest actionRequest, ActionResponse response) throws ParseException, PortalException {

		int arrLength = ParamUtil.getParameterValues(actionRequest, "secondList").length;
		int arrLength1 = ParamUtil.getParameterValues(actionRequest, "thirdList").length;

		System.out.println("Second List length : " + arrLength);
		System.out.println("Third List length : " + arrLength1);

		String eventFrom = ParamUtil.getString(actionRequest, "eventfrom");
		System.out.println("eventFrom : " + eventFrom);

		String eventTo = ParamUtil.getString(actionRequest, "eventto");
		System.out.println("eventTo : " + eventTo);

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date dateFrom = formatter.parse(eventFrom);
		Date dateTo = formatter.parse(eventTo);

		System.out.println("Date from : " + dateFrom);
		System.out.println("Date to : " + dateTo);

		String eventDetails = ParamUtil.getString(actionRequest, "eventdetails");
		System.out.println("eventDetails : " + eventDetails);

		// list 1
		if (arrLength >= 1) {
			String[] values = ParamUtil.getParameterValues(actionRequest, "secondList");
			System.out.println("Second " + values.toString());

			String optionValue = ParamUtil.getString(actionRequest, "option");
			System.out.println("optionValue : " + optionValue);

			String businessId = ParamUtil.getString(actionRequest, "business");
			System.out.println("Business ID : " + businessId);

			for (int i = 0; i < values.length; i++) {
				System.out.println("Selected values : " + values[i]);
			}

			String gender = ParamUtil.getString(actionRequest, "gender");
			System.out.println("Gender : " + gender);

			String age_arr = ParamUtil.getString(actionRequest, "age");
			String lessthan_age = ParamUtil.getString(actionRequest, "lessthanvalue");
			String greaterthan_age = ParamUtil.getString(actionRequest, "greaterthanvalue");
			String between_from_age = ParamUtil.getString(actionRequest, "betweenfromvalue");
			String between_to_age = ParamUtil.getString(actionRequest, "betweentovalue");

			if (age_arr.equalsIgnoreCase("all")) {
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("lessthan")) {
				age_arr = "Less than " + lessthan_age;
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("greaterthan")) {
				age_arr = "Greater than " + greaterthan_age;
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("between")) {
				age_arr = "Between " + between_from_age + " to " + between_to_age;
				System.out.println("age : " + age_arr);
			}

			List<String> list = dataLocalServiceUtil.getIntendedUser(businessId, values, gender.toUpperCase(), age_arr,
					optionValue);

			System.out.println("List Data : " + list.toString());

			for (int i = 0; i < list.size(); i++) {
				eventcalendar eventCal = eventcalendarLocalServiceUtil
						.createeventcalendar(CounterLocalServiceUtil.increment());
				eventCal.setName(eventDetails);
				eventCal.setStartdate(dateFrom);
				eventCal.setEnddate(dateTo);
				eventCal.setColor("red");
				eventCal.setUrl("");
				eventCal.setUserid(list.get(i).toString());
				eventCal = eventcalendarLocalServiceUtil.addeventcalendar(eventCal);
				System.out.println("Event Id : " + eventCal.getId());
			}
		}
		// list 2
		else {
			// String[] list=null;
			
			ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			
			
			System.out.println(themeDisplay.getURLHome());
			String url = null;
			System.out.println("URL========" + themeDisplay.getPortalURL());
			System.out.println("Current URL========" + themeDisplay.getURLCurrent());
			System.out.println("Home URL========" + themeDisplay.getURLHome());
			
			if (themeDisplay.getURLCurrent().indexOf("?") != -1) {
				int count = themeDisplay.getURLCurrent().indexOf("?");
				url = themeDisplay.getURLCurrent().substring(0, count);
				System.out.println(url);
			} else {
				url = themeDisplay.getURLCurrent();
			}
			String urllink = themeDisplay.getPortalURL() + url;
			
			String[] list = ParamUtil.getParameterValues(actionRequest, "thirdList");
			System.out.println("Third " + list.toString());
			System.out.println("Third List length : " + list.length);
			for (int i = 0; i < list.length; i++) {
				List<EmpInfoEntity> userId = EmpInfoEntityLocalServiceUtil.getUserId(list[i].toString());
				System.out.println("size " + userId.size());
				for (EmpInfoEntity emp : userId) {
					System.out.println("UserId : " + emp.getUserid().toString());

					eventcalendar eventCal = eventcalendarLocalServiceUtil
							.createeventcalendar(CounterLocalServiceUtil.increment());
					eventCal.setName(eventDetails);
					eventCal.setStartdate(dateFrom);
					eventCal.setEnddate(dateTo);
					eventCal.setColor("red");
					eventCal.setUrl("");
					eventCal.setUserid(emp.getUserid().toString());
					eventCal = eventcalendarLocalServiceUtil.addeventcalendar(eventCal);
					System.out.println("Event Id : " + eventCal.getId());

					sendNotification(actionRequest, response, Long.parseLong(emp.getUserid().toString()),serviceContext,urllink);
				}
			}

		}
	}

	public void sendNotification(ActionRequest actionRequest, ActionResponse actionResponse, long userid, ServiceContext serviceContext,String urllink)
			 {
		try
		{
		boolean flag = false;
		com.liferay.portal.kernel.json.JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
		payloadJSON.put("userId", userid);
		payloadJSON.put("url", urllink);
		payloadJSON.put("notificationText", "An event has been Updated");
		System.out.println("Pay Load : " + payloadJSON);
		UserNotificationEvent event = UserNotificationEventLocalServiceUtil.addUserNotificationEvent(userid,
				"ASHISH_SHRIKANT", (new Date()).getTime(), userid, payloadJSON.toString(), false, serviceContext);
		System.out.println("EVENT : " + event);

		System.out.println(event.getUserNotificationEventId());

		flag = eventcalendarLocalServiceUtil.insertNotifyStts(1, 3, "event", 1, 1, event.getUserNotificationEventId());
		System.out.println("Flag : " + flag);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
