import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;


public class FileWordAnalyzerTest {

    String filepath = "/home/ugyan/IdeaProjects/JUnit/src/text.txt";
    FilePartReader fpr = new FilePartReader(filepath, 1, 7);
    FileWordAnalyzer fwa = new FileWordAnalyzer(fpr);

    @Test
    public void testWordsContainingSubString() {

        ArrayList<String> result = new ArrayList<>();
        result.add("ddddddddddddddd");

        assertEquals(result, fwa.wordsContainingSubString("d"));

    }

    @Test
    public void testWordsByABC() {

        ArrayList<String> result = new ArrayList<>();
        result.add("aaaaaaaaaaaaaaa");
        result.add("ddddddddddddddd");
        result.add("ggggggggggggggg");
        result.add("hhhhhhhhhhhhhhh");
        result.add("jjjjjjjjjjjjjjj");
        result.add("kkkkkkkkkkkkkkk");
        result.add("lllllllllllllll");

        assertEquals(result, fwa.wordsByABC());

    }
}
