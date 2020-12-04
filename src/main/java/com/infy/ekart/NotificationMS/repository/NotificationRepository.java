package com.infy.ekart.NotificationMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.ekart.NotificationMS.entity.NotificationEntity;

@Repository
public interface NotificationRepository extends CrudRepository<NotificationEntity, String> {

}
