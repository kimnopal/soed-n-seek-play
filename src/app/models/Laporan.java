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
	public Post _post;
	public Mahasiswa _mhs;
	public JenisLaporan _jenis;
}