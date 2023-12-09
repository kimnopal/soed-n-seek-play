package controllers;

import play.*;
import play.mvc.*;

import models.JenisLaporan;

@With(Secure.class)
@CRUD.For(JenisLaporan.class)
public class JenisLaporanController extends CRUD{
}