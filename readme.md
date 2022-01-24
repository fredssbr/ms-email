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
 - [X] Create microservice
 - [ ] Refactor architecture (Clean/Hexagonal)


### References

* [CRIANDO UM MICROSERVICE DE ENVIO DE EMAIL](https://www.youtube.com/watch?v=ZBleZzJf6ro)
* [Creating a simple Gmail App password for sending e-mails](https://support.google.com/accounts/answer/185833)