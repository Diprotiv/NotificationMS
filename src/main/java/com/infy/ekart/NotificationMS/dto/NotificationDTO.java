package com.infy.ekart.NotificationMS.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.infy.ekart.NotificationMS.entity.NotificationEntity;

public class NotificationDTO {
	
	private String notificationId;
	@NotNull
	private String userId;
	@NotNull
	private String notificationMessage;
	private LocalDate date; //needs to be auto generated idk how
	public String getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNotificationMessage() {
		return notificationMessage;
	}
	public void setNotificationMessage(String notificationMessage) {
		this.notificationMessage = notificationMessage;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public NotificationEntity createEntity() {
		NotificationEntity notificationEntity = new NotificationEntity();
		notificationEntity.setNotificationMessage(this.getNotificationMessage());
		notificationEntity.setUserId(this.getUserId());
		notificationEntity.setDate(this.getDate());
		return notificationEntity;
	}
	
	public static NotificationDTO valueOf(NotificationEntity notificationEntity) {
		NotificationDTO notificationDto = new NotificationDTO();
		notificationDto.setUserId(notificationEntity.getUserId());
		notificationDto.setNotificationMessage(notificationEntity.getNotificationMessage());
		notificationDto.setDate(notificationEntity.getDate());
		return notificationDto;
	}

}
