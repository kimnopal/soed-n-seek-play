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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type")
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

	public int get_iD() {
		return this._iD;
	}

	public void set_iD(int _iD) {
		this._iD = _iD;
	}

	public String get_nama() {
		return this._nama;
	}

	public void set_nama(String _nama) {
		this._nama = _nama;
	}

	public String get_email() {
		return this._email;
	}

	public void set_email(String _email) {
		this._email = _email;
	}

	public String get_password() {
		return this._password;
	}

	public void set_password(String _password) {
		this._password = _password;
	}

	public String get_username() {
		return this._username;
	}

	public void set_username(String _username) {
		this._username = _username;
	}
}