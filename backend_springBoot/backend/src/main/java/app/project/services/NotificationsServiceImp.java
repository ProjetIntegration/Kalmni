package app.project.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.project.entities.Notifications;
import app.project.repositorys.NotificationsRepository;

@Service
public class NotificationsServiceImp implements NotificationsService {
	 @Autowired
	    NotificationsRepository notificationsRepository;

	   @Override
	    public List<Notifications> findAllNotifications() {
	        return notificationsRepository.findAll();
	    }
	    
	   @Override
	    public Notifications findNotificationById(Long id) {
	        Notifications result = notificationsRepository.getById(id);
	        return result;
	    }

	   @Override
	    public Notifications saveNotification(Notifications notification) {
	        return notificationsRepository.save(notification);
	    }

	   @Override
	    public void deleteNotification(Long id) {
	        notificationsRepository.deleteById(id);
	    }


}
