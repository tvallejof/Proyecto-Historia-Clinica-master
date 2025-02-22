package Menus;

import Register.*;
import Users.*;

import java.util.Scanner;

public class NormalMenu {
    /**
     * Menu secundario donde se hace un logging para acceder como usuario, ya dentro se
     * puede operar con el sistema a traves del menú asignado segun el rol, (patientMenu
     * para patients por ejemplo)
     *
     */
    Scanner scanner;
    Engine engine = new Engine();
    User user;

    public NormalMenu(Scanner scanner){
        this.scanner = scanner;
    }
    public void run(){
        while(true){
            System.out.println("Insert your info");

            try {
                System.out.println("UserName: ");
                String userName = scanner.nextLine();

                System.out.println("Password: ");
                String password = scanner.nextLine();

                //Distición entre los tipos de roles
                user = engine.login(userName,password);
                if(user instanceof Patient){
                    patientMenu();
                    break;
                }else if(user instanceof Doctor) {
                    doctorMenu();
                    break;
                }else if(user instanceof Admin) {
                    adminMenu();
                    break;
                }else{
                    System.out.println("Invalid user name or password");
                }
            }catch (Exception e){
                System.out.println("Error " + e);
            }
        }
    }
    void patientMenu(){
        int option = -1;
        while (option != 0){
            System.out.println("----PATIENT MENU----");
            System.out.println("Choose one option:");
            System.out.println("1-Show all my info");
            System.out.println("2-Show my clinical history");
            System.out.println("0-Exit");
            try {
                option = scanner.nextInt();
                switch (option){
                    case 1 ->{
                        System.out.println("shows all my info");
                    }case 2 ->{
                        System.out.println("shows all my clinical history");
                    }case 0 ->{
                        System.out.println("Goodbye");
                    }
                }
            }catch (Exception e){
                System.out.println("Error " + e);
            }
        }
    }
    void adminMenu(){
        int option = -1;
        while (option != 0){
            System.out.println("----ADMIN MENU----");
            System.out.println("Choose one option:");
            System.out.println("1-Create");
            System.out.println("2-Delete");
            System.out.println("3-Edit");
            System.out.println("0-Exit");
            try {
                option = scanner.nextInt();
                switch (option){
                    case 1 ->{
                        System.out.println("shows all the info");
                    }case 2 ->{
                        System.out.println("shows all the clinical history");
                    }case 0 ->{
                        System.out.println("Goodbye");
                    }
                }
            }catch (Exception e){
                System.out.println("Error " + e);
            }
        }
    }
    void doctorMenu(){
        int option = -1;
        while (option != 0){
            System.out.println("----DOCTOR MENU----");
            System.out.println("Choose one option:");
            System.out.println("1-Show all my info");
            System.out.println("2-Show all my patients");
            System.out.println("3-Add a new patient");
            System.out.println("4-Make a prescription to one of my patients");
            System.out.println("0-Exit");
            try {
                option = scanner.nextInt();
                switch (option){
                    case 1 ->{

                    }case 2 ->{

                    }case 3 ->{

                    }case 4 ->{

                    }case 0 ->{
                        System.out.println("Goodbye");
                    }
                }
            }catch (Exception e){
                System.out.println("Error " + e);
            }
        }
    }
}
