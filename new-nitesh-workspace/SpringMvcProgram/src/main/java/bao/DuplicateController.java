package bao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DuplicateController {

	@RequestMapping("Duplicalenum")
	public ModelAndView GetDuplicate(HttpServletRequest request,HttpServletResponse response) 
	{
		ModelAndView mv=new ModelAndView("Duplicate");
		
		int arr[]= {1,5,4,4,5,7,3,9,9,7,1};
		int temp=0;
		 String duplicate ="";
		for (int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				
				if(arr[i]==arr[j]) 
				{
				duplicate=duplicate+" "+arr[i];
					mv.addObject("isDuplicate","duplicate number is"+duplicate);
					
					
				}
				
			}
			
			
			
		}
		
		return mv;
		
		
	}
	
	
	
}
