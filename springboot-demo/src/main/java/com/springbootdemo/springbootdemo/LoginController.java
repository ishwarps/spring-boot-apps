package com.springbootdemo.springbootdemo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/messages")
	public @ResponseBody ResponseEntity<String> getMessage(Model model, HttpSession session) {
		String userId = (String) session.getAttribute("userId");

		System.out.println("user id is" + userId);
		return new ResponseEntity<String>(userId, HttpStatus.OK);
	}

	@RequestMapping(value = "/login/{userId}/{password}", method = RequestMethod.GET)
	public void login(@PathVariable("userId") String userId, @PathVariable("password") String password,
			HttpServletRequest request) {

		// validating user name and password from db.

		System.out.println("starting" + userId);

		if (userId != null) {
			request.getSession().setAttribute("userId", userId);
		} else {

			System.out.println("user is does not store");
		}

	}
}
