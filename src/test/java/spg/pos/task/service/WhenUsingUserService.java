package spg.pos.task.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import spg.pos.task.service.UserService;

/**
 * A very useful test case for the service layer.
 * 
 * @author michi
 */
@ContextConfiguration(classes = ServiceTestConfiguration.class)
public class WhenUsingUserService extends AbstractJUnit4SpringContextTests {
	@Autowired
	private UserService userService;
	
	@Test
	public void ensureThatThereIsAtLeastOneTestAsOurTeacherDid() {
		Assert.assertNotNull(userService);
	}
}
