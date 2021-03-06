package spg.pos.task.servicejpa;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spg.pos.task.model.*;
import spg.pos.task.repositoryjpa.MultiTimeTaskJpaRepository;

@Service
public class MultiTimeTaskServiceJpa
{
  @Autowired
  private MultiTimeTaskJpaRepository multiTimeTaskJpaRepository;
  
  public void createNewUser(User creator, String title, MultiTimeTask.RepeatType repeat)
  {
    MultiTimeTask task = new MultiTimeTask(null, creator, null, title, Task.TaskStatus.Open, repeat, new Date());
    multiTimeTaskJpaRepository.persist(task);
  }
  
  public void setMultiTimeTaskJpaRepository(MultiTimeTaskJpaRepository multiTimeTaskJpaRepository) {
	  this.multiTimeTaskJpaRepository = multiTimeTaskJpaRepository;
  }
}
