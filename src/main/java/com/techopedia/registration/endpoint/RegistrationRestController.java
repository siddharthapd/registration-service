package com.techopedia.registration.endpoint;

import com.techopedia.registration.domain.Token;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Api(position = 1, tags = "Registrtation", description = "Registration controller for registering a user")
@RestController
public class RegistrationRestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;

    @ApiOperation(position = 1, value = "Fetch Token", notes = "fetch token from static user id and password", response = Token.class)
    @GetMapping(value = "/get/token", produces = MediaType.APPLICATION_JSON_VALUE)
    public Token getTokenfromService() {
        logger.info("Fetching token now : {}", "Siddhartha Prasad");
        ResponseEntity<Token> response = restTemplate.exchange(
                "http://security-service/login/user?password=sas&user=sasas",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Token>(){});
        Token token = response.getBody();
        return token;
    }

}
