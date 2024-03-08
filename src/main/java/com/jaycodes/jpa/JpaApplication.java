package com.jaycodes.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jaycodes.jpa.repositories.AuthorRepository;
import com.jaycodes.jpa.repositories.VideoRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repo, VideoRepository vrepo) {
		return args -> {
//			var video = Video.builder().name("abc").length(3).build();
//			vrepo.save(video);
		};
	}

}
