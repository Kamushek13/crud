package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.Notification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends CrudRepository <Notification, Long> {
}
