package hspitalmanagement;

import java.util.*;
import java.text.SimpleDateFormat;

public class HspitalManagement {

    public static Scanner input = new Scanner(System.in);
    public static List doctorList = new ArrayList();
    public static List recList = new ArrayList();
    public static List patientList = new ArrayList();
    public static List bookingsList = new ArrayList();
    public static List romRecList = new ArrayList();
    public static int ID = 0;
    public static SimpleDateFormat myD = new SimpleDateFormat();
    public static Date dt = new Date();

    
    public static void printListOne() {
        System.out.println("\tHospital Project ===>");
        System.out.println("\t---------------------");
        System.out.println("\t\t1. responsible.");
        System.out.println("\t\t2. doctor.");
        System.out.println("\t\t3. Receptionlist");
        System.out.println("\t\t4. Exit");
        System.out.print("\tChoose one: ");
    }

    public static void responsible() {

        String docName;
        String recName;
        String patientName;

        while (true) {

            System.out.println("\tSpecial Access ===>");
            System.out.println("\t---------------------");
            System.out.println("\t\t1. Show Doctor List");
            System.out.println("\t\t2. Add Doctor");
            System.out.println("\t\t3. Edit Doctor Data");
            System.out.println("\t\t4. Delete Doctor");
            System.out.println("\t\t5. Show the list of receptionists");
            System.out.println("\t\t6. Add a receptionlist");
            System.out.println("\t\t7. Delete a receptionlist");
            System.out.println("\t\t8. Edit receptionists' data");
            System.out.println("\t\t9. Show patient List");
            System.out.println("\t\t10. Add a patient");
            System.out.println("\t\t11. Delete a patient");
            System.out.println("\t\t12. Edit patient data");
            System.out.println("\t\t13. Make an appointment");
            System.out.println("\t\t14. Show appointment list");
            System.out.println("\t\t15. Delete an appointment");
            System.out.println("\t\t16. Back");
            System.out.print("\tChoose one: ");
            int key = input.nextInt();
            switch (key) {
                case 1:
                    System.out.println("\tDoctor's List ===>");
                    System.out.println("\t---------------------\n");
                    doctorList.forEach((n) -> System.out.println(n));
                    break;
                case 2:
                    System.out.println("\tAdd Doctor ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter Doctor name: ");
                    docName = input.next();
                    boolean d = doctorList.contains(docName);
                    if (!d) {
                        doctorList.add(docName);
                        System.out.println("Doctor Saved!");
                    } else {
                        System.out.println("There is Same Doctor with this Data!");
                    }
                    break;

                case 3:
                    System.out.println("\tEdit Doctor ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter Doctor name: ");
                    docName = input.next();
                    d = doctorList.contains(docName);
                    if (!d) {
                        System.out.println("There is NOT Doctor with this Data!");
                    } else {
                        System.out.print("Enter Doctor's new name: ");
                        String newDocName = input.next();
                        doctorList.set(doctorList.indexOf(docName), newDocName);
                        System.out.printf("Doctor %s edited!\n", docName);
                    }
                    break;
                case 4:
                    System.out.println("\tDelete Doctor ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter Doctor name: ");
                    docName = input.next();
                    d = doctorList.contains(docName);
                    if (!d) {
                        System.out.println("There is NOT Doctor with this Data!");
                    } else {
                        doctorList.remove(docName);
                        System.out.printf("Doctor %s deleted!\n", docName);
                    }
                    break;
                case 5:
                    recList.forEach((n) -> System.out.println(n));
                    break;
                case 6:
                    System.out.println("\tAdd receptionist ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter receptionist name: ");
                    recName = input.next();
                    d = recList.contains(recName);
                    if (!d) {
                        recList.add(recName);
                        System.out.println("receptionlist Saved!");
                    } else {
                        System.out.println("There is Same receptionlist with this Data!");
                    }
                    break;
                case 7:
                    System.out.println("\tDelete receptionist ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter receptionist name: ");
                    recName = input.next();
                    d = recList.contains(recName);
                    if (!d) {
                        System.out.println("There is NOT receptionist with this Data!");
                    } else {
                        recList.remove(recName);
                        System.out.printf("Doctor %s deleted!\n", recName);
                    }
                    break;
                case 8:
                    System.out.println("\tEdit receptionist ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter receptionist name: ");
                    recName = input.next();
                    d = recList.contains(recName);
                    if (!d) {
                        System.out.println("There is NOT receptionist with this Data!");
                    } else {
                        System.out.print("Enter receptionist's new name: ");
                        String newrecName = input.next();
                        recList.set(recList.indexOf(recName), newrecName);
                        System.out.printf("receptionist %s edited!\n", recName);
                    }
                    break;
                case 9:
                    patientList.forEach((n) -> System.out.println(n));

                    break;
                case 10:
                    System.out.println("\tAdd patient ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter patient name: ");
                    patientName = input.next();
                    d = patientList.contains(patientName);
                    if (!d) {
                        patientList.add(patientName);
                        System.out.println("patient Saved!");
                    } else {
                        System.out.println("There is Same patient with this Data!");
                    }
                    break;
                case 11:
                    System.out.println("\tDelete patient ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter patient name: ");
                    patientName = input.next();
                    d = patientList.contains(patientName);
                    if (!d) {
                        System.out.println("There is NOT patient with this Data!");
                    } else {
                        patientList.remove(patientName);
                        System.out.printf("patient %s deleted!\n", patientName);
                    }
                    break;
                case 12:
                    System.out.println("\tEdit patient ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter patient name: ");
                    patientName = input.next();
                    d = patientList.contains(patientName);
                    if (!d) {
                        System.out.println("There is NOT patient with this Data!");
                    } else {
                        System.out.print("Enter patient's new name: ");
                        String newpatientName = input.next();
                        patientList.set(patientList.indexOf(patientName), newpatientName);
                        System.out.printf("patient %s edited!\n", patientName);
                    }
                    break;
                case 13:
                    System.out.println("\tGet ticket ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter patient name: ");
                    patientName = input.next();
                    System.out.print("Enter Doctor name: ");
                    docName = input.next();
                    d = doctorList.contains(docName);
                    if (d) {
                        ID++;
                        String booking = "\tID:" + ID + "\n\tpatient Name:" + patientName +
                                "\n\tDr. " + docName + "\n\t" + myD.format(dt) + "\n\t---------------------";
                        patientList.add(patientName);
                        bookingsList.add(booking);
                        romRecList.add(ID - 1);
                    } else {
                        System.out.println("There is NOT Doctor with this Data!");
                    }

                    break;
                case 14:
                    System.out.println("\tList of appointments ===>");
                    System.out.println("\t---------------------\n");
                    bookingsList.forEach((n) -> System.out.println(n));
                    break;
                case 15:
                    System.out.println("\tDelete appointments ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter appointment ID: ");

                    int num = input.nextInt();
                    d = romRecList.contains(num-1);
                    if (d) {
                    bookingsList.remove(num - 1);
                    romRecList.remove(num - 1);
                    }else{
                    System.out.println("There is NOT ID with this Data!");
                    }
                    break;
                case 16:
                    return;
            }
        }
    }

