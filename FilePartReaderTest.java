import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FilePartReaderTest {

    String correctFilepath = "/home/ugyan/IdeaProjects/JUnit/src/text.txt";

    @Test
    public void testFilePartReaderConstructor1() {

        Exception exception = null;

        try {
            FilePartReader fpr = new FilePartReader(correctFilepath, 2, 1);
        } catch(Exception ex) {
            exception = ex;
        }

        assertTrue(exception instanceof IllegalArgumentException);
        assertEquals("Invalid line numbers", exception.getMessage());

    }

    @Test
    public void testFilePartReaderConstructor2() {

        Exception exception = null;

        try {
            FilePartReader fpr = new FilePartReader(correctFilepath, 0, 5);
        } catch(Exception ex) {
            exception = ex;
        }

        assertTrue(exception instanceof IllegalArgumentException);
        assertEquals("Invalid line numbers", exception.getMessage());
    }



    @Test
    public void testReadLines() {

        String result = "";
        result += "ggggggggggggggg" + " ";
        result += "hhhhhhhhhhhhhhh" + " ";
        result += "jjjjjjjjjjjjjjj" + " ";

        FilePartReader fpr = new FilePartReader(correctFilepath, 1, 3);

        assertEquals(result, fpr.readLines());


    }
}
