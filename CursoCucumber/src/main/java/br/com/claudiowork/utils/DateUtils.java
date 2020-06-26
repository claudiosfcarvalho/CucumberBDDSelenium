package br.com.claudiowork.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static Date somaPeriodo(Date data, int qtd, String periodo) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		int per = (periodo.contains("dia") ? Calendar.DAY_OF_MONTH : (periodo.contains("ano") ? Calendar.YEAR : Calendar.MONTH));
		cal.add(per, qtd);
		return cal.getTime();
	}
}
