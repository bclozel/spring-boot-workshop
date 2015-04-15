package demo.web;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

import demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebIntegrationTest(randomPort = true)
public class HomeControllerIntegrationTests {

	@Value("${local.server.port}")
	private int port;

	@Test
	public void home() {
		String url = "http://localhost:" + port + "/";
		String body = new RestTemplate().getForObject(url, String.class);
		assertThat(body, is("Hello SpringOne2GX"));
	}

}
