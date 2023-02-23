package com.gokulr488.optionsgk.core;

import java.sql.Timestamp;
import java.util.Calendar;

public class DateOps {// extends DateUtils { get this from utils project

	public static Timestamp getEpochTime(String dateString) {
		long timeStamp = Long.parseLong(dateString);
		timeStamp = timeStamp / 1000000;
		timeStamp += (Constants.TEN_YEARS - Constants.ONE_DAY - Constants.IST_TIME_DIFFERNCE);

		return new Timestamp(timeStamp);
	}

	@SuppressWarnings("deprecation")
	public static Timestamp getCurrentDate() {
		Calendar calendar = Calendar.getInstance();
		return new Timestamp(calendar.get(Calendar.YEAR) - 1900, calendar.get(Calendar.MONTH),
				calendar.get(Calendar.DATE), 0, 0, 0, 0);
	}

}
