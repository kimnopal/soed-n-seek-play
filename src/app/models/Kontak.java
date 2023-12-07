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
}