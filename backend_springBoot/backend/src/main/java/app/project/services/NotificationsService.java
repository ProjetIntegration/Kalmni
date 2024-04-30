package app.project.services;

import java.util.List;

import app.project.entities.Notifications;

public interface NotificationsService {
	List<Notifications> findAllNotifications();
	Notifications findNotificationById(Long id);
	Notifications saveNotification(Notifications notification);
	 void deleteNotification(Long id);

}
