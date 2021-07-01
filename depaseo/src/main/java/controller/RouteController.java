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
public String addRoute(Route route) { //nos faltaba también, enviar el objeto route para poder hacer .save)
	
	routeRepository.save(route);
	
	return "addroute";	
}


	//-----------Update----------------Necesitamos hacer 2 pasos: find (si no lo encuentra, notfound) & replace
@RequestMapping ("/updateroute")
public String updateRoute() {
	return "updateroute";		
}


	//-----------Delete----------------Necesitamos hacer 2 pasos: find & delete
@RequestMapping ("/deleteroute")
public String deleteroute() {
	return "deleteroute";
	
}

	//-----------List----------------
@RequestMapping ("/listroutes")
public String listRoutes() {
	return "listroutes";
	


//--------------------------------------------------------------------------------
	//------------------------- service to controller --------------------------------
	//---------------------------Change to find route-----------------------------------------------------

		//public Optional<Expense> findOneExpenseById(int id) {

			// System.out.println("inside findEmployee" + id);
			//Optional<Expense> expenseFound = expenseRepository.findById(id);
			// System.out.println("finishing findEmployee" + id);
			// System.out.println("finishing findEmployee" + employeeFound.get());
			//return expenseFound;
		}
		




}
