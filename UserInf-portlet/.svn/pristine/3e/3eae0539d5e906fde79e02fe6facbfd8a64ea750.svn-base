package practice;

import java.util.Calendar;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class UserDay {
	private static Log logger = LogFactoryUtil.getLog(UserDay.class);

	public static String getDayWish() {
		String day = null;
		int timeOfDay = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		logger.info(timeOfDay);
		if (timeOfDay >= 0 && timeOfDay < 12) {
			day = "Good Morning";
			logger.info("Good Morning");
		} else if (timeOfDay >= 12 && timeOfDay < 16) {
			day = "Good AfterNoon";
			logger.info("Good AfterNoon");
		} else if (timeOfDay >= 16 && timeOfDay < 21) {
			day = "Good Evening";
			logger.info("Good Evening");
		} else if (timeOfDay >= 21 && timeOfDay < 24) {
			day = "Good Night";
			logger.info("Good Night");
		}
		return day;
	}

}
