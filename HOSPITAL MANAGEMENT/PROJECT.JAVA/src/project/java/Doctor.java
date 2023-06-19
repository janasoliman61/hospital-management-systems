package project.java;
public class Doctor extends Person
{
    private String ID, special;

    Doctor(String dID, String dSpecial, String fullName, String gender, String homeAddress, String phoneNumber, int age)
    {
        super(fullName, gender, homeAddress, phoneNumber, age);
        ID = dID;
        special = dSpecial;
    }

    Doctor(String dID, String dSpecial, String fullName)
    {
        super(fullName);
        ID = dID;
        special = dSpecial;
    }

    public String getID()
    {
        return ID;
    }

    public void setID(String dID)
    {
        ID = dID;
    }

    public String getSpecial()
    {
        return special;
    }

    public void setSpecial(String dSpecial)
    {
        special = dSpecial;
    }
}