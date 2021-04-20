package com.lrm;

import com.lrm.dao.TypeRepository;
import com.lrm.dao.UserRepository;
import com.lrm.po.Type;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

	@Autowired
	private TypeRepository typeRepository;

	@Test
	public void contextLoads() {
		Type t = new Type();
		t.setName("中文测试1");
		typeRepository.save(t);

	}

}
