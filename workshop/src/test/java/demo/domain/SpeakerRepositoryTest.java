package demo.domain;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

import demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class SpeakerRepositoryTest {

	@Autowired
	private SpeakerRepository repository;

	@Test
	public void testFindByTwitter() throws Exception {
		Speaker stephane = repository.save(new Speaker("Stephane", "Nicoll", "snicoll"));
		assertThat(repository.findByTwitter("snicoll").getId(), is(stephane.getId()));
	}
}