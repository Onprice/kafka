package com.deliveryboy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @Autowired
    private Producer producer;
    @KafkaListener(topics ="code decode", groupId="codedecode_group")
        public void listenTopic(String message){
      producer.sendTopicName(message);
        }
}
