package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class AppController {

	@RequestMapping(value="/check")
	public String test(){
		return "test";
	}
}
