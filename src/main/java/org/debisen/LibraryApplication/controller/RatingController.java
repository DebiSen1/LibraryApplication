package org.debisen.LibraryApplication.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ratings")
public class RatingController {

	@PostMapping(value = "/rate")
	public void addrating() {
		
	}
}
