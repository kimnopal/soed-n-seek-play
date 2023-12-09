package controllers;
 
import play.*;
import play.mvc.*;
 
import models.Post;

@With(Secure.class)
@CRUD.For(Post.class)
public class PostController extends CRUD {
   
}