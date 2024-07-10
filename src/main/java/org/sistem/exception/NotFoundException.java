package org.sistem.exception;

public class NotFoundException extends Exception {

    private String message;

    NotFoundException(String message){
        this.message = message;
    }
}
