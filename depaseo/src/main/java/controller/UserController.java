	package controller;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/usercontroller")

public class UserController {
		@Autowired
		UserRepository userRepository;	
	
//-----------CRUD----------------
//-------------------------------
//-------------------------------			
		
		
//-----------Create----------------
@RequestMapping("/newuser")
public String newUser() {

			return "newUser.html";
		}

@RequestMapping("/addUser")
public String inserUser(User user) {

		//UserRepository.save(user);

			return "redirect:/employee/allEmployees";
		}
		
		
//-----------Update----------------	
@RequestMapping("/updateuser")
public String updateUser() {
	return "updateuser";}

	//to change userName
	@RequestMapping ("/changeusername")
	public String changeUserName (){
		return "changeusername";} 
	
	//to change password
	@RequestMapping ("/changepassword")		
	public String changePassword (){
		return "changepassword";} 
		
		
//-----------Delete----------------
@RequestMapping ("/deleteaccount")
public String deleteAccount (){
	return "deleteaccount";}

		
//-----------List (not necessary)--
		
			

		}

