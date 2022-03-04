import andressa.pos.teste.exceptions.InvalidClassException;
import andressa.pos.teste.exceptions.InvalidIdentifierException;
import andressa.pos.teste.identifier.Identifier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class IdentifierTest {

    @Test
    public void testIdentifier() throws InvalidClassException {
        String nullIdentifier = null;
        String ltMin = "";
        String gtMax = "abcd123";
        String min = "a";
        String max = "a12345";
        String beginsWithNumber = "1";
        String nonAlphanumeric = "@";

        Assertions.assertThrows(InvalidClassException.class, () -> Identifier.check(nullIdentifier));
        Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> Identifier.check(ltMin));
        Assertions.assertThrows(InvalidClassException.class, () -> Identifier.check(gtMax));
        Assertions.assertTrue(Identifier.check(min));
        Assertions.assertTrue(Identifier.check(max));
        Assertions.assertThrows(InvalidClassException.class, () -> Identifier.check(beginsWithNumber));
        Assertions.assertThrows(InvalidClassException.class, () -> Identifier.check(nonAlphanumeric));

    }
}
