package com.deliveryboy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rest/")
public class KafkaController {
    @GetMapping("/api")
public void getMessage(@RequestParam("message") String message){

    }

}
