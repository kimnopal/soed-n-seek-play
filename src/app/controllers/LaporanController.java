package controllers;

import play.*;
import play.mvc.*;

import models.Laporan;

@With(Secure.class)
@CRUD.For(Laporan.class)
public class LaporanController extends CRUD{
}