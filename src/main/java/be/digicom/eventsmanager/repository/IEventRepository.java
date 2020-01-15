package be.digicom.eventsmanager.repository;

import be.digicom.eventsmanager.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEventRepository extends JpaRepository<Event, Long> {
}
