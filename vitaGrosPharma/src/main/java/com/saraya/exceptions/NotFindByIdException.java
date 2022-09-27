package com.saraya.exceptions;

import com.saraya.models.Owner;

import java.util.function.Supplier;

public class NotFindByIdException extends Exception  {
    public NotFindByIdException(String message) {
        super(message);
    }

}
