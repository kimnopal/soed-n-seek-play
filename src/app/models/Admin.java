package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "admin",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
@DiscriminatorValue("admin")
public class Admin extends User {
	private int _no_staff;

	public void editMahasiswaPost() {
		throw new UnsupportedOperationException();
	}

	public void deleteMahasiswaPost() {
		throw new UnsupportedOperationException();
	}

	public void bannedMahasiswaUser() {
		throw new UnsupportedOperationException();
	}

	public int get_no_staff() {
		return this._no_staff;
	}

	public void set_no_staff(int _no_staff) {
		this._no_staff = _no_staff;
	}
}