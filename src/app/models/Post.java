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
    
	@OneToMany
	public Vector<Komentar> _komentar = new Vector<Komentar>();
	@OneToMany
	public Vector<Laporan> _laporan = new Vector<Laporan>();
	@OneToMany
	public Vector<Kontak> _kontak = new Vector<Kontak>();
	@ManyToOne
	public StatusKehilangan _status;
}