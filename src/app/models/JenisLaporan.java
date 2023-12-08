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
	public Collection<Laporan> _laporan;

	public int get_iD() {
		return this._iD;
	}

	public void set_iD(int _iD) {
		this._iD = _iD;
	}

	public String get_value() {
		return this._value;
	}

	public void set_value(String _value) {
		this._value = _value;
	}

	public Collection<Laporan> get_laporan() {
		return this._laporan;
	}

	public void set_laporan(Collection<Laporan> _laporan) {
		this._laporan = _laporan;
	}
}