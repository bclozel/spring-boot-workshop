package demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${conference.name:SpringOne2GX}")
	private String conference;

	@RequestMapping("/")
	public String home() {
		return "Hello " + this.conference;
	}
}
