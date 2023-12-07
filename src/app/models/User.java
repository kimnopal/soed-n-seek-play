package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "user",
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"id"})
		}
)
public class User extends Model {
	private int _iD;
	private String _nama;
	private String _email;
	private String _password;
	private String _username;

	public void login() {
		throw new UnsupportedOperationException();
	}

	public void logout() {
		throw new UnsupportedOperationException();
	}

	public void createPost() {
		throw new UnsupportedOperationException();
	}

	public void editPost() {
		throw new UnsupportedOperationException();
	}

	public void deletePost() {
		throw new UnsupportedOperationException();
	}
}