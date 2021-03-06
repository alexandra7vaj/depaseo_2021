package controller;

import java.util.ArrayList; // import object.Ruta;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity; // intitat aplication properties - conección con BD H2
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import java.util.HashMap; ¿?


@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public String name;
	public String username;
	public String email;
	public String password;
	public boolean isValidated = false;
	public boolean isBlocked = false;
  //public HashMap<String, Ruta> rutes;

	
//Defining relationship type: One to Many
	
	@OneToMany (mappedBy= "user", cascade = CascadeType.ALL)
	private List<Route> routes = new ArrayList <>();
	
	//comentario
	
	
	
//--------Constructor-------------
	
	public User(String name, String userName, String email, String password,
			boolean isValidated, boolean isBlocked, ArrayList<Route> routes) {
		super();
		//this.id = id; innecesario porque el @id de JPA ya me lo crea
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.isValidated = isValidated;
		this.isBlocked = isBlocked;
		this.routes = routes;
	}


	public User() {
		super();}
	
	
// -----Getters and Setters----------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValidated() {
		return isValidated;
	}

	public void setValidated(boolean isValidated) {
		this.isValidated = isValidated;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(ArrayList<Route> routes) {
		this.routes = routes;
	}
	
// ------ToString------------

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", email="
				+ email + ", password=" + password + ", isValidated=" + isValidated + ", isBlocked=" + isBlocked
				+ ", routes=" + routes + "]";
		
	}
}
	
    
	
	
	
	
	

