package controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller

@RequestMapping("/routecontroller")
public class RouteController {

	@Autowired
	RouteRepository routeRepository;


	//-----------CRUD----------------

//List or Get all:

	@RequestMapping("/getallroutes")
	public String getAllRoutes(Model boxToView) {

		boxToView.addAttribute("routesfromController", routeRepository.findAll());
		return "getallroutes";

	}

//Create:
	@RequestMapping("/newroute")
	public String newRoute() {
		
		return "newroute";

	}

	@RequestMapping("/addroute")
	public String addRoute(Route route) { 

		routeRepository.save(route);

		return "addroute";
	}

//Update:
	//2 steps: find and replace information
	@RequestMapping("/updateroute")
	public String updateRoute(int id, Model model) {
		
		Optional<Route> routeFound = findOneRouteById(id);
		
		if (routeFound.isPresent()) {
			
			model.addAttribute("routefromController", routeFound.get());
			return "updateroute";
		
		}
		
		return "notfound";
	}
	
	@RequestMapping("/modifyroute") 
	public String modifyRoute(int id, Route route){
		return null;}
	
	/*@PostMapping("/replaceExpense/{idFromView}")
	public String replaceEmployee(@PathVariable("idFromView") int id, Expense expense, Model model) {

		Optional<Expense> expenseFound = findOneExpenseById(id);

		if (expenseFound.isPresent()) {

			if (expense.getName() != null)
				expenseFound.get().setName(expense.getName());
			
			
			if (expense.getValue() != 0.0)
				expenseFound.get().setValue(expense.getValue());

			expenseRepository.save(expenseFound.get());
			model.addAttribute("expensesfromController", expenseRepository.findAll());
			model.addAttribute("expenseUpdated", expenseFound.get());
			
			return "expenses.html";

		} else
			return "notfound.html";
	}*/
	

// Delete
	//2 steps: find & delete
	@RequestMapping("/deleteroute")
	public String deleteroute(int id, Model model) {
		Optional<Route> routeFound = routeRepository.findById(id);
		
		if (routeFound.isPresent()) {
			routeRepository.deleteById(id);
			//model.addAttribute() mirar proyecto employee
			
			return "deletedroute";
		}
		
		return "notfound";

	}

// Service to controller:

	public Optional<Route> findOneRouteById(int id) {

		Optional<Route> routeFound = routeRepository.findById(id);
		return routeFound;
	}
	
	public String notFound (Model model) {
		return "notfound";
		
	}

}
