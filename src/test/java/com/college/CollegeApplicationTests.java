package com.college;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.college.dao.UserMapper;
import com.college.entity.User;

@SpringBootTest
class CollegeApplicationTests {
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	void contextLoads() {
		System.out.println(userMapper.selectCount(null));
	}

}
