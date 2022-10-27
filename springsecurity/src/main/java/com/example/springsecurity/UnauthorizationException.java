package com.example.springsecurity;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class UnauthorizationException extends RuntimeException {

    protected static MessageSourceAccessor message = SpringSecurityMessageSource.getAccessor();

    public UnauthorizationException(){
        super(message.getMessage("AbstractAcessDecisionManager.accessDenied", "Access is denied"));
    }

    public UnauthorizationException(String message){
        super(message);
    }
}
