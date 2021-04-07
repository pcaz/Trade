package com.presenceweb;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		if(args.length < 1) {
			System.out.println("Usage: PasswordGenerator password");
			return;
		}
		System.out.println(args[0]);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.toString());
		String rawPassword = args[0];
		String encodedPassword = encoder.encode(rawPassword);
		
		System.out.println(encodedPassword);

	}

}
