package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@DiscriminatorValue("admin")
public class Admin extends User {
	private int no_staff;

	public void editMahasiswaPost() {
		throw new UnsupportedOperationException();
	}

	public void deleteMahasiswaPost() {
		throw new UnsupportedOperationException();
	}

	public void bannedMahasiswaUser() {
		throw new UnsupportedOperationException();
	}

	public int getNo_staff() {
		return this.no_staff;
	}

	public void setNo_staff(int no_staff) {
		this.no_staff = no_staff;
	}
}