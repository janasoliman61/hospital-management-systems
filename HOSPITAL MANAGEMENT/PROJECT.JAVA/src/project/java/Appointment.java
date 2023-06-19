package project.java;
import java.util.Date;

public class Appointment
{
    private String Pname, condition, Dname, location;
    private int price;
    private Date date;

    Appointment(String pName, Date apDate, String pCondition, String dName, String hLocation, int apPrice)
    {
        Pname = pName;
        date = apDate;
        condition = pCondition;
        Dname = dName;
        location = hLocation;
        price = apPrice;
    }

    public void setDName(String dName)
    {
        Dname = dName;
    }

    public void setPName(String pName)
    {
        Pname = pName;
    }

    public void setDate(Date apDate)
    {
        date = apDate;
    }

    public void setCondition(String pCondition)
    {
        condition = pCondition;
    }

    public void setLocation(String hLocation)
    {
        location = hLocation;
    }

    public void setPrice(int apPrice)
    {
        price = apPrice;
    }

    public String getPName()
    {
        return Pname;
    }

    public String getDName()
    {
        return Dname;
    }

    public Date getDate()
    {
        return date;
    }

    public String getLocation()
    {
        return location;
    }

    public int getPrice()
    {
        return price;
    }

    public String getCondition()
    {
        return condition;
    }
}