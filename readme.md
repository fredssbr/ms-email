# E-mail sender

### Payload

* POST http://localhost:8080/sending-email

```json
{
  "ownerRef": "Someone",
  "emailFrom": "<<fromEmail>>>>",
  "emailTo": "<<toEmail>>",
  "subject": "First test - sending e-mail through Spring Boot",
  "text": "Topics for studying: Java, Spring Framework, Clean architecture, Databases"
}
```

### Steps
 - [x] Create microservice
 - [x] Assync with RabbitMQ
 - [x] Refactor architecture (Clean/Hexagonal)


### References
* [Creating a simple Gmail App password for sending e-mails](https://support.google.com/accounts/answer/185833)
* [RabbitMQ as a Service](https://www.cloudamqp.com/)
* Guide
  * [Microservices with Java Spring Boot](https://www.youtube.com/playlist?list=PL8iIphQOyG-Dp037UnFG0x8aduelvZZWE)