package practice;

import java.util.Date;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class UserInfoMainAction {
	private static Log logger = LogFactoryUtil.getLog(UserInfoMainAction.class);
	

	public static String getLastHourDate(Date lastdate) {
		String str = null;
		Date d1 = lastdate;
		Date d2 = new Date();
		String difft = null;
		logger.info("Last Login Date : " + d1);
		logger.info("Current Sys Date : " + d2);
		long diff = d2.getTime() - d1.getTime();
		logger.info("Diff Date : " + diff);

		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		long diffDays = diff / (24 * 60 * 60 * 1000);

		if (diffDays > 0) {
			String str1 = String.valueOf(diffDays);
			str = str1 + "days ago";
		} else {
			if (diffHours > 0) {

				str = diffHours + "  hours ago";
			} else {
				String min = String.valueOf(diffMinutes);
        		str = min + "  min ago";
			}
		}
		difft = diffHours + ":" + diffMinutes;
		logger.info("Diffrence in date : "+difft);
		logger.info("Day : " + diffDays);
		logger.info("Hour : " + diffHours);
		return str;
	}
}
