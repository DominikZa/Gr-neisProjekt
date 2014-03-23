package spg.pos.task.repositoryjpa;

public interface PersistenceFactory
{
  SingleTimeTaskJpaRepository singleTimeTaskRepository();

  MultiTimeTaskJpaRepository multiTimeTaskRepository();

  UserJpaRepository userRepository();
}
