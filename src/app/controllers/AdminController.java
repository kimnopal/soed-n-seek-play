package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

@With(Secure.class)
public class AdminController extends Controller {
    @Before
    static void setConnectedUser() {
        if(Security.isConnected()) {
            User user = User.find("username", Security.connected()).first();
            String[] userData = {user.getNama(), Long.toString(user.getId())};
            renderArgs.put("user", userData);
        }
    }
 
    public static void index() {
        render();
    }

    public static void myPosts() {
        String id = params.get("id");
        List<Post> posts = Post.find("user_id", id).fetch();
        render(posts);
    }
}