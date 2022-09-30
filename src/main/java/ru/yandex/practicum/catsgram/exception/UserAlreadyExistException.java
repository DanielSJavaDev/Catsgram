package ru.yandex.practicum.catsgram.exception;

public class UserAlreadyExistException extends Throwable {
    public UserAlreadyExistException(final String message) {
        super(message);
    }

}
