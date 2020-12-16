package app.springboot.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:8018")
public class CorsInvokeController {
	
	@GetMapping("/access")
	public String greetings() {
		return "Welcome!";
	}

}
