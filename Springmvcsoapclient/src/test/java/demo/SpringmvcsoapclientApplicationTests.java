package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import eightball.mvc.web.SpringmvcsoapclientApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringmvcsoapclientApplication.class)
@WebAppConfiguration
public class SpringmvcsoapclientApplicationTests {

	@Test
	public void contextLoads() {
	}

}
