package com.example.SpringKafka.controller;

import com.example.SpringKafka.producer.KafkaMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class KafkaController {
    @Autowired
    KafkaMessageProducer kafkaMessageProducer;

    @PostMapping("/pushMessage")
    public String postMessage(@RequestBody String message) {
             kafkaMessageProducer.sendMessage(message);
             return "Message Published";
    }

}
