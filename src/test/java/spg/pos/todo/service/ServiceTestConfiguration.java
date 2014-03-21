package spg.pos.todo.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spg.pos.task.model.DomainConfiguration;
import spg.pos.todo.repositoryjpa.RepositoryJpaConfiguration;

/**
 * Configuration for testing.
 * 
 * @author michi
 */
@Configuration
@Import({DomainConfiguration.class, RepositoryJpaConfiguration.class, ServiceConfiguration.class})
public class ServiceTestConfiguration {

}
