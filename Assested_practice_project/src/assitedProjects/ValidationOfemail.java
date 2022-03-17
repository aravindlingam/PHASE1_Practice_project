package assitedProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class ValidationOfemail {

    public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@" +  //part before @
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"; 
 
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
 
    /* driver function to check */
    public static void main(String[] args) 
    { 
        String email1 = "aravind@gmail.com"; 
        String email2 = "@gmail.com";
        String email3 = "aravindlingam007@gmail.com";
        String[] emails= {email1,email2,email3};
 
        for (int i = 0; i < emails.length; i++) {
            String email=emails[i];
            if (isValid(email)) 
                System.out.print(email + " is valid email "); 
            else
                System.out.print(email + " is invalid email"); 
 
            System.out.println();
        }
    } 
}