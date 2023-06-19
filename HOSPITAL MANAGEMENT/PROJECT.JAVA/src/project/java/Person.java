package project.java;
class Person
{
    private String fname, gend, homeAd, phonNu;
    private int agee;

    Person(String fullName, String gender, String homeAddress, String phoneNumber, int age)
    {
        fname = fullName;
        gend = gender;
        homeAd = homeAddress;
        phonNu = phoneNumber;
        agee = age;
    }

    Person(String fullName)
    {
        fname = fullName;
    }

    public String getName()
    {
        return fname;
    }

    public void setName(String name)
    {
        fname = name;
    }

    public String getGend()
    {
        return gend;
    }

    public void setGend(String gender)
    {
        gend = gender;
    }
    
    public String getAddress()
    {
        return homeAd;
    }

    public void setAddress(String address)
    {
        homeAd = address;
    }

    public String getPhone()
    {
        return phonNu;
    }

    public void setPhone(String phone)
    {
        phonNu = phone;
    }

    public int getAge()
    {
        return agee;
    }

    public void setAge(int age)
    {
        agee = age;
    }

    @Override
    public String toString()
    {
        return "person = ( Full Name = "+fname+", Gender = "+gend+", Address = "+homeAd+", Phone Number = "+phonNu+", Age = "+agee+")";
    }


}