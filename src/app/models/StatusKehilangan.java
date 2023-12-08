package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "status_kehilangan",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class StatusKehilangan extends Model {
	private int _iD;
	private String _value;

	@OneToMany
	public Collection<Post> _post;

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

	public Collection<Post> get_post() {
		return this._post;
	}

	public void set_post(Collection<Post> _post) {
		this._post = _post;
	}
}