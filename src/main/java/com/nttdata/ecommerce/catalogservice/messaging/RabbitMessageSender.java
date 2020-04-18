package com.nttdata.ecommerce.catalogservice.messaging;

import com.nttdata.ecommerce.catalogservice.model.ExampleMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.math.BigDecimal;
@Component
public class RabbitMessageSender {

    @Autowired
    RabbitTemplate rabbitTemplate;


    public void sendMessage(){
        ExampleMessage message=new ExampleMessage();

        message.setEvent("productIsAvailable");
        message.setProductID("TSH_001");
        message.setPrice(new BigDecimal(69.99).setScale(2, BigDecimal.ROUND_CEILING));
        message.setInStock(30);
        rabbitTemplate.convertAndSend("spring-boot-exchange","foo.bar.#",message);
    }
}
