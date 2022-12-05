package com.ekosutrisno.email.service;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.CreateTemplateRequest;
import com.amazonaws.services.simpleemail.model.DeleteTemplateRequest;
import com.amazonaws.services.simpleemail.model.Template;
import com.amazonaws.services.simpleemail.model.UpdateTemplateRequest;
import org.springframework.stereotype.Service;

/**
 * @author Eko Sutrisno
 * Senin, 05/12/2022 15.04
 */
@Service
public class TemplateService {
     private final AmazonSimpleEmailService amazonSimpleEmailService;

    public TemplateService(AmazonSimpleEmailService amazonSimpleEmailService) {
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }

    public void createTemplate(String templateName, String templateSubjectPart, String templateEmailContent) {
        Template template = new Template();
        template.setTemplateName(templateName);
        template.setSubjectPart(templateSubjectPart);
        template.setHtmlPart(templateEmailContent);

        CreateTemplateRequest request = new CreateTemplateRequest();
        request.setTemplate(template);

        amazonSimpleEmailService.createTemplate(request);
    }

    public void updateTemplate(String templateName, String templateSubjectPart, String templateEmailContent) {
        Template template = new Template();
        template.setTemplateName(templateName);
        template.setSubjectPart(templateSubjectPart);
        template.setHtmlPart(templateEmailContent);

        UpdateTemplateRequest request = new UpdateTemplateRequest();
        request.setTemplate(template);

        amazonSimpleEmailService.updateTemplate(request);
    }

    public void deleteTemplate(String templateName) {
        DeleteTemplateRequest request = new DeleteTemplateRequest();
        request.setTemplateName(templateName);
        amazonSimpleEmailService.deleteTemplate(request);
    }

}
