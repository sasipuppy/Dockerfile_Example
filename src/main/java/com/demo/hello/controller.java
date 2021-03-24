/**
 * 
 */
package com.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sasikala
 *
 */
@RestController
public class controller {
	
	@RequestMapping("/hi")
	public String sayHello() {
		return "Welcome";
	}

}
