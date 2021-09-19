package com.biz.Regex_Test;

import com.biz.Regex_Junit.MoodAnalyser;
import com.biz.Regex_Junit.ValidateDetailsTest;
import com.biz.Regex_Junit.MyException;
import org.junit.Assert;
import org.junit.Test;


public class DetailsTest {

    @Test
    public void moodtest() {
        String expectedresult = "HAPPY";
        String actualresult = MoodAnalyser.moodanalyze("HAPPY");
        Assert.assertEquals(expectedresult, actualresult);
    }


    @Test
    public void firstname() throws MyException {
        String firstname = "Ragul";
        Assert.assertTrue(ValidateDetailsTest.checkFirstname(firstname));
    }

    @Test
    public void lastname() throws MyException {
        String lastname = "Kanna";
        Assert.assertTrue(ValidateDetailsTest.checkLastname(lastname));
    }

    @Test
    public void mail() throws MyException {
        String mail = "ragulragi619@gmail.com";
        Assert.assertTrue(ValidateDetailsTest.checkMail(mail));
    }

    @Test
    public void phonenumber() throws MyException {
        String phonenumber = "91 9004265745";
        Assert.assertTrue(ValidateDetailsTest.checkPhonenumber(phonenumber));
    }

    @Test
    public void password() throws MyException {
        String password = "Kanna@1234";
        Assert.assertTrue(ValidateDetailsTest.checkPassword(password));
    }

}