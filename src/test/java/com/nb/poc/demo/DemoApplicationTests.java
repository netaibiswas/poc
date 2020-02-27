package com.nb.poc.demo;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @author netaipada.biswas
 *
 */
@SpringBootTest
class DemoApplicationTests {

	/**
	 *
	 * @throws URISyntaxException
	 */
	@Test
	// Dummy Test
	public void contextLoads() throws URISyntaxException {
		final RestTemplate restTemplate = new RestTemplate();

		final String baseUrl = "http://localhost:8080";
		final URI uri = new URI(baseUrl);

		final ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);

		// Verify request succeed
		Assert.assertEquals("Checking HTTP Status", 200, result.getStatusCodeValue());
	}

}
