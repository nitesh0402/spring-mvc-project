package bao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TwoNumAdd {

	@RequestMapping("Add")
	public ModelAndView Welcome(HttpServletRequest request,HttpServletResponse response) 
	{
		ModelAndView mv=new ModelAndView("TwoNumAdd");
				int a=10;
		int b=4;
		int c=a+b;
		mv.addObject("isadd"," Two Number Addiction is "+c);
		
		return mv;
	}
	
	
}
