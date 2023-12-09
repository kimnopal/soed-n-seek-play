package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
@Table(name = "status_kehilangan")
public class StatusKehilangan extends Model {
	private String value;

	@OneToMany(mappedBy = "statusKehilangan")
	public Collection<Post> post;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Collection<Post> getPost() {
		return this.post;
	}

	public void setPost(Collection<Post> post) {
		this.post = post;
	}
}