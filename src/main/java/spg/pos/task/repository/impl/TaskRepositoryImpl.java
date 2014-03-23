package spg.pos.task.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mysema.query.jpa.impl.JPAQuery;

import spg.pos.task.model.MultiTimeTask;
import spg.pos.task.model.SingleTimeTask;
import spg.pos.task.repository.TaskRepositoryCustom;
import spg.pos.todo.model.QMultiTimeTask;
import spg.pos.todo.model.QSingleTimeTask;

public class TaskRepositoryImpl implements TaskRepositoryCustom
{
  @PersistenceContext
  EntityManager entityManager;

  public List<SingleTimeTask> findAllSingleTimeTasks()
  {
    JPAQuery query = new JPAQuery(entityManager);

    QSingleTimeTask task = QSingleTimeTask.singleTimeTask;

    query.from(task).orderBy(task.title.asc());
    return query.list(task);
  }

  public SingleTimeTask findSingleTaskByName(String name)
  {
    JPAQuery query = new JPAQuery(entityManager);

    QSingleTimeTask task = QSingleTimeTask.singleTimeTask;

    query.from(task).where(task.title.eq(name));
    return query.list(task).get(0);
  }

  public List<MultiTimeTask> findAllMultiTimeTasks()
  {
    JPAQuery query = new JPAQuery(entityManager);

    QMultiTimeTask task = QMultiTimeTask.multiTimeTask;

    query.from(task).orderBy(task.title.asc());
    return query.list(task);
  }

  public MultiTimeTask findMultiTaskByName(String name)
  {
    JPAQuery query = new JPAQuery(entityManager);

    QMultiTimeTask task = QMultiTimeTask.multiTimeTask;

    query.from(task).where(task.title.eq(name));
    return query.list(task).get(0);
  }
}
