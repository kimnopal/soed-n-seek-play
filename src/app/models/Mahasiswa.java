package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@DiscriminatorValue("mahasiswa")
public class Mahasiswa extends User {
	private String nim;
	private String jurusan;
	
	@OneToMany(mappedBy = "mahasiswa")
	public Collection<Komentar> komentar;

	@OneToMany(mappedBy = "mahasiswa")
	public Collection<Laporan> laporan;

	public void createComment() {
		throw new UnsupportedOperationException();
	}

	public void editComment() {
		throw new UnsupportedOperationException();
	}

	public void deleteComment() {
		throw new UnsupportedOperationException();
	}

	public String getNim() {
		return this.nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getJurusan() {
		return this.jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
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
}