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
	public Vector<Post> _post = new Vector<Post>();
}