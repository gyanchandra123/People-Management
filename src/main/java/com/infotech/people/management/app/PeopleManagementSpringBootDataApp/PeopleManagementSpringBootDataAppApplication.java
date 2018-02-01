package com.infotech.people.management.app.PeopleManagementSpringBootDataApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.people.management.app.PeopleManagementSpringBootDataApp.entities.Person;
import com.infotech.people.management.app.PeopleManagementSpringBootDataApp.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner {

	@Autowired
	PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 getPersonInfoByLastName();
		
		getPersonInfoByFirstNameAndEmail();
		
		

	}
 

	private void getPersonInfoByFirstNameAndEmail() {
		List<Person>  personList = peopleManagementService.getPersonInfoByFirstNameAndEmail("AAA", "A@gmail.com");
		 personList.forEach(System.out::println); 
		
	}

	private void getPersonInfoByLastName() {
		 List<Person>  personList = peopleManagementService.getPersonInfoByLastName("Smith");
		 personList.forEach(System.out::println);
	}

	 

 

}
