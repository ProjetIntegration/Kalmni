package app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.project.entities.Notifications;



public interface NotificationsRepository extends JpaRepository<Notifications, Long> {

}
