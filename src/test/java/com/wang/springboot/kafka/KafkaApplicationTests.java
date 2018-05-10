package com.wang.springboot.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaApplicationTests {

	@Autowired
	private KafkaTemplate template;
	@Resource
	private NewTopic topic1;

	@Test
	public void contextLoads() {
		template.send("foo","xx");
	}

}
