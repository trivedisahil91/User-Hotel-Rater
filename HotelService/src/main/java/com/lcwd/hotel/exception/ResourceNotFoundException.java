package com.lcwd.hotel.exception;

public class ResourceNotFoundException extends RuntimeException{



    //extra properties that you want to manage
    public ResourceNotFoundException(){
        super("Resource not Found !");
    }

    public ResourceNotFoundException(String massage){
        super(massage);
    }
}
