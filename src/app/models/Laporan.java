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
}