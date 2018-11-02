package com.nvreport.model;

public class LinePassingResult {

    private String lineTitle;
    private int inNumber;
    private int outNumber;
    private int hour;

    public LinePassingResult(String lineTitle, int inNumber, int outNumber, int hour) {
        this.lineTitle = lineTitle;
        this.inNumber = inNumber;
        this.outNumber = outNumber;
        this.hour =hour;
    }

    public String getLineTitle() {
        return lineTitle;
    }

    public void setLineTitle(String lineTitle) {
        this.lineTitle = lineTitle;
    }

    public int getInNumber() {
        return inNumber;
    }

    public void setInNumber(int inNumber) {
        this.inNumber = inNumber;
    }

    public int getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(int outNumber) {
        this.outNumber = outNumber;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
