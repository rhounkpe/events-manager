package be.digicom.eventsmanager.repository;

import be.digicom.eventsmanager.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrganizationRepository extends JpaRepository<Organization, Long> {
}