    public static void doctor() {
        while (true) {

            System.out.println("\tHospital Project ===>");
            System.out.println("\t---------------------");
            System.out.println("\t\t1. View appointments..");
            System.out.println("\t\t2. back.");
            System.out.print("\tChoose one: ");
            int key = input.nextInt();
            switch (key) {
                case 1:
                    bookingsList.forEach((n) -> System.out.println(n));
                    break;
                case 2:
                    return;
            }
        }
    }

    public static void Receptionlist() {
        while (true) {

            System.out.println("\tHospital Project ===>");
            System.out.println("\t---------------------");
            System.out.println("\t\t1. Make an appointment.");
            System.out.println("\t\t2. Show appointment list.");
            System.out.println("\t\t3. Delete an appointment.");
            System.out.println("\t\t4. Add a patient.");
            System.out.println("\t\t5. Show patient List.");
            System.out.println("\t\t6. Edit patient data.");
            System.out.println("\t\t7. Delete a patient .");
            System.out.println("\t\t8. back.");
            System.out.print("\tChoose one: ");
            int key = input.nextInt();
            switch (key) {
                case 1:
                    System.out.println("\tGet ticket ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter patient name: ");
                    String patientName = input.next();
                    System.out.print("Enter Doctor name: ");
                    String docName = input.next();
                    boolean d = doctorList.contains(docName);
                    
                    if (d) {
                        ID++;
                        String booking = "\tID:" + ID + "\n\tpatient Name:" + patientName +
                                "\n\tDr. " + docName + "\n\t" + myD.format(dt) + "\n\t---------------------";
                        patientList.add(patientName);
                        bookingsList.add(booking);
                        romRecList.add(ID - 1);
                    } else {
                        System.out.println("There is NOT Doctor with this Data!");
                    }

                    break;
                case 2:
                    System.out.println("\tList of appointments ===>");
                    System.out.println("\t---------------------\n");
                    bookingsList.forEach((n) -> System.out.println(n));
                    break;
                case 3:
                    System.out.println("\tDelete appointments ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter appointment ID: ");

                    int num = input.nextInt();
                    d = romRecList.contains(num-1);
                    if (d) {
                    bookingsList.remove(num - 1);
                    romRecList.remove(num - 1);
                    }else{
                    System.out.println("There is NOT ID with this Data!");
                    }
                    break;
                case 4:
                    System.out.println("\tAdd patient ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter patient name: ");
                    patientName = input.next();
                    d = patientList.contains(patientName);
                    if (!d) {
                        patientList.add(patientName);
                        System.out.println("patient Saved!");
                    } else {
                        System.out.println("There is Same patient with this Data!");
                    }
                    break;
                case 5:
                    patientList.forEach((n) -> System.out.println(n));
                    
                case 6:
                    System.out.println("\tEdit patient ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter patient name: ");
                    patientName = input.next();
                    d = patientList.contains(patientName);
                    if (!d) {
                        System.out.println("There is NOT patient with this Data!");
                    } else {
                        System.out.print("Enter patient's new name: ");
                        String newpatientName = input.next();
                        patientList.set(patientList.indexOf(patientName), newpatientName);
                        System.out.printf("patient %s edited!\n", patientName);
                    }
                    break;
                case 7:
                    System.out.println("\tDelete patient ===>");
                    System.out.println("\t---------------------\n");
                    System.out.print("Enter patient name: ");
                    patientName = input.next();
                    d = patientList.contains(patientName);
                    if (!d) {
                        System.out.println("There is NOT patient with this Data!");
                    } else {
                        patientList.remove(patientName);
                        System.out.printf("patient %s deleted!\n", patientName);
                    }
                    break;
                case 8:
                    return;

            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String USERNAME = "admin";
        String PASSWORD = "admin";
        while (true) {
            printListOne();
            int key = input.nextInt();
            // Special access
            switch (key) {
                case 1:
                    System.out.println("\t--------------");
                    System.out.print("\tUsername: ");
                    String username = input.next();
                    System.out.print("\tPassword: ");
                    String password = input.next();
                    if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                        System.out.println("\t-----------------------");
                        System.out.println("\tWelcome to Special part");
                        responsible();

                    } else {
                        System.out.println("\t------------------------------");
                        System.out.println("\tUsername or Password is wrong!");
                        System.out.println("Try again...");
                        main(args);
                    }
                    break;
                case 2:
                    doctor();
                    break;
                case 3:
                    Receptionlist();
                    break;
                case 4:
                    System.out.println("Have nice time");
                    System.exit(0);
                    break;
            }
        }
    }
}
