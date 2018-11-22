package com.baidu.haha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.String.*;

public class Haha {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        /*long time = date.getTime();
        System.out.println(time);
        System.out.println("---------------------");
        date.setTime(999999999);
        System.out.println(valueOf(date));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        System.out.println(format);*/
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(Calendar.MONDAY);
        calendar.set(Calendar.MONDAY,-1);
        System.out.println(i);

        System.out.println(calendar.get(Calendar.MONDAY));
        calendar.set(Calendar.MONDAY,-2);
        System.out.println(calendar.get(Calendar.MONDAY));


    }
}
