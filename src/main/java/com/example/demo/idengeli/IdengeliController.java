package com.example.demo.idengeli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//annotation to let us know it is the API layer State-
@RestController
@RequestMapping(path = "api/v1/Idengeli")
public class IdengeliController {
	private final IdengeliService idengeliService;

	@Autowired
	public IdengeliController(IdengeliService idengeliService) {
		this.idengeliService = idengeliService;
	}

	@GetMapping
	public List<Idengeli> getIdengeli(){
		return idengeliService.getIdengeli();
	}
}
