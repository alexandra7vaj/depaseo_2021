package controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/usercontroller")

public class UserController {

	@Autowired
	UserRepository userRepository;

//-----------CRUD----------------

// Create:
	@RequestMapping("/newuser")
	public String newuser() {

		return "newuser";
	}

	@RequestMapping("/adduser")
	public String insertUser(User user, Model boxToView) {

		userRepository.save(user);
		
		boxToView.addAttribute("userfromController", userRepository.findAll());
		boxToView.addAttribute("userAdded", user);

		return "home.html"; // importante decidir a donde queremos que nos redirija.
	}

//Update:
	@RequestMapping("/updateuser")
	public String updateUser(Model model, int id) {

		Optional<User> userFound = userRepository.findById(id);

		if (userFound.isPresent()) {
			model.addAttribute("userfromController", userFound.get());
			return "updateuser";
		}

		return "notfound";
	}

	@PostMapping("/modifyuser/{idFromView}")
	public String modifyUser(@PathVariable("idFromView") int id, User user) {

		Optional<User> userFound = userRepository.findById(id);

		if (userFound.isPresent()) {
// to change userName:
			if (user.getName() != null)
				userFound.get().setName(user.getName());

// to change password:
			if (user.getPassword() != null)
				userFound.get().setPassword(user.getPassword());

			userRepository.save(userFound.get());
			return "?"; // decidir a donde nos redirige

		} else
			return "notfound";

	}

//Delete:
	@RequestMapping("/deleteaccount")
	public String deleteAccount() {
		return "deleteaccount";
	}

}
