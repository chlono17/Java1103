package com.ocp16_exception;

import java.util.Arrays;
import java.util.List;

public class LoginSystem {
    private static List<String> users = Arrays.asList("john", "mary", "admin");
    public static boolean login(String userName) throws LoginException {
        boolean check = users.stream().filter(name -> name.equals(userName)).findFirst().isPresent();
        if (check == false) {   //if(!check)
            LoginException le = new LoginException("無此帳號");
            throw le;
            
        }
        
        return check;
    }
    public static void main(String[] args) {
        try {
            System.out.println(login("apple"));
            System.out.println(login("admin"));
        } catch (LoginException ex) {
            System.out.println(ex.getMessage());
            ex.怎麼辦();
        }
    }
}
