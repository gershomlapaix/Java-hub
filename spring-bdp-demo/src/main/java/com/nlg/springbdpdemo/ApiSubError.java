package com.nlg.springbdpdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Gershom Nsengiyumva
 * */
abstract class ApiSubError {
}


/**
 * ApiValidationError class below extends ApiSubError and expresses validation problem encountered during REST call
 * */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
class ApiValidationError extends ApiSubError{
    private String object;
    private String field;
    private Object rejectedValue;
    private String message;

    ApiValidationError(String object, String message){
        this.object = object;
        this.message = message;
    }
}