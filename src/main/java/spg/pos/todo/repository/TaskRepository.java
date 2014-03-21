package spg.pos.todo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spg.pos.task.model.Task;

@Repository
public interface TaskRepository extends TaskRepositoryCustom, CrudRepository<Task, Long>
{
  
}
