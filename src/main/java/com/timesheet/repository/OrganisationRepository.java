package com.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timesheet.model.Organisation;

@Repository
public interface OrganisationRepository extends  JpaRepository<Organisation,Integer>{

}
