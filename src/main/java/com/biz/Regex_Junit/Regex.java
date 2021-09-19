package com.biz.Regex_Junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";

    public static void name(String name) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            System.out.println("\nYour name " + name + " is in correct format.");
        } else {
            System.out.println("\nYour name is not in format.");
            if (name.equals(User.first_name)) {
                User.firstname();
            } else if (name.equals(User.last_name)) {
                User.lastname();
            }
        }
    }

    public static void mail(String mailID) {
        regex = "^[a-z0-9]{1,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mailID);
        if (matcher.matches()) {
            System.out.println("\nYour mailID " + mailID + " is in correct format.");
        } else {
            System.out.println("\nYour mailID is not in format.");
            User.mail();
        }
    }

        public static void phonenumber(String phonenumber) {
            regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(phonenumber);
            if (matcher.matches()) {
                System.out.println("\nYour phone number " + phonenumber + " is in correct format.");
            } else {
                System.out.println("\nYour phone number is not in format.");
                User.phonenumber();
            }
        }

    public static void password(String password) {
        regex = "^(?=.*[!@#$%^&*+=])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("\nYour password " + password + " is in correct format.");
        } else {
            System.out.println("\nYour password is in incorrect format.");
            User.Password();
        }
    }
}

