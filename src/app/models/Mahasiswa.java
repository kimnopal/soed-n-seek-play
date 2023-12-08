package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "mahasiswa",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
@DiscriminatorValue("mahasiswa")
public class Mahasiswa extends User {
	private String _nim;
	private String _jurusan;
	
	@OneToMany
	public Collection<Komentar> _komentar;

	@OneToMany
	public Collection<Laporan> _laporan;

	public void createComment() {
		throw new UnsupportedOperationException();
	}

	public void editComment() {
		throw new UnsupportedOperationException();
	}

	public void deleteComment() {
		throw new UnsupportedOperationException();
	}

	public String get_nim() {
		return this._nim;
	}

	public void set_nim(String _nim) {
		this._nim = _nim;
	}

	public String get_jurusan() {
		return this._jurusan;
	}

	public void set_jurusan(String _jurusan) {
		this._jurusan = _jurusan;
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
}