package com.ms.email.adapters.inbound.consumers;

import com.ms.email.application.ports.EmailServicePort;
import com.ms.email.adapters.dtos.EmailDto;
import com.ms.email.application.domain.Email;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @Autowired
    EmailServicePort emailServicePort;

    @RabbitListener(queues = "${mq-queue}")
    public void listen(@Payload EmailDto emailDto) {
        Email emailModel = new Email();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailServicePort.sendEmail(emailModel);
        System.out.println("Email status: " + emailModel.getStatusEmail().toString());
    }

}
