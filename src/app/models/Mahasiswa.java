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
public class Mahasiswa extends User {
	private String _nim;
	private String _jurusan;
	public Vector<Komentar> _komentar = new Vector<Komentar>();
	public Vector<Laporan> _laporan = new Vector<Laporan>();

	public void createComment() {
		throw new UnsupportedOperationException();
	}

	public void editComment() {
		throw new UnsupportedOperationException();
	}

	public void deleteComment() {
		throw new UnsupportedOperationException();
	}
}