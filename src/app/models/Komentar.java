package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "komentar")
public class Komentar extends Model{
	private String value;

	@Column(name = "tanggal_dibuat")
	private String tanggalDibuat;

	@ManyToOne
	@JoinColumn(name = "mahasiswa_id")
	public Mahasiswa mahasiswa;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	public Post post;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getTanggalDibuat() {
		return this.tanggalDibuat;
	}

	public void setTanggalDibuat(String tanggalDibuat) {
		this.tanggalDibuat = tanggalDibuat;
	}

	public Mahasiswa getMahasiswa() {
		return this.mahasiswa;
	}

	public void setMahasiswa(Mahasiswa mahasiswa) {
		this.mahasiswa = mahasiswa;
	}

	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
}