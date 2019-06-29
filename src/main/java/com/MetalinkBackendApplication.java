package com;

import com.backend.metalink.controller.MetaLinkAdminController;
import com.backend.metalink.dao.MetaLinkAdminDao;
import com.backend.metalink.model.MetaLinkAdmin;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetalinkBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MetalinkBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is inside the runner ......");

	}
}
