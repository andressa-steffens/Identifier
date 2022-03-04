package andressa.pos.teste.exceptions;

public class InvalidIdentifierException extends InvalidClassException{
    public InvalidIdentifierException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }

    public InvalidIdentifierException(String errorMessage){
        super(errorMessage);
    }
}
