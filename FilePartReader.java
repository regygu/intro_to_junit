import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FilePartReader {

    String filepath;
    int fromLine;
    int toLine;

    public FilePartReader(String filepath, int fromLine, int toLine) {
        if (fromLine > toLine || fromLine < 1) {
            throw new IllegalArgumentException("Invalid line numbers");
        } else {
            this.filepath = filepath;
            this.fromLine = fromLine;
            this.toLine = toLine;
        }
    }

    private String read() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filepath)));
        return content;
    }

    public String readLines() {

        String content;
        String result = "";

        try {
            content = read();
            String[] lines = content.split("\n");

            for (int i = fromLine -1; i < toLine; i++) {
                result += lines[i] + " ";
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }

}
