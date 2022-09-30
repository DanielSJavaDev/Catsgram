package ru.yandex.practicum.catsgram.exception;

public class InvalidEmailException extends Throwable {

    public InvalidEmailException(final String message){
        super(message);
    }

}
