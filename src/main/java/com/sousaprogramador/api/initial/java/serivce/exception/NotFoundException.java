package com.sousaprogramador.api.initial.java.serivce.exception;

public class NotFoundException extends  BusinessException{
    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        super("Resource not found.");
    }
}
