package project.java;
public class Patient extends Person
{
    private String ID, condition, BMI;

   Patient(String pID, String pCondition, String pBMI, String fullName, String gender, String homeAddress, String phoneNumber, int age)
   {
       super(fullName, gender, homeAddress, phoneNumber, age);
       ID = pID;
       condition = pCondition;
       BMI = pBMI;
   }

   Patient(String pID, String pCondition, String fullName)
   {
        super(fullName);
        ID = pID;
        condition = pCondition;
    }

   public void setName(String pID)
   {
       ID = pID;
   }

   public String getID()
   {
       return ID;
   }

   public void setCondition(String pCondition)
   {
       condition = pCondition;
   }

   public String getCondition()
   {
       return condition;
   }

   public String getBMI()
   {
       return BMI;
   }

   public void setBMI(String dBMI)
   {
       BMI = dBMI ;
   }
   
}