package ex42;

import junit.framework.TestCase;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main42Test extends TestCase {

    public void testMain() {
    }

    public void testFormTable() throws IOException {
        File expectedValue = new File("src/test/java/ex42/exercise42_expectedoutput.txt");
        File actual = new File("src/test/java/ex42/ex42_actualOuput.txt");
        assertEquals(FileUtils.readFileToByteArray(expectedValue),FileUtils.readFileToByteArray(actual));
    }
}
