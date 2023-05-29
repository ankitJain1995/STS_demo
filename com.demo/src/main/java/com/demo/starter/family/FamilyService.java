package com.demo.starter.family;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyService {

	@Autowired
	private FamilyRepository familyRepository;
	
	public List<Family> getAllDetail()
	{
		List<Family>families  = new ArrayList<>();
		familyRepository.findAll().forEach(f->families.add(f));
		return families;
	}
	
	public void addFamily(Family f) {
		familyRepository.save(f);
	}
}
