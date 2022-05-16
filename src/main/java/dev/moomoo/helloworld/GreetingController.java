package dev.moomoo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

	@GetMapping("/YS")
	public String YSFunc(String name) {
		return String.format("Hello YS!");
	}
	
	@PostMapping("/YSpost")
	public String Post(String name) {
		return String.format("Hello YSPost!");
	}
}