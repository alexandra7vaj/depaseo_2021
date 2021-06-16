package com.proyectofinal.depaseo;

//import java.util.HashMap; ¿?

import javax.persistence.Id;
import javax.persistence.Table;

//import object.Ruta; ¿?

@Table
public class Usuario {
	@Id
	private int id;
	public String name;
	public String surname;
	public String email;
	public String password;
	//public HashMap<String, Ruta> rutes;
	// ArrayList rutes o usuario;
	
	// **********Constructor***********************************************************
	
	public Usuario(int id, String name, String surname, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
	}
	
    // *******Getters && Setters**************
	
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	// **********ToString***************************************
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", password="
				+ password + "]";
	}
	

}
