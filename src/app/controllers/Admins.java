package controllers;

import play.*;
import play.mvc.*;

import models.Admin;

@With(Secure.class)
@CRUD.For(Admin.class)
public class Admins extends CRUD{
}