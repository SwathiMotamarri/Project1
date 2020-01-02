package exceptions;

public class MobileNotFoundException extends RuntimeException {

    public MobileNotFoundException(String msg){
        super(msg);
    }
} 