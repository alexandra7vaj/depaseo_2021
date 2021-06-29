package controller;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Route {
	
	@Id
	private int id;
	public String name;
	public String type; // tipo Gastranomico, Historico, Arquitectónico, familiar, festeo...
	public int location; 
	public HashMap<String, Route> routes; // este hashmap nos permitirá guardar objetos con las informaciones
                                          //de geolocalización y asociarlos a un tag.

// **********Constructor***********************************************************
	
public Route(int id, String name, String type, int location, HashMap<String, Route> routes) {
	super();
	this.id = id;
	this.name = name;
	this.type = type;
	this.location = location;
	this.routes = new HashMap <String, Route>(); //¿?
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
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getLocation() {
	return location;
}
public void setLocation(int location) {
	this.location = location;
}
public HashMap<String, Route> getRoutes() {
	return routes;
}
public void setRoutes(HashMap<String, Route> routes) {
	this.routes = routes;
}

//**********ToString***************************************

@Override
public String toString() {
	return "Route [id=" + id + ", name=" + name + ", type=" + type + ", location=" + location + ", routes=" + routes
			+ "]";
    }
}

