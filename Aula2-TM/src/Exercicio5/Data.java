package Exercicio5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {
    private int dayOfMonth;
    private int month;
    private int year;
    private GregorianCalendar calendar;

    public Data(int dayOfMonth, int month, int year) {
        this.dayOfMonth = dayOfMonth;
        this.month = month - 1;
        this.year = year;
        this.calendar = new GregorianCalendar(this.year, this.month, this.dayOfMonth);
    }

    public Data(GregorianCalendar calendar) {
        this.calendar = calendar;
    }

    public void verificaData() {
        calendar.setLenient(false);
        calendar.set(this.year, this.month, this.dayOfMonth);
        try{
            calendar.getTime();
            System.out.println("A data está correta");
        } catch (IllegalArgumentException e) {
            System.out.println("A data está incorreta!");
        }
        calendar.setLenient(true);
    }

    public void adicionaDia() {
        calendar.add(GregorianCalendar.DAY_OF_MONTH, 1);
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(GregorianCalendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/"
                + (calendar.get(GregorianCalendar.MONTH) + 1) + "/"
                + calendar.get(GregorianCalendar.YEAR);
    }
}
