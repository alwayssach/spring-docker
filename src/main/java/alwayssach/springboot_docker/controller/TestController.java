package alwayssach.springboot_docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springdockr")
public class TestController {

	@RequestMapping("/service")
	public String service() {
		
		
		return "Spring Docker Test.";
	}
}
