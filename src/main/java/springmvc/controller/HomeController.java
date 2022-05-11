package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/about",method=RequestMethod.GET)
	public String about()
	{
		System.out.println("this is about url");
		return "about";
	}
	@RequestMapping("/home")
	public String home(Model model)
	{
		
		System.out.println("this is home url");
		model.addAttribute("name","Poornima");
		model.addAttribute("id", 1421);
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		//Creating moe
		System.out.println("This is help controller");
		ModelAndView mv=new ModelAndView();
		mv.addObject("Name","Name isn't given");
		
		//Tryting to print marks using expression language from jsp
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		mv.addObject("marks",list);
		
		
		
		mv.setViewName("help");
		return mv;
	}
	
	
	
}
