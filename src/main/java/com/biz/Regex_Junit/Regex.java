package com.biz.Regex_Junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static String regex;

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
}

