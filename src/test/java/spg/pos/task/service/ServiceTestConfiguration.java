package spg.pos.task.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spg.pos.task.model.DomainConfiguration;
import spg.pos.task.repositoryjpa.RepositoryJpaConfiguration;
import spg.pos.task.service.ServiceConfiguration;

/**
 * Configuration for testing.
 * 
 * @author michi
 */
@Configuration
@Import({DomainConfiguration.class, RepositoryJpaConfiguration.class, ServiceConfiguration.class})
public class ServiceTestConfiguration {

}
