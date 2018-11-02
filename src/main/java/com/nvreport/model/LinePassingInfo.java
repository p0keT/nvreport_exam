package com.nvreport.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class LinePassingInfo extends Date{

    private String lineName="";
    private String dateTimeStart="";
    private String dateTimeEnd="";



    public String getDateTimeStart() {
        return dateTimeStart;
    }

    public void setDateTimeStart(String dateTimeStart) {
        Date date1= null;
        try {
            date1 = new SimpleDateFormat("yyyyMMddHH").parse(dateTimeStart);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        super.setTime(date1.getTime());
        this.dateTimeStart = dateTimeStart;

    }

    public String getDateTimeEnd() {
        return dateTimeEnd;
    }

    public void setDateTimeEnd(String dateTimeEnd) {
        Date date1= null;
        try {
            date1 = new SimpleDateFormat("yyyyMMddHH").parse(dateTimeEnd);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        super.setTime(date1.getTime());
        this.dateTimeEnd = dateTimeEnd;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }
}
