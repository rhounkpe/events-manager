package be.digicom.eventsmanager.repository;

import be.digicom.eventsmanager.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<Person, Long> {
}
