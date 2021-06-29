
	package controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;

	@Controller

	@RequestMapping("/usercontroller")

	public class UserController {
		@Autowired
		UserRepository userRepository;	
	
		
		
		//-----------------------add----------------------------------
		@RequestMapping("/newUser")
		public String newUser() {

			return "newUser.html";
		}

		@RequestMapping("/addUser")
		public String inserUser(User user) {

		//UserRepository.save(user);

			return "redirect:/employee/allEmployees";
		}
	}
