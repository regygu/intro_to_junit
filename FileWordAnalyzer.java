import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FileWordAnalyzer {

    FilePartReader fpr;

    public FileWordAnalyzer(FilePartReader fpr) {
        this.fpr = fpr;
    }

    public ArrayList wordsByABC() {
        ArrayList<String> result = new ArrayList<>();
        List<String> list = Arrays.asList(fpr.readLines().split(" "));
        result.addAll(list);
        result.sort(String::compareToIgnoreCase);
        return result;
    }

    public ArrayList wordsContainingSubString(String subString) {
        String[] list = fpr.readLines().split(" ");
        ArrayList<String> result = new ArrayList<>();

        for (String elem: list) {
            if (elem.contains(subString)) {
                result.add(elem);
            }
        }

        return result;
    }
}
