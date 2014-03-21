package spg.pos.todo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spg.pos.task.model.*;
import spg.pos.todo.repository.TaskRepository;

@Service
public class SingleTimeTaskService
{
  @Autowired
  private TaskRepository taskRepository;

  public void createNewUser(User creator, String title)
  {
    SingleTimeTask task = new SingleTimeTask(null, creator, null, title,
        Task.TaskStatus.Open, new Date());
    taskRepository.save(task);
  }
}
