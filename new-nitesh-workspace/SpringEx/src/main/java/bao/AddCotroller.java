package bao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddCotroller {

	@RequestMapping("add")
	public String add() {

		return "addition";

	}
	/*
	 * @RequestMapping("addlogic")
	 * 
	 * public ModelAndView addlogic(HttpServletRequest request,HttpServletResponse
	 * response) {
	 * 
	 * int a=Integer.parseInt(request.getParameter("textnum1")); int
	 * b=Integer.parseInt(request.getParameter("textnum2")); int c=a+b; return new
	 * ModelAndView("addition","res"," result is " + c);
	 */

}

/* } */
