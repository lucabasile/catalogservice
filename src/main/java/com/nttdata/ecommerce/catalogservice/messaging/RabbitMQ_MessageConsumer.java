package com.nttdata.ecommerce.catalogservice.messaging;


import com.nttdata.ecommerce.catalogservice.RabbitMQConfiguration;
import com.nttdata.ecommerce.catalogservice.model.ExampleMessage;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class RabbitMQ_MessageConsumer {

    @RabbitListener(queues = RabbitMQConfiguration.QUEUE_NAME)
    public void consume(final ExampleMessage message) {
        log.info("Received message on event : ["+message.getEvent()+"]");
    }
}
