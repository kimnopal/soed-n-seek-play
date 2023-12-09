package controllers;

import play.*;
import play.mvc.*;

import models.StatusKehilangan;

@With(Secure.class)
@CRUD.For(StatusKehilangan.class)
public class StatusKehilanganController extends CRUD{
}