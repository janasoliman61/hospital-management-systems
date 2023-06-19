package project.java;
public class Hospital
{
    private String name="SA3DYA HOSPITAL", location;
    private int room;

    Hospital(String hName, String hLocation, int hRooms)
    {
        name = hName;
        location = hLocation;
        room = hRooms;
    }

    Hospital(String hLocation)
    {
        location = hLocation;
    }

    Hospital()
    {}

    public String getName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }

    public int getRooms()
    {
        return room;
    }

    public void setName(String hName)
    {
        name = hName;
    }

    public void setLocation(String hLocation)
    {
        location = hLocation;
    }
    
    public void setRooms(int hRooms)
    {
        room = hRooms;
    }
    
}