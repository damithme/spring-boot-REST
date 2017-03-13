package com.mydevgeek.exception;

/**
 * Created by DAM on 3/9/17.
 */
public class ResourceNotFoundException extends RuntimeException {

    private Long resourceId;

    public ResourceNotFoundException(Long resourceId, String message) {
        super(message);
        this.resourceId = resourceId;
    }
}
