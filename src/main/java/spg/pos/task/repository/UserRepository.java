package spg.pos.task.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spg.pos.task.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{
	
}
