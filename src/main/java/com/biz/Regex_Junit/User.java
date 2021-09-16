package com.biz.Regex_Junit;
import java.util.Scanner;
public class User {
    public static Scanner scan = new Scanner(System.in);
    public static String first_name;

    public static void main(String[] args) {
        User details = new User();
        details.firstname();

    }


    public static void firstname() {
        System.out.println("\nEnter the first name \n first letter capital and minimum 3 letters:");
        first_name = scan.next();
        Regex.name(first_name);
    }

}

