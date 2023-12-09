package controllers;

import play.*;
import play.mvc.*;

import models.Komentar;

@With(Secure.class)
@CRUD.For(Komentar.class)
public class KomentarController extends CRUD{
}