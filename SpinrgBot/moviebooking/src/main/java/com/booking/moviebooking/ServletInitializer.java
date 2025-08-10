package com.booking.moviebooking;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MoviebookingApplication.class);
	}
/* in postman
 * http://localhost:4448/api/movies 
 * {
  "title": "Inception",
  "genre": "Sci-Fi"
} 
 * 
 */
}
