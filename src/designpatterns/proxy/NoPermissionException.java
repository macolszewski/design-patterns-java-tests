package designpatterns.proxy;

public class NoPermissionException extends Exception {
    public NoPermissionException(String message) {
        super(message);
    }
}
