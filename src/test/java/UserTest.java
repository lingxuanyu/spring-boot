

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

	@Test
	public void testData() {
		ClassPathXmlApplicationContext apx = new ClassPathXmlApplicationContext("spring.xml");
		Object bean = apx.getBean("dataSource");
		System.out.println(bean);
	}
}
