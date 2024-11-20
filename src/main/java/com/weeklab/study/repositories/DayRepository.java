package com.weeklab.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weeklab.study.entities.Day;

public interface DayRepository extends JpaRepository<Day, Long>{
	
}
