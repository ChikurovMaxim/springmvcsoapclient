
package eightball.mvc.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class EightballConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("eightball.mvc.model");
		return marshaller;
	}

	@Bean
	public EightballClient eightballClient(Jaxb2Marshaller marshaller) {
		EightballClient client = new EightballClient();
		client.setDefaultUri("http://192.168.1.11:9090/v1/eightball");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
