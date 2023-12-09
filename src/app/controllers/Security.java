package controllers;
 
import models.*;
 
public class Security extends Secure.Security {
	
    static boolean authenticate(String username, String password) {
        User user = User.find("username", username).first();
        if(user != null) {
            if(password.equals(user.getPassword())) {
                return true;
            }
        }

        return false;
    }

    static void onDisconnected() {
        Application.index();
    }
    
    static void onAuthenticated() {
        AdminController.index();
    }

    static boolean check(String profile) {
        if("admin".equals(profile)) {
            return User.find("username", connected()).<User>first() instanceof Admin;
        }
        return false;
    }

}