package springmvc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import springmvc.model.User;
import springmvc.service.UserService;
@Controller
//@RequestMapping
public class ContactController {


	@Autowired
	private UserService userService;


	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("Header","Learn Coding");
		m.addAttribute("Desc","Home for programmer");

	}


	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		/*
		 * m.addAttribute("Header","Learn Coding");
		 * m.addAttribute("Desc","Home for programmer");
		 */	return "Contact";
	}

	@RequestMapping(path="/contact",method=RequestMethod.POST)
	public String contact(@ModelAttribute("user") User user,Model model)
	{
		if(user.getUserName().isBlank())
		{
			return "redirect:/contact";
		}
		else
		{
			System.out.println("Controller User is "+user);
			int createdUser=this.userService.createUser(user);
			model.addAttribute("msg","User created with id"+createdUser);
			return "success";

		}


	}
}
/*
 * model.addAttribute("Header","Learn Coding");
 * model.addAttribute("Desc","Home for programmer");
 */
/*public String contact(@RequestParam(name="email",required = true) String email,
	@RequestParam(name="userName",required = true) String userName,
	@RequestParam(name="password",required = true) String password,Model model)
{
System.out.println(email+" "+userName+" "+password);

User user=new User();
user.setEmail(email);
user.setPassword(password);
user.setUserName(userName);



//Process

model.addAttribute("user",user);

 */		/*
 * model.addAttribute("name",userName); model.addAttribute("email",email);
 * model.addAttribute("password",password);
 */
