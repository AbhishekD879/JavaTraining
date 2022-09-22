package com.JavaTraining.Day7.Holiday;

public class Holiday {
    private String name;
    private int day;

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    private String month;
    Holiday(String name, int day, String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }
    boolean inSameMonth(Holiday holiday){
        return this.month.equals(holiday.getMonth());
    }
    double avgDate(Holiday[] holidays){
        int sum=0;
        for(Holiday holiday:holidays){
            sum+=holiday.getDay();
        }
        return sum/holidays.length;
    }
}
