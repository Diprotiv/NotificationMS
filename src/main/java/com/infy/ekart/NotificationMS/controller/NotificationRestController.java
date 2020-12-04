package com.infy.ekart.NotificationMS.controller;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.ekart.NotificationMS.dto.NotificationDTO;
import com.infy.ekart.NotificationMS.service.impl.NotificationServiceImpl;

@RestController
@Validated
public class NotificationRestController {
	
	@Autowired
	NotificationServiceImpl notificationService;
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/{userId}/notifications") 
	public ResponseEntity<String> getAddress(@PathVariable("userId") final String userId, final Errors errors) {
		return null;
	}
	
	@PostMapping("/notifications/add")
	public ResponseEntity<String> addAddress(@Valid final NotificationDTO notificationDto, final Errors errors) {
		return null;
	}
	

}
