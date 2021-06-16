package com.proyectofinal.depaseo;

//import java.util.HashMap;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class Ruta {
	@Id
	private int id;
	public String name;
	public String type; // tipo Gastranomico, Historico, Arquitectónico, familiar, festeo...
	public String location; // ubicación
	
	//******Constructor**********************************
	
	public Ruta(int id, String name, String type, String location) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.location = location;
	}
	
	// *******Getters && Setters******************************

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	// ********ToString************************************
	@Override
	public String toString() {
		return "Ruta [id=" + id + ", name=" + name + ", type=" + type + ", location=" + location + "]";
	}
	
	
	
	
	
}
