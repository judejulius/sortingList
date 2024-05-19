package namesorter;

import java.io.IOException;
import java.util.List;

public class NameSorterMain {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar name-sorter.jar <input-file>");
            System.exit(1);
        }

        String inputFile = args[0];
        FileProcessor fileProcessor = new FileProcessor();
        Sorter nameSorter = new NameSorter();
        
        try {
            List<String> names = fileProcessor.readNames(inputFile);
            List<String> sortedNames = nameSorter.sort(names);
            fileProcessor.writeNames("sorted-names-list.txt", sortedNames);
            sortedNames.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
            System.exit(1);
        }
    }
}