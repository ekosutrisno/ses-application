package com.ekosutrisno.email;

import com.ekosutrisno.email.service.SesService;
import com.ekosutrisno.email.service.TemplateEmail;
import com.ekosutrisno.email.service.TemplateService;
import com.ekosutrisno.email.service.TransactionalEmailData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Eko Sutrisno
 * Senin, 05/12/2022 13.15
 */
@RestController
@RequestMapping(path = "/api/v1/ses")
public class SesController {
    @Autowired
    SesService sesService;
    @Autowired
    TemplateService templateService;

    @GetMapping
    public ResponseEntity<String> sendSimpleEmail() {
        sesService.sendStandardEmail("sutrisnoeko801@gmail.com", "ekosutrisno801@gmail.com", "Hello, Welcome to Briix 😊");
        return ResponseEntity.ok("Send Email Successfully!");
    }

    @PostMapping(path = "/send-with-template")
    public ResponseEntity<String> sendWithTemplate() {
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.substring(uuid.length() - 6);
        var data = TransactionalEmailData.builder()
                .firstName("Eko Sutrisno")
                .pin(uuid)
                .build();
        sesService.sendTemplatedEmail("sutrisnoeko801@gmail.com", "ekosutrisno801@gmail.com", "OneTimePasswordTemplate", data);
        return ResponseEntity.ok("Templated Email Successfully Sent!");
    }

    @PostMapping(path = "/create-template")
    public ResponseEntity<String> createTemplate() {
        templateService.createTemplate("OneTimePasswordTemplate", "Verification Code", TemplateEmail.otpEmail);
        return ResponseEntity.ok("Template Email Successfully Created!");
    }

    @PostMapping(path = "/update-template")
    public ResponseEntity<String> updateTemplate() {
        templateService.updateTemplate("OneTimePasswordTemplate", " Briix Verification Code", TemplateEmail.otpEmail);
        return ResponseEntity.ok("Template Email Successfully Updated!");
    }

    @DeleteMapping(path = "/delete-template")
    public ResponseEntity<String> deleteTemplate() {
        templateService.deleteTemplate("OneTimePasswordTemplate");
        return ResponseEntity.ok("Templated Email Successfully Deleted!");
    }

}
