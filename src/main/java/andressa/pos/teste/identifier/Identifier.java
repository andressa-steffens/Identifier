package andressa.pos.teste.identifier;

import andressa.pos.teste.exceptions.InvalidClassException;

public class Identifier {

    public static boolean check(String identifier) throws InvalidClassException {

        if (identifier == null){
            throw new InvalidClassException("Identifier cannot be null.");
        }
        if (Character.isAlphabetic(identifier.charAt(0))){
            if (identifier.length() >= 1 && identifier.length() <=6){
                for (int i = 0; i < identifier.length(); i++){
                    if (!Character.isLetterOrDigit(identifier.charAt(i))){
                        throw new InvalidClassException("Identifier has a non alphanumeric at position: " + i);
                    }
                }
            } else {
                throw new InvalidClassException("Identifier length must be between 1 and 6. The length is:" + identifier.length());
            }
          /*Validates if identifier starts with a number*/
        } else if (Character.isDigit(identifier.charAt(0))){
            throw new InvalidClassException("Identifier must start with a letter and not a number.");
        } else if (!Character.isLetterOrDigit(identifier.charAt(0))){
            throw new InvalidClassException("Identifier is not alphanumeric");
        }
        /*Check if the length is valid (a string between 1 and 6)*/
        return true;
    }
}
