package com.Abhishek.cntr;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import com.Abhishek.model.UserDtls;
import com.Abhishek.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepo;

	
	@ModelAttribute
	private void userDetails(Model m, Principal p){
		
		try {
		String email = p.getName();
		UserDtls user = userRepo.findByEmail(email);

		m.addAttribute("user", user);
		}
		catch(Exception e) {
			System.out.println("Something Went Wrong");
		}
	}

	@GetMapping("/")
	public String home()  {
		return "user/home";
	}
	
	
	
	
	

}