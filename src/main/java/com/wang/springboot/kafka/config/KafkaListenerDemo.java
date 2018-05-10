package com.wang.springboot.kafka.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CountDownLatch;

@Configuration
@Slf4j
public class KafkaListenerDemo {
    private final CountDownLatch latch = new CountDownLatch(3);

    @KafkaListener(topics = {"myTopic", "foo", "bar"})
    public void listen(ConsumerRecord<?, ?> cr) throws Exception {
        log.info("消息:{}", cr);
        latch.countDown();
    }
}
