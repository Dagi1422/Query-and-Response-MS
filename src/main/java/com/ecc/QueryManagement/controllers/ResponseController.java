package com.ecc.QueryManagement.controllers;


import java.time.LocalDateTime;
import java.util.List;

//import com.ecc.QueryManagement.models.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.ecc.QueryManagement.models.Response;
import com.ecc.QueryManagement.models.ResponseDto;
//import com.ecc.QueryManagement.services.QueriesRepository;
import com.ecc.QueryManagement.services.ResponsesRepository;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
public class ResponseController {


	@Autowired
	private ResponsesRepository repo;
//	@Autowired
//	private QueriesRepository Qrepo;
	
	@GetMapping("/showResponse")
	public String showResponseList (
			Model model
			
			) {
		
		List<Response> responses = repo.findAll();
		model.addAttribute("responses", responses);
		return "/ShowResponse";
	}
	
	
	@GetMapping("/createResponse")
	public String showCreateResponsePage(
			Model model
//			@RequestParam Long id
			) {
		
		ResponseDto responseDto = new ResponseDto();
		
		model.addAttribute("responseDto", responseDto);
		//model.addAttribute("queryId", id);
		return "/SendResponse";
	}
		
	
	@PostMapping("/createResponse")
	public String createResponse(
			@Valid @ModelAttribute ResponseDto responseDto,
//			 @ModelAttribute Long queryId,
//			@RequestParam Long id,
			BindingResult result
			) {
		
		
		LocalDateTime timestamp = LocalDateTime.now();
		
		Response response = new Response();
		
//		Query query = Qrepo.findById(id).get();
//		
//		response.setQuery(query);
		response.setAnsweringAuthority(responseDto.getAnsweringAuthority());
		response.setCertificateNum(responseDto.getCertificateNum());
		response.setAnsweringOffice(responseDto.getAnsweringOffice());
		response.setContent(responseDto.getContent());
		response.setTimestamp(timestamp);
		
		
		repo.save(response);
		
		
		if (result.hasErrors()) {
			return "/SendResponse";
		}
		return "redirect:/";
	}
}
