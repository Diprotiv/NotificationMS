package com.infy.ekart.NotificationMS.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class NotificationEntity {
	
	@Id
	@GeneratedValue(generator = "NotificationIdGenerator")
    @GenericGenerator(name = "NotificationIdGenerator", strategy = "com.infy.ekart.NotificationMS.generator.NotificationIdGenerator")
	private String notificationId;
	private String userId;
	private String notificationMessage;
	private LocalDate date; //needs to be auto generated idk how
	
	
	@Override
	public String toString() {
		return "NotificationEntity [notificationId=" + notificationId + ", userId=" + userId + ", notificationMessage="
				+ notificationMessage + ", date=" + date + "]";
	}
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
	
	
	
	

}
