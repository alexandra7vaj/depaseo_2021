package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping ("/routecontroller")
public class RouteController {
	
@Autowired
RouteRepository routeRepository;


//-----------CRUD----------------
//-------------------------------
//-------------------------------
	
//-----------Create----------------
	@RequestMapping ("/newroute")
public String newRoute() {
		return "newroute";
		
	}	

@RequestMapping ("/addroute")
public String addRoute() {	
	return "addroute";	
}


	//-----------Update----------------
@RequestMapping ("/updateroute")
public String updateRoute() {
	return "updateroute";		
}


	//-----------Delete----------------
@RequestMapping ("/deleteroute")
public String deleteroute() {
	return "deleteroute";
	
}

	//-----------List----------------
@RequestMapping ("/listroutes")
public String listRoutes() {
	return "listroutes";
	
}	

}
