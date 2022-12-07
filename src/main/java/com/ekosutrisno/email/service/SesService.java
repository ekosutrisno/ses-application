package com.ekosutrisno.email.service;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Eko Sutrisno
 * Senin, 05/12/2022 13.00
 */
@Service
public class SesService {

    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    public AmazonSimpleEmailService amazonSimpleEmailService;

    public void sendStandardEmail(String sender, String receiver, String subject) {
        String emailContent = TemplateEmail.defaultEmail;
        try {
            SendEmailRequest sendEmailRequest =
                    new SendEmailRequest()
                            .withDestination(new Destination().withToAddresses(receiver))
                            .withMessage(
                                    new Message()
                                            .withBody(
                                                    new Body()
                                                            .withHtml(new Content().withCharset("UTF-8").withData(emailContent)))
                                            .withSubject(new Content().withCharset("UTF-8").withData(subject)))
                            .withSource(sender);

            amazonSimpleEmailService.sendEmail(sendEmailRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendTemplatedEmail(String senderEmail, String receiverEmail, String templateName, Map<String, Object> emailData) {
        String templateData = null;
        try {
            templateData = this.objectMapper.writeValueAsString(emailData);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        SendTemplatedEmailRequest sendTemplatedEmailRequest = new SendTemplatedEmailRequest();
        sendTemplatedEmailRequest.setTemplate(templateName);
        sendTemplatedEmailRequest.setSource(senderEmail);
        sendTemplatedEmailRequest.setDestination(new Destination(List.of(receiverEmail)));
        sendTemplatedEmailRequest.setTemplateData(templateData);
        amazonSimpleEmailService.sendTemplatedEmail(sendTemplatedEmailRequest);
    }
}