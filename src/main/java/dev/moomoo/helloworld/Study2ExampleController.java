package dev.moomoo.helloworld;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// @RestController
// @RequestMapping("/study2/example3")
// class PersonController {
//     @GetMapping("/{id}")
//     public Person getPerson(@PathVariable String b, String c) {
//         // ...
// 		return new Person("{id}", b, c);
//     }

//     @PostMapping
//     @ResponseStatus(HttpStatus.CREATED)
//     public void add(@RequestBody Person person) {
//         // ...
//     }
// }

@RestController
public class Study2ExampleController {   
	// public void func1() {
	// 	Person person1;
	// 	person1.getA();
	// }
	
	@GetMapping("/study2/example1")
	public String study2GetMapping(@RequestParam(value = "a", defaultValue = "World") String a,
								   @RequestParam(value = "b", defaultValue = "World") String b) {
		return String.format("a: %s, b: %s", a, b);
	}
		
	@PostMapping("/study2/example2")
	public String study2PostMapping(@RequestBody Map<String,String> map) {
		return String.format("a: %s, b: %s", map.get("a"), map.get("b"));
	}

	@PostMapping("/study2/example3/{a}")
	public String study3PostMapping(@PathVariable String a, @RequestParam Map<String,String> map) {
		// return String.format("a: %s, b: %s", map.get("a"), map.get("b"));
		return String.format("a: %s, b: %s, c: %s", a, map.get("b"), map.get("c"));
	}

	@PostMapping("/study2/example4")
	public String study4PostMapping(@RequestHeader Map<String,String> map) {
		return String.format("a: %s, b: %s", map.get("header-a"), map.get("header-b"));
		// return map.toString();
	}
	
	// @GetMapping("/study2/example4")
	// public String study2GetMapping(@RequestParam(value = "a", defaultValue = "World") String a,
	// 							   @RequestParam(value = "b", defaultValue = "World") String b) {
	// 	return String.format("a: %s, b: %s", a, b);
	// }
}
