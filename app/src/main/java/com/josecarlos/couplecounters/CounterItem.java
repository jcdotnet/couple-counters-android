package com.josecarlos.couplecounters;

import java.util.Date;

/**
 * Created by Jose Carlos on 11/11/2015.
 * We're finally using List of strings instead
 */
public class CounterItem {

    /*
    public final static SimpleDateFormat FORMAT = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm:ss", Locale.ENGLISH); */

    private String counterName;
    private Date date = new Date();

    CounterItem(String counterName, Date date) {
        this.counterName = counterName;
        this.date = date;
    }

    public String getCounterName() {
        return counterName;
    }


    public Date getmDate() {
        return date;
    }
}
