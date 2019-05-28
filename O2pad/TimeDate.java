/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O2pad;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Emmanuel Nzekwe
 */
public class TimeDate{
    static int year, month, day, hour, minute, second, pmAm;
    static String AmPm;
            public TimeDate(){
                Calendar cal = new GregorianCalendar();
                year = cal.get(Calendar.YEAR);
                month = cal.get(Calendar.MONTH) + 1;
                day = cal.get(Calendar.DAY_OF_MONTH);
                hour = cal.get(Calendar.HOUR);
                minute = cal.get(Calendar.MINUTE);
                second = cal.get(Calendar.SECOND);
                pmAm = cal.get(Calendar.AM_PM);
                AmPm = "0";
                if(pmAm == 1){AmPm = "PM";}
                if(pmAm == 0){AmPm = "AM";}
            }
    
            public static String getDate(){
                return month + "/" + day + "/"+ year;
            }
            public static String getTime(){
                return hour +":"+ minute + " " + AmPm + " ";
            }
}

