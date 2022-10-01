package ru.yandex.practicum.catsgram.exception;

public class PostNotFoundException extends Throwable {
    public PostNotFoundException(final String message){
        super(message);
    }
}
