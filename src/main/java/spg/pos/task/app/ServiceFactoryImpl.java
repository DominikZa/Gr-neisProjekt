package spg.pos.task.app;

import java.util.HashMap;

import spg.pos.task.repositoryjpa.PersistenceFactory;
import spg.pos.task.servicejpa.*;

/**
 * A factory to create the services...
 */
public class ServiceFactoryImpl implements ServiceJpaFactory {

    private final HashMap<Class<?>, ServiceJpa> services = new HashMap<>();

    private PersistenceFactory persistenceFactory;

    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
        this.persistenceFactory = persistenceFactory;
    }

	@Override
	public MultiTimeTaskServiceJpa multiTimeTaskService() {
		MultiTimeTaskServiceJpa multiTimeTaskService = new MultiTimeTaskServiceJpa();
		multiTimeTaskService.setMultiTimeTaskJpaRepository(persistenceFactory.multiTimeTaskRepository());
		return multiTimeTaskService;
	}

	@Override
	public SingleTimeTaskServiceJpa singleTimeService() {
		SingleTimeTaskServiceJpa singleTimeTaskService = new SingleTimeTaskServiceJpa();
		singleTimeTaskService.setSingleTimeTaskJpaRepository(persistenceFactory.singleTimeTaskRepository());
		return singleTimeTaskService;
	}

	@Override
	public UserServiceJpa userService() {
		UserServiceJpa userService = new UserServiceJpa();
		userService.setUserJpaRepository(persistenceFactory.userRepository());
		return userService;
	}

    
}
