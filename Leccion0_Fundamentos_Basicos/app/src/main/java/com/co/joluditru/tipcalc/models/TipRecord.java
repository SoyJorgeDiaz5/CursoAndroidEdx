package com.co.joluditru.tipcalc.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by joluditru on 21/06/2016.
 */
public class TipRecord {
    private double bill;
    private int tipPercentage;
    private Date timeStamp;

    public Double getTip(){
        return bill*(tipPercentage/100d);
    }

    public String getDateFormatted(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM, dd, yy HH:mm");
        return simpleDateFormat.format(timeStamp);
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void setTipPercentage(int tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
