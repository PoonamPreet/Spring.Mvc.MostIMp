package springmvc.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller 
public class ReController {

	
	@RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("Handler one");
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
		//return "redirect:/two";//This way spting redirects to the new page(redirect prefix)
	}
	@RequestMapping("/two")
	public String two()
	{
		System.out.println("Handler two");
		return "Contact";
	}
}
