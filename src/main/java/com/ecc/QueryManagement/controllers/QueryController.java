package com.ecc.QueryManagement.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecc.QueryManagement.models.Query;
import com.ecc.QueryManagement.models.QueryDto;
import com.ecc.QueryManagement.services.QueriesRepository;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
public class QueryController {
	
	@Autowired
	private QueriesRepository repo;
	
	@GetMapping("/showQuery")
	public String showQueryList (Model model) {
		List<Query> queries = repo.findAll();
		model.addAttribute("queries", queries);
		return "/ShowQuery";
	}
	
	@GetMapping("/createQuery")
	public String showCreateQueryPage(Model model) {
		QueryDto queryDto = new QueryDto();
		model.addAttribute("queryDto", queryDto);
		return "/SendQuery";
	}
	
	@PostMapping("/createQuery")
	public String createQuery(
			@Valid @ModelAttribute QueryDto queryDto,
			BindingResult result
			) {
		
		LocalDateTime timestamp = LocalDateTime.now();
		
		Query query = new Query();
		
		query.setQueryingAuthority(queryDto.getQueryingAuthority());
		query.setCertificateNum(queryDto.getCertificateNum());
		query.setQueryingOffice(queryDto.getQueryingOffice());
		query.setContent(queryDto.getContent());
		query.setTimestamp(timestamp);
		
		
		repo.save(query);
		
		
		if (result.hasErrors()) {
			return "/SendQuery";
		}
		return "redirect:/";
	}
	
}
