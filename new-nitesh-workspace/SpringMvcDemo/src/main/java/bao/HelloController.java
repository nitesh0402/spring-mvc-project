package bao;







@Controller
public class HelloController {
	@RequestMapping("xyz")
	public String add() {

		System.out.println("conroller called");
		
		//return is your jsp file name
		return "hello";

	}

	/*
	 * @RequestMapping("checkName") public String printHello(ModelMap model) {
	 * model.addAttribute("name", "yogesh");
	 * 
	 * return "hello"; }
	 */
	
	@RequestMapping("/add")
	public String add1() 
	{
		return "addition";
		
	}
	
	
	@RequestMapping("/addlogic")
	public ModelAndView addlogic(HttpServletRequest requetst,HtpServletResponse response) 
	{
		int a=Integer.parseInt(request.getParameter("textnum1"));
		int b=Integer.parseInt(request.getParameter("textnum2"));
		int c=a+b;
		return  new ModelAndView("addition","res"," result is"+c);
		
		
	}
	
	/*
	 * @RequestMapping("hello") public String hello() {
	 * 
	 * System.out.println("conroller called");
	 * 
	 * return "add";
	 * 
	 * }
	 */
}
