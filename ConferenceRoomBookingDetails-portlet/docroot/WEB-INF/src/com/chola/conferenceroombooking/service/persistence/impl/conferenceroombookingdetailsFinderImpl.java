package com.chola.conferenceroombooking.service.persistence.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.chola.conferenceroombooking.service.persistence.conferenceroombookingdetailsFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class conferenceroombookingdetailsFinderImpl extends conferenceroombookingdetailsFinderBaseImpl
implements conferenceroombookingdetailsFinder
{
	private static Log logger = LogFactoryUtil.getLog(locationFinderImpl.class);
	public List<Object[]> syscodeCustomMsg(int syscode) 
	{
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("syscode");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(syscode);

			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			logger.info("context",e);
		} finally {
			closeSession(session);
		}
		return Collections.emptyList();
	}

	// this method is for State..........
	public List<Object[]> state() {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("state");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			logger.info("context",e);
		} finally {
			closeSession(session);
		}
		return Collections.emptyList();
	}

	// This Method id for Location
	public List<Object[]> location(int stateid) {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("location");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(stateid);

			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			logger.info("context",e);
		} finally {
			closeSession(session);
		}
		return Collections.emptyList();
	}
	// This Method id for Conference Room...
			public List<Object[]> conferenceroom(int stateid, int locationid) {
				boolean flag = false;
				Session session = null;
				try {
					session = openSession();
					String sql = CustomSQLUtil.get("roomlist");
					SQLQuery queryObject = session.createSQLQuery(sql);
					queryObject.setCacheable(false);
					QueryPos qPos = QueryPos.getInstance(queryObject);
					qPos.add(stateid);
					qPos.add(locationid);

					return (List<Object[]>) queryObject.list();
				} catch (Exception e) {
					logger.info("context",e);
				} finally {
					closeSession(session);
				}
				return Collections.emptyList();
			}


			// This Method id for Get Room Id
			public List<Long> getroomId(int stateid, int locid) {
				boolean flag = false;
				Session session = null;
				List<Long> list = new ArrayList();
				try {
					session = openSession();
					String sql = CustomSQLUtil.get("roomid");
					SQLQuery queryObject = session.createSQLQuery(sql);
					queryObject.setCacheable(false);
					QueryPos qPos = QueryPos.getInstance(queryObject);
					qPos.add(stateid);
					qPos.add(locid);
					List<BigInteger> l = queryObject.list();
					for (BigInteger b : l) {
						list.add(b.longValue());
					}

					return list;

				} 
				catch (Exception e) 
				{
					logger.info("context",e);
				} finally {
					closeSession(session);
				}
				return list;
			}

			// This Method is for Getting Booking Details.......
			public List<Object[]> getConferenceList(String startime, String endtime, int roomid, String startdate) {
				boolean flag = false;
				Session session = null;
				try {
					session = openSession();
					String sql = CustomSQLUtil.get("bookingdetails");
					SQLQuery queryObject = session.createSQLQuery(sql);
					queryObject.setCacheable(false);
					QueryPos qPos = QueryPos.getInstance(queryObject);
					qPos.add(roomid);
					qPos.add(startime);
					qPos.add(endtime);
					qPos.add(startdate);
					qPos.add(roomid);
					qPos.add(startdate);
					qPos.add(startime);
					qPos.add(endtime);
					qPos.add(roomid);			
					qPos.add(startdate);
					logger.info(qPos);
					logger.info("##############Contest List");
					
					return (List<Object[]>) queryObject.list();
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				} finally {
					closeSession(session);
				}
				return Collections.emptyList();

			}

			// This Method is for Room Master
			public Object[] getRoomMaster(int stateid, int locid, int id) {
				boolean flag = false;
				Session session = null;
				try {
					session = openSession();
					String sql = CustomSQLUtil.get("roommasterlist");
					SQLQuery queryObject = session.createSQLQuery(sql);
					queryObject.setCacheable(false);
					QueryPos qPos = QueryPos.getInstance(queryObject);
					qPos.add(stateid);
					qPos.add(locid);
					qPos.add(id);
					logger.info(qPos);
					logger.info("##############Room Master List");
					
					return (Object[]) queryObject.uniqueResult();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					closeSession(session);
				}
				return null;
			}

			public List<Object[]> mybookinglist(long userid, int status) {
				boolean flag = false;
				Session session = null;
				try {
					session = openSession();
					String sql = CustomSQLUtil.get("mybookingdetails");
					SQLQuery queryObject = session.createSQLQuery(sql);
					queryObject.setCacheable(false);
					QueryPos qPos = QueryPos.getInstance(queryObject);
					qPos.add(userid);
					qPos.add(status);
					return (List<Object[]>) queryObject.list();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					closeSession(session);
				}
				return Collections.emptyList();
			}
			
			
			public boolean updateMybooking(int status,long userid, long bookid) {
				boolean flag = false;
				Session session = null;
				try {
					session = openSession();
					String sql = CustomSQLUtil.get("updatestatus");
					SQLQuery queryObject = session.createSQLQuery(sql);
					queryObject.setCacheable(false);
					QueryPos qPos = QueryPos.getInstance(queryObject);
					qPos.add(status);
					qPos.add(userid);
					qPos.add(bookid);
					flag = true;
					queryObject.executeUpdate();
					return flag;
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					closeSession(session);
				}
				return flag;
			}


			public List<Object[]> allBookingList(String startdate,String endate,String stateid,String locid) {
				boolean flag = false;
				Session session = null;
				try {
					session = openSession();
					String sql = CustomSQLUtil.get("allbookinglist");
					logger.info("query in string "+sql);
					SQLQuery queryObject = session.createSQLQuery(sql);
					logger.info("query in queryObject "+queryObject);
					queryObject.setCacheable(false);
					QueryPos qPos = QueryPos.getInstance(queryObject);
					qPos.add(startdate);
					qPos.add(endate);
					qPos.add(stateid);
					qPos.add(locid);
					logger.info("startdate in qPos "+startdate);
					logger.info("endate in qPos "+endate);
					logger.info("stateid in qPos "+stateid);
					logger.info("locid in qPos "+locid);
					logger.info("query in qPos "+qPos);
				return (List<Object[]>) queryObject.list();
				} 
				catch (Exception e)
				{
					logger.info("context",e);
				} finally {
					closeSession(session);
				}
				return Collections.emptyList();
			}
			
			//This method is for Default All Booking..........
			public List<Object[]> defaultallBookingList(String startdate,String endate) {
				boolean flag = false;
				Session session = null;
				try {
					session = openSession();
					String sql = CustomSQLUtil.get("defaultallbookinglist");
					SQLQuery queryObject = session.createSQLQuery(sql);
					queryObject.setCacheable(false);
					QueryPos qPos = QueryPos.getInstance(queryObject);
					qPos.add(startdate);
					qPos.add(endate);
					
					return (List<Object[]>) queryObject.list();
				} catch (Exception e)
				{
					logger.info("context",e);
				} finally {
					closeSession(session);
				}
				return Collections.emptyList();
			}
			public String getStatename(long stateId)
			{
				logger.info("In locationfinder getStatename.."+stateId);
				
			Session session = null;
			try
			{
			session = openSession();
			String sql=CustomSQLUtil.get("statelist");
			
			SQLQuery query = session.createSQLQuery(sql);
			logger.info(query);
			
			QueryPos pos=QueryPos.getInstance(query);
			logger.info(pos);
			
			pos.add(stateId);
			List<Object[]> list = query.list();
			logger.info("City List size....." + list.size());
			
			return (String) query.uniqueResult();
			}
			catch(Exception e)
			{
				logger.info("context",e);
			}
			finally
			{
			closeSession(session);
			}
			return null;
		}
         
			public String getlocationname(long locationId)
			{
				logger.info("In locationfinder getStatename.."+locationId);
				
			Session session = null;
			try
			{
			session = openSession();
			String sql=CustomSQLUtil.get("locationnamelist");
			
			SQLQuery query = session.createSQLQuery(sql);
			logger.info(query);
			
			QueryPos pos=QueryPos.getInstance(query);
			logger.info(pos);
			
			pos.add(locationId);
			List<Object[]> list = query.list();
			logger.info("City List size....." + list.size());
			
			return (String) query.uniqueResult();
			}
			catch(Exception e)
			{
				logger.info("context",e);
			}
			finally
			{
			closeSession(session);
			}
			return null;
		}
			
			public String getfloorname(long floorId)
			{
				logger.info("In locationfinder getStatename.."+floorId);
				
			Session session = null;
			try
			{
			session = openSession();
			String sql=CustomSQLUtil.get("floornamelist");
			
			SQLQuery query = session.createSQLQuery(sql);
			logger.info(query);
			
			QueryPos pos=QueryPos.getInstance(query);
			logger.info(pos);
			
			pos.add(floorId);
			List<Object[]> list = query.list();
			logger.info("City List size....." + list.size());
			
			return (String) query.uniqueResult();
			}
			catch(Exception e)
			{
				logger.info("context",e);
			}
			finally
			{
			closeSession(session);
			}
			return null;
		}
}
