package controllers;

import play.*;
import play.mvc.*;

import models.Mahasiswa;

@With(Secure.class)
@CRUD.For(Mahasiswa.class)
public class MahasiswaController extends CRUD{
}