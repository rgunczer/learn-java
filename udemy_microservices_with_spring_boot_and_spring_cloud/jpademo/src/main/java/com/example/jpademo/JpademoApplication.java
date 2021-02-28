package com.example.jpademo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		var applicationContext = SpringApplication.run(JpademoApplication.class, args);

		for (String name: applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}

		int[] xa = {0, 1, 2, 3, 4};
		int idx = 0;
		xa[++idx] = xa[idx] + 1000;
		for (int v: xa) {
			System.out.println(" > " + v);
		}

		short s = 10, t = 1;
		// s = s + t; // cannot convert from int to short

		++s;
		System.out.println(s);

	}

}
