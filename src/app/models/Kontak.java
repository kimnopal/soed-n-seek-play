package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "kontak",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class Kontak extends Model {
	private int _iD;
	private String _jenis;
	private String _value;

	@ManyToOne
	public Post _post;

	public int get_iD() {
		return this._iD;
	}

	public void set_iD(int _iD) {
		this._iD = _iD;
	}

	public String get_jenis() {
		return this._jenis;
	}

	public void set_jenis(String _jenis) {
		this._jenis = _jenis;
	}

	public String get_value() {
		return this._value;
	}

	public void set_value(String _value) {
		this._value = _value;
	}

	public Post get_post() {
		return this._post;
	}

	public void set_post(Post _post) {
		this._post = _post;
	}
}