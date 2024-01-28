package com.fastcampus.sns.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    DUPLICATED_USER_NBAME(HttpStatus.CONFLICT, "User name is duplicated"),
    ;

    private HttpStatus status;
    private String message;
}
