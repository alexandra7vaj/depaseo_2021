package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	UserRepository userRepository;	
	@Autowired
	RouteRepository routeRepository;	

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}	


}
