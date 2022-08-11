package bao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("wlcHello")
	public ModelAndView Welcome(HttpServletRequest request,HttpServletResponse response) 
	{
		ModelAndView mv=new ModelAndView("welcome");
				int a=10;
		int b=4;
		int c=a+b;
		mv.addObject("isadd","addiction is"+c);
		
		return mv;
	}
	
	
}
