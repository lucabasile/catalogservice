package com.nttdata.ecommerce.catalogservice.controllers;

import com.nttdata.ecommerce.catalogservice.messaging.RabbitMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController("/quicktest")
public class TestController {

    @Autowired
    RabbitMessageSender sender;

    @GetMapping("/send")
    public String send(){
        sender.sendMessage();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return sdf.format(new Date());
    }
}
