package spg.pos.todo.repository;

import java.util.List;

import spg.pos.task.model.MultiTimeTask;
import spg.pos.task.model.SingleTimeTask;

/**
 * Erweiterungsinterface für TaskRepo.
 * 
 * @author Michael
 */
public interface TaskRepositoryCustom
{
  List<SingleTimeTask> findAllSingleTimeTasks();
  SingleTimeTask findSingleTaskByName(String name);
  
  List<MultiTimeTask> findAllMultiTimeTasks();
  MultiTimeTask findMultiTaskByName(String name);
}
