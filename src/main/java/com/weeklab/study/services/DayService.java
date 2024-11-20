package com.weeklab.study.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weeklab.study.entities.Day;
import com.weeklab.study.repositories.DayRepository;
import com.weeklab.study.services.exceptions.ContentNotFoundException;

@Service
public class DayService {
	@Autowired
	private DayRepository repository;
	
	public List<Day> findAll(){
		return repository.findAll();
	}
	
	public Day findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ContentNotFoundException(id));
	}
	public Day insert(Day day) {
		return repository.save(day);
	}
	public void delete(Long id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public Day update(Long id, Day obj) {
		Day oldObj = findById(id);
		updateData(oldObj, obj);
		return repository.save(oldObj);
	}
	
	private void updateData(Day oldObj, Day obj) {
		oldObj.setAmount(obj.getAmount());
		oldObj.setNote(obj.getNote());
		oldObj.setWorked(obj.isWorked());
	}
}
