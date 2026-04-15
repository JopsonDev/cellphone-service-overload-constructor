package com.pluarlsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        newPhone(scanner, phone1);
        newPhone(scanner, phone2);

        System.out.println("Please enter phone information:");
        System.out.print("Serial Number: ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Carrier: ");
        String carrier = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Owner: ");
        String owner = scanner.nextLine();

        CellPhone phone3 = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        display(phone1);
        display(phone2);
        display(phone3);

        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone3.getPhoneNumber());
        phone3.dial(phone1.getPhoneNumber());
        phone2.dial(phone3);

        System.out.println("Please enter the number you want to call: ");
        String callNumber = scanner.nextLine();

        phone1.dial(callNumber);
        scanner.close();
    }
    public static void display(CellPhone phone){
        System.out.println("Phone Information:\n" + phone.getSerialNumber() + "\n" + phone.getModel() + "\n" + phone.getCarrier() + "\n" + phone.getPhoneNumber() + "\n" + phone.getOwner() + "\n");
    }
    public static void newPhone(Scanner scanner, CellPhone phone) {
        System.out.println("Please enter phone information:");
        System.out.print("Serial Number: ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Carrier: ");
        String carrier = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Owner: ");
        String owner = scanner.nextLine();
        System.out.println("-----------------------------------------------------------------------");

        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

    }
}
