package namesorter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileProcessor {
    public List<String> readNames(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    public void writeNames(String filePath, List<String> names) throws IOException {
        Files.write(Paths.get(filePath), names);
    }
}