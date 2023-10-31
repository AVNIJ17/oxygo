package com.Abhishek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Abhishek.model.Details;
@Repository
public interface DetailsDao extends JpaRepository<Details, Integer> {

}
