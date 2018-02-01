package com.infotech.people.management.app.PeopleManagementSpringBootDataApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.people.management.app.PeopleManagementSpringBootDataApp.dao.PeopleManagementDao;
import com.infotech.people.management.app.PeopleManagementSpringBootDataApp.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	PeopleManagementDao peopleManagementDao;

	public List<Person> getPersonInfoByLastName(String LastName) {
		 
		return peopleManagementDao.getPersonInfoByLastName(LastName);
	}

	public List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email) {
		 
		return peopleManagementDao.getPersonInfoByFirstNameAndEmail(firstName, email);
	}

	 
}
