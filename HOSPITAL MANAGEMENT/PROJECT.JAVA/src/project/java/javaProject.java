/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class javaProject {
      static String ID=" ", name, address, phone, gender, special, filler="", condition, BMI, ID2, apDate, docName, hosName;
    static int op, id, age, price = 200, rooms;
    static boolean found=false;
    static Date date = new Date();

    static ArrayList<Integer> doctorID = new ArrayList<>();
    static ArrayList<Integer> patientID = new ArrayList<>();
    static ArrayList<String> doctorName = new ArrayList<>();
    static ArrayList<String> patientName = new ArrayList<>();
    static ArrayList<String> doctorSpecial = new ArrayList<>();
    static ArrayList<String> patientCondition = new ArrayList<>();

    static Patient Patient;
    static Doctor Doctor;

    public static void main(String[] args) throws Exception
    {
        doctorID.add(342); doctorName.add("HOSSAM"); doctorSpecial.add("BONES");
        doctorID.add(343); doctorName.add("GEHAN"); doctorSpecial.add("SKIN");
        doctorID.add(344); doctorName.add("AHMED"); doctorSpecial.add("HEART");
        doctorID.add(345); doctorName.add("HUSSIEN"); doctorSpecial.add("OTHER");

        patientID.add(1278); patientName.add("YOUSSIF"); patientCondition.add("SKIN");
        patientID.add(1279); patientName.add("JANA");       patientCondition.add("HEART");
        patientID.add(1280); patientName.add("NERMAINE");   patientCondition.add("BONES");
        patientID.add(1281); patientName.add("NEREEN");   patientCondition.add("OTHER");


        System.out.print("\n --- WELCOME TO SA3DYA HOSPITAL ---\n\n DO YOU HAVE AN ID? \n 1 - YES (ENTER 1)\n 2 - NO (ENTER 2) \n\n --> ");
        Scanner scan = new Scanner(System.in);
        op = scan.nextInt();

        while(op!=1 && op!=2) // option entry validation
        {
            System.out.print("\n INVALID OPTION! PLEASE ENTER AGAIN!\n --> ");
            op = scan.nextInt();
        }

        if(op==2) // sign up code
        {
            System.out.print("\n PLEASE CHOOSE YOUR IDENTITY: \n 1 - DOCTOR (ENTER 1) \n 2 - PATIENT (ENTER 2) \n\n --> ");
            op = scan.nextInt();

            while(op!=1 && op!=2) // option entry validation
            {
                System.out.print("\n INVALID OPTION! PLEASE ENTER AGAIN!\n --> ");
                op = scan.nextInt();
            }

            if(op==1)
            {
                System.out.print("\n ENTER NAME: "); name = scan.next();
                System.out.print("\n ENTER AGE: "); age = scan.nextInt();
                System.out.print("\n ENTER GENDER: "); gender = scan.next();
                System.out.print("\n ENTER ADDRESS: "); address = scan.next();
                System.out.print("\n ENTER PHONE-NUMBER: "); phone = scan.next();
                System.out.print("\n ENTER SPECIALITY: "); special = scan.next();

                id = doctorID.get(doctorID.size()-1) + 1;
                ID = Integer.toString(id);

                for(int i=4; i>ID.length(); i--)
                    filler+="0"; // filler = filler +"0";

                ID = "D" + filler + ID;
                Doctor doctor = new Doctor(ID, special, name, gender, address, phone, age);
                Doctor = doctor;
                System.out.print("\n\n REGISTERATION COMPLETED! \n YOUR ID = "+ID);
                doctorID.add(id);
                doctorName.add(doctor.getName());
            }
            else
            {
                System.out.print("\n ENTER NAME: "); name = scan.next();
                System.out.print("\n ENTER AGE: "); age = scan.nextInt();
                System.out.print("\n ENTER GENDER: "); gender = scan.next();
                System.out.print("\n ENTER ADDRESS: "); address = scan.next();
                System.out.print("\n ENTER PHONE-NUMBER: "); phone = scan.next();
                System.out.print("\n ENTER CONDITION: "); condition = scan.next();
                System.out.print("\n ENTER BMI: "); BMI = scan.next();

                id = patientID.get(patientID.size()-1) + 1;
                ID = Integer.toString(id);

                for(int i=4; i>ID.length(); i--)
                    filler+="0"; // filler = filler +"0";

                ID = "P" + filler + ID;
                Patient patient = new Patient(ID, condition, BMI, name, gender, address, phone, age);
                Patient = patient;
                System.out.print("\n\n REGISTERATION COMPLETED! \n YOUR ID = "+ID);
                patientID.add(id);
            }
            
        }
        else
        {
            System.out.print("\n\n ENTER YOUR ID: ");
            ID = scan.next();

            while(found==false)
            {
                if(ID.substring(0, 1).equals("D"))
                {
                    for(int i=0; i<doctorID.size(); i++)
                    {
                        filler="";
                        for(int j=4; j>Integer.toString(doctorID.get(i)).length(); j--)
                            filler+="0"; // filler = filler +"0";

                        ID2 = "D" + filler + Integer.toString(doctorID.get(i));

                        if(ID2.equals(ID))
                        {
                            Doctor doctor = new Doctor(ID2, doctorSpecial.get(i), doctorName.get(i));
                            Doctor = doctor;
                            System.out.print("\n\n WELCOME DR."+doctor.getName()+"\n SPECIALIZATION: "+doctor.getSpecial());
                            found = true;
                            break;
                        }
                    }
                    if(found==false)
                    {
                        System.out.print("\n\n ID NOT FOUND! PLEASE ENTER AGAIN!\n\n --> ");
                        ID = scan.next();
                    }
                }
                else if(ID.substring(0, 1).equals("P"))
                {
                    for(int i=0; i<patientID.size(); i++)
                    {
                        for(int j=4; j>Integer.toString(patientID.get(i)).length(); j--)
                            filler+="0"; // filler = filler +"0";

                        ID2 = "P" + filler + Integer.toString(patientID.get(i));

                        if(ID2.equals(ID))
                        {
                            Patient patient = new Patient(ID2, patientCondition.get(i), patientName.get(i));
                            Patient = patient;
                            System.out.print("\n\n WELCOME "+patient.getName()+"!");
                            found = true;
                            break;
                        }
                    }
                    if(found==false)
                    {
                        found = false;
                        System.out.print("\n\n ID NOT FOUND! PLEASE ENTER AGAIN!\n\n --> ");
                        ID = scan.next();
                    }
                }
                else{found=false;
                    System.out.println("\n\n ID NOT FOUND!  PLEASE ENTER AGAIN \n\n------>");
                    ID=scan.next();
                }
            }
            if(ID.substring(0, 1).equals("P"))
            {
                System.out.print("\n\n ~ APPOINTMENT REGISTERATION ~ \n\n CHOOSE YOUR CONDITION: \n  1 - BONES (ENTER 1)\n  2 - SKIN (ENTER 2)\n  3 - HEART (ENTER 3)\n  4 - OTHER (ENTER 4)\n\n --> ");
                op = scan.nextInt();
                
                while(op!=1 && op!=2 && op!=3 && op!=4) // option entry validation
                {
                    System.out.print("\n INVALID OPTION! PLEASE ENTER AGAIN!\n --> ");
                    op = scan.nextInt();
                }

                if(op==1)
                    Patient.setCondition("BONES");
                else if(op==2)
                    Patient.setCondition("SKIN");
                else if(op==3)
                    Patient.setCondition("HEART");
                else
                    Patient.setCondition("OTHER");

                for(int i=0; i<doctorSpecial.size(); i++)
                {
                    if(doctorSpecial.get(i).equals(Patient.getCondition()))
                        docName = doctorName.get(i);
                }

                System.out.print(" \n\n CHOOSE YOUR HOSPITAL BRANCH: \n  1 - SMOUHA (ENTER 1)\n  2 - IBRAHMYA (ENTER 2)\n  3 - LOURAN (ENTER 3)\n  4 - VICOTRIA (ENTER 4)\n\n --> ");
                op = scan.nextInt();

                Hospital hospital = new Hospital();

                if(op==1)
                    hospital.setLocation("SMOUHA");
                else if(op==2)
                    hospital.setLocation("IBRAHMYA");
                else if(op==3)
                    hospital.setLocation("LOURAN");
                else
                    hospital.setLocation("VICTORIA");
                
                Appointment appointment = new Appointment(Patient.getName(), date, Patient.getCondition(), docName, hospital.getLocation(), price);

                System.out.print(" --------------------------------------------------------------------------------------------------------------\n"+
                                  "|                                    ~~~~~~~ APPOINTMENT RECIEPT ~~~~~~~                       .0.                |"
                                  +"\n|                                                                                                             |"
                                  +"\n| PATIENT NAME: "+appointment.getPName()+"                                                        HOSPITAL BRANCH: "+appointment.getLocation()+"        |"
                                  +"\n|                                                                                                             |"
                                  +"\n|                                                                                                             |"
                                  +"\n| PATIENT CONDITON: "+appointment.getCondition()+"                                                      DOCTOR NAME: DR."+appointment.getDName()+"         |"
                                  +"\n|                                                                                                             |"
                                  +"\n|                                                                                                             |"
                                  +"\n| DATE: "+appointment.getDate()+"                                           PRICE: "+appointment.getPrice()+" L.E                 |"
                                  +"\n|                                                                                                             |"
                                  +"\n --------------------------------------------------------------------------------------------------------------");


            }
            else
            {
                Hospital hospital = new Hospital();
                System.out.print("\n\n 1 - CHANGE HOSPITAL NAME (ENTER 1)\n 2 - CHANGE HOSPITAL ROOMS (ENTER 2) \n\n --> ");
                op = scan.nextInt();

                while(op!=1 && op!=2) // option entry validation
                {
                    System.out.print("\n INVALID OPTION! PLEASE ENTER AGAIN!\n --> ");
                    op = scan.nextInt();
                }

                if(op==1)
                {
                    System.out.print("\n\n ENTER NEW HOSPITAL NAME: ");
                    hosName = scan.next();
                    hospital.setName(hosName);
                    System.out.print("\n\n NAME CHANGED SUCESSFULLY!");

           
                }
                else
                {
                    System.out.print("\n\n ENTER NEW HOSPITAL ROOMS QUANITY: ");
                    rooms = scan.nextInt();
                    hospital.setRooms(rooms);
                    System.out.print("\n\n ROOMS QUANTITY CHANGED SUCESSFULLY!");
                }
        
            }
        }
        System.out.println("\n\n");
    }
    

}
