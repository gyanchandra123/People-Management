package com.infotech.people.management.app.PeopleManagementSpringBootDataApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.infotech.people.management.app.PeopleManagementSpringBootDataApp.entities.Person;

public interface PeopleManagementDao extends Repository<Person, Integer> {

	/* @Query(value = "select p from Person p WHERE p.lastName = ?1") */
	@Query(value = "select * from person_table  WHERE last_Name = ?1", nativeQuery = true)
	List<Person> getPersonInfoByLastName(String LastName);

	/*
	 * @Query(value =
	 * "select p from Person p WHERE p.firstName = ?1 AND p.email =?2 ")
	 */

	@Query(value = "select * from person_table WHERE first_Name = ?1 AND email =?2 ", nativeQuery = true)
	List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email);
}
