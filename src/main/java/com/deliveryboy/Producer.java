package com.deliveryboy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Producer {
    @Autowired
    KafkaTemplate<String,String>kafkaTemplate;
    public void sendTopicName(String message){
        this.kafkaTemplate.send("code decode",message);
    }

}
