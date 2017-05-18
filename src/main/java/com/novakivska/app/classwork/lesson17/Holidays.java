package com.novakivska.app.classwork.lesson17;

/**
 * Created by Tas_ka on 5/16/2017.
 */
public enum Holidays {

    CHRISTMAS(25, "January", "Merry Christmas!"),
    EASTER(16, "April", "Happy Easter!"),
    INDEPENDENCE_DAY(24, "August", "Let's selebrate!");

    private int date;
    private String month;
    private String descript;

    Holidays(int date, String month, String descript) {
        this.date = date;
        this.month = month;
        this.descript = descript;

    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }
}
