package spg.pos.task.rest;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import spg.pos.task.model.DomainConfiguration;
import spg.pos.task.repository.RepositoryConfiguration;
import spg.pos.task.repositoryjpa.RepositoryJpaConfiguration;
import spg.pos.task.service.ServiceConfiguration;
import spg.pos.task.servicejpa.ServiceJpaConfiguration;

/**
 * Application configuration for rest.
 * 
 * @author michi
 */
@Import(value = {DomainConfiguration.class, RepositoryJpaConfiguration.class, ServiceJpaConfiguration.class})
@Configuration
@ComponentScan(basePackageClasses = RestPackage.class)
public class RestApplicationConfig {
	@Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }
}
