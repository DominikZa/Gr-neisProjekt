package spg.pos.todo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spg.pos.task.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{
	
}
