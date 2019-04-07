package org.moser.scratch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ScratchApplication.class)
public class ScratchApplicationTests {

	@Test
	public void contextLoads() {
		ScratchApplication.main(new String[]{
				"--spring.main.web-environment=false"
		});
	}
}
