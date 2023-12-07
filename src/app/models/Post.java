package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "post",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class Post extends Model {
	private int _iD;
	private String _judul;
	private String _deskripsi;
	private String _foto;
	private String _tanggal_dibuat;
	public Vector<Komentar> _komentar = new Vector<Komentar>();
	public Vector<Laporan> _laporan = new Vector<Laporan>();
	public Vector<Kontak> _kontak = new Vector<Kontak>();
	public StatusKehilangan _status;
}