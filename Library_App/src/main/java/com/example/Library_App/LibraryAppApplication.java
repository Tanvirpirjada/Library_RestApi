package com.example.Library_App;

import com.example.Library_App.LibraryService.Libraryservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(LibraryAppApplication.class, args);
		//System.out.println(Libraryservice.FindByName("Mahan-Library"));
	}

}
