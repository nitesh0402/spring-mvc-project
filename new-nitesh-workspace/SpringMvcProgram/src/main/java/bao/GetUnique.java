package bao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class GetUnique {

	@RequestMapping("uniquenum")
	public ModelAndView GetUnique(HttpServletRequest request, HttpServletResponse response) 
	{
		
		 int arr[]= {2,5,5,7,2};
		 String Uniquenmbr ="";
	//int temp=1;
	
		ModelAndView mv =new ModelAndView("unique");
		int num=Integer.parseInt(request.getParameter("arr"));
		
		
					
		for(int i=1;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]!=arr[j]) 
				{
					
					
					Uniquenmbr=Uniquenmbr+" "+arr[i];
					
				}
				
			}
		//	temp=temp*i;
			
			
				
				}
		mv.addObject("isUnique","duplicate number are "+Uniquenmbr);
		return mv;
				
}
			
			
		
		
		
		
		
	}
	

