package controllers;

import play.*;
import play.mvc.*;
import play.db.jpa.*;

import java.util.*;
import javax.persistence.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        List<Post> posts = Post.findAll();
        render(posts);
    }

}