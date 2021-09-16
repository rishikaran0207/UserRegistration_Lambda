package com.biz.Regex_Junit;
import java.util.Scanner;
public class User {
    public static Scanner scan = new Scanner(System.in);
    public static String first_name,last_name,mail_ID;

    public static void main(String[] args) {
        User details = new User();
        details.firstname();
        details.lastname();
        details.mail();

    }


    public static void firstname() {
        System.out.println("\nEnter the first name \n first letter capital and minimum 3 letters:");
        first_name = scan.next();
        Regex.name(first_name);
    }
    public static void lastname() {
        System.out.println("\nEnter the last name \n first letter capital and  minimum 3 letters:");
        last_name = scan.next();
        Regex.name(last_name);
    }
    public static void mail() {
        System.out.println("\nEnter the mail with following valid format:");
        System.out.println("\nFormat is E.g. abc.xyz@bl.co.in (In that abc, bl & co is mandatory)");
        mail_ID = scan.next();
        Regex.mail(mail_ID);
    }

}

