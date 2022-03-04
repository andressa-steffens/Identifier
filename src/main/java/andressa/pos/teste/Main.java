package andressa.pos.teste;

import andressa.pos.teste.exceptions.InvalidClassException;
import andressa.pos.teste.exceptions.InvalidIdentifierException;
import andressa.pos.teste.identifier.Identifier;

public class Main {

    public static boolean main(String[] args) throws InvalidClassException, InvalidIdentifierException {
        String identifier = "";
        try {
            if (Identifier.check(identifier)){
                return true;
            }
            else {
                throw new InvalidIdentifierException("Non valid identifier");
            }
        } catch (InvalidIdentifierException e){
            throw new InvalidIdentifierException("Unexpected error", e);
        } catch (InvalidClassException e) {
            throw new InvalidClassException("Unexpected error", e);
        }

    }

    /**
     * O programa deve determinar se um identificador é válido ou não. Um identificador válido deve começar com uma letra e conter apenas letras ou dígitos. Além disso, deve ter no mínimo um caractere e no máximo seis caracteres de comprimento.
     *
     * Exemplo:
     *
     * abc12 (válido);
     * cont*1 (inválido);
     * 1soma (inválido);
     *  a123456 (inválido).*/


}
