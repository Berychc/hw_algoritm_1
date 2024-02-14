package org.exceptions;

public class ElementsIsFullException extends  RuntimeException {
    public ElementsIsFullException() {
    }

    public ElementsIsFullException(String message) {
        super(message);
    }

    public ElementsIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementsIsFullException(Throwable cause) {
        super(cause);
    }

    public ElementsIsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
