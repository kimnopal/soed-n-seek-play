package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "komentar",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class Komentar extends Model{
	private int _iD;
	private String _value;
	private String _tanggal_dibuat;
	public Mahasiswa _mhs;
	public Post _post;
}