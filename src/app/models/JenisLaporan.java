package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "jenis_laporan")
public class JenisLaporan extends Model {
	private String value;

	@OneToMany(mappedBy = "jenisLaporan")
	public Collection<Laporan> laporan;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Collection<Laporan> getLaporan() {
		return this.laporan;
	}

	public void setLaporan(Collection<Laporan> laporan) {
		this.laporan = laporan;
	}
}