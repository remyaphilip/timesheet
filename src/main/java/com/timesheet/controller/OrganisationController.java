package com.timesheet.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.model.Organisation;
import com.timesheet.repository.OrganisationRepository;

@RestController
@RequestMapping(path = "/signin")
public class OrganisationController{

	@Autowired
	public OrganisationRepository organisationRepository;

	@RequestMapping(method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public void addOrganisation(@RequestBody Organisation organisation) {
		organisationRepository.save(organisation);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Organisation> getOrganisation() {
		return organisationRepository.findAll();
	}

//	@ExceptionHandler(value = SQLException.class)
//	public String exeHandler(SQLException e){
//		return e.getSQLState();
//		
//	}
	
}
