package namesorter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NameSorter implements Sorter {
    @Override
    public List<String> sort(List<String> names) {
        List<String> sortedNames = new ArrayList<>(names);
        sortedNames.sort(Comparator.comparing(NameSorter::extractLastName).thenComparing(Comparator.naturalOrder()));
        return sortedNames;
    }

    private static String extractLastName(String fullName) {
        String[] nameParts = fullName.split(" ");
        return nameParts[nameParts.length - 1];
    }
}