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
}