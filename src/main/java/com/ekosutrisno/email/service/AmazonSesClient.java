package com.ekosutrisno.email.service;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author Eko Sutrisno
 * Senin, 05/12/2022 12.58
 */
@Service
public class AmazonSesClient {

    @Bean
    public AmazonSimpleEmailService getAmazonSimpleEmailService() {
        return AmazonSimpleEmailServiceClientBuilder.standard()
                .withCredentials(getAwsCredentialProvider())
                .withRegion("ap-southeast-1")
                .build();
    }

    private AWSCredentialsProvider getAwsCredentialProvider() {
        String ACCESS_KEY = "{YOUR_AWS_ACCESS_KEY}";
        String SECRET_KEY = "{YOUR_AWS_SECRET_KEY}";
        AWSCredentials awsCredentials =
                new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY);
        return new AWSStaticCredentialsProvider(awsCredentials);
    }
}