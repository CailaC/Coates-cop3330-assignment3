package ex41;

import junit.framework.TestCase;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main41Test extends TestCase {



    public void testSortListAlphabetically() throws IOException {
        File expectedValue = new File("src/test/java/ex41/expected41_output");
        File actual = new File("src/main/java/ex41/exercise41_input.txt");
        assertEquals(FileUtils.readFileToByteArray(expectedValue),FileUtils.readFileToByteArray(actual));
    }
}