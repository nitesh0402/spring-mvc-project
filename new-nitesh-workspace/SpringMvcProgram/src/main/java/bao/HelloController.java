package bao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
	@RequestMapping("/check")
	public String check() {
		System.out.println("TestController called successfully");
		return "hello";
	}
}
