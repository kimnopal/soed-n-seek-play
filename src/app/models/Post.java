package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "post")
public class Post extends Model {	
	private String judul;
	private String deskripsi;
	private String foto;

	@Column(name = "tanggal_dibuat")
	private String tanggalDibuat;
    
	@ManyToOne
	@JoinColumn(name = "user_id")
	public User user;
	
	@OneToMany(mappedBy = "post")
	public Collection<Komentar> komentar;

	@OneToMany(mappedBy = "post")
	public Collection<Laporan> laporan;

	@OneToMany(mappedBy = "post")
	public Collection<Kontak> kontak;

	@ManyToOne
	@JoinColumn(name = "status_kehilangan_id")
	public StatusKehilangan statusKehilangan;

	public String getJudul() {
		return this.judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getDeskripsi() {
		return this.deskripsi;
	}

	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getTanggalDibuat() {
		return this.tanggalDibuat;
	}

	public void setTanggalDibuat(String tanggalDibuat) {
		this.tanggalDibuat = tanggalDibuat;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Collection<Komentar> getKomentar() {
		return this.komentar;
	}

	public void setKomentar(Collection<Komentar> komentar) {
		this.komentar = komentar;
	}

	public Collection<Laporan> getLaporan() {
		return this.laporan;
	}

	public void setLaporan(Collection<Laporan> laporan) {
		this.laporan = laporan;
	}

	public Collection<Kontak> getKontak() {
		return this.kontak;
	}

	public void setKontak(Collection<Kontak> kontak) {
		this.kontak = kontak;
	}

	public StatusKehilangan getStatusKehilangan() {
		return this.statusKehilangan;
	}

	public void setStatusKehilangan(StatusKehilangan statusKehilangan) {
		this.statusKehilangan = statusKehilangan;
	}
}