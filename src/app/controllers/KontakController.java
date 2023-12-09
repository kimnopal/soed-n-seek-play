package controllers;

import play.*;
import play.mvc.*;

import models.Kontak;

@With(Secure.class)
@CRUD.For(Kontak.class)
public class KontakController extends CRUD{
}