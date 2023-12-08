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
	public Collection<Komentar> _komentar;

	@OneToMany
	public Collection<Laporan> _laporan;

	@OneToMany
	public Collection<Kontak> _kontak;

	@ManyToOne
	public StatusKehilangan _status;

	public int get_iD() {
		return this._iD;
	}

	public void set_iD(int _iD) {
		this._iD = _iD;
	}

	public String get_judul() {
		return this._judul;
	}

	public void set_judul(String _judul) {
		this._judul = _judul;
	}

	public String get_deskripsi() {
		return this._deskripsi;
	}

	public void set_deskripsi(String _deskripsi) {
		this._deskripsi = _deskripsi;
	}

	public String get_foto() {
		return this._foto;
	}

	public void set_foto(String _foto) {
		this._foto = _foto;
	}

	public String get_tanggal_dibuat() {
		return this._tanggal_dibuat;
	}

	public void set_tanggal_dibuat(String _tanggal_dibuat) {
		this._tanggal_dibuat = _tanggal_dibuat;
	}

	public Collection<Komentar> get_komentar() {
		return this._komentar;
	}

	public void set_komentar(Collection<Komentar> _komentar) {
		this._komentar = _komentar;
	}

	public Collection<Laporan> get_laporan() {
		return this._laporan;
	}

	public void set_laporan(Collection<Laporan> _laporan) {
		this._laporan = _laporan;
	}

	public Collection<Kontak> get_kontak() {
		return this._kontak;
	}

	public void set_kontak(Collection<Kontak> _kontak) {
		this._kontak = _kontak;
	}

	public StatusKehilangan get_status() {
		return this._status;
	}

	public void set_status(StatusKehilangan _status) {
		this._status = _status;
	}
}