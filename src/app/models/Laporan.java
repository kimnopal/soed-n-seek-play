package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "laporan",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class Laporan extends Model {
	private int _iD;
	private String _value;
	private String _tanggal_dibuat;
	
	@ManyToOne
	public Post _post;
	
	@ManyToOne
	public Mahasiswa _mhs;

	@ManyToOne
	public JenisLaporan _jenis;


	public int get_iD() {
		return this._iD;
	}

	public void set_iD(int _iD) {
		this._iD = _iD;
	}

	public String get_value() {
		return this._value;
	}

	public void set_value(String _value) {
		this._value = _value;
	}

	public String get_tanggal_dibuat() {
		return this._tanggal_dibuat;
	}

	public void set_tanggal_dibuat(String _tanggal_dibuat) {
		this._tanggal_dibuat = _tanggal_dibuat;
	}

	public Post get_post() {
		return this._post;
	}

	public void set_post(Post _post) {
		this._post = _post;
	}

	public Mahasiswa get_mhs() {
		return this._mhs;
	}

	public void set_mhs(Mahasiswa _mhs) {
		this._mhs = _mhs;
	}

	public JenisLaporan get_jenis() {
		return this._jenis;
	}

	public void set_jenis(JenisLaporan _jenis) {
		this._jenis = _jenis;
	}
}