package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "jenis_laporan",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class JenisLaporan extends Model {
	private int _iD;
	private String _value;
	@OneToMany
	public Vector<Laporan> _laporan = new Vector<Laporan>();
}