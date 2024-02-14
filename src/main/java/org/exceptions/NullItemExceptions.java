package org.exceptions;

public class NullItemExceptions extends RuntimeException {
    public NullItemExceptions() {
    }

    public NullItemExceptions(String message) {
        super(message);
    }

    public NullItemExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public NullItemExceptions(Throwable cause) {
        super(cause);
    }

    public NullItemExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
