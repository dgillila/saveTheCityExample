/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.savethecity.exception;

/**
 *
 * @author Daniel
 */
public class LoseGameException extends RuntimeException {
    
    public LoseGameException() {
    }

    public LoseGameException(String message) {
        super(message);
    }

    public LoseGameException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoseGameException(Throwable cause) {
        super(cause);
    }

    public LoseGameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
