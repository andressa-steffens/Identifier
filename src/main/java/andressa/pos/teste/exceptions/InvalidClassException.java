package andressa.pos.teste.exceptions;

public class InvalidClassException extends Exception{

    public InvalidClassException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }

    public InvalidClassException(String errorMessage){
        super(errorMessage);
    }
}

