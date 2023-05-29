package com.demo.starter.family;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FamilyController {
	
	@Autowired
	private FamilyService familyService;
	
	@RequestMapping("/family")
	public List<Family> getAllDetail()
	{
		return familyService.getAllDetail();
	}
	
	@PostMapping("/family")
	public void addFamily(Family f)
	{
		familyService.addFamily(f);
	}

}
