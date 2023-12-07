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
	@ManyToOne
	public Mahasiswa _mhs;
	@ManyToOne
	public Post _post;
}