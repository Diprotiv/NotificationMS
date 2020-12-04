package com.infy.ekart.NotificationMS.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.ekart.NotificationMS.repository.NotificationRepository;
import com.infy.ekart.NotificationMS.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService{
	
	@Autowired
	NotificationRepository notificationRepository;

}
