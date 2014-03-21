package spg.pos.todo.repositoryjpa;

public interface PersistenceFactory
{
  SingleTimeTaskJpaRepository singleTimeTaskRepository();

  MultiTimeTaskJpaRepository multiTimeTaskRepository();

  UserJpaRepository userRepository();
}
