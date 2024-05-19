package namesorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameSorter implements Sorter {
    @Override
    public List<String> sort(List<String> names) {
        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                String[] nameParts1 = name1.split(" ");
                String[] nameParts2 = name2.split(" ");
                String lastName1 = nameParts1[nameParts1.length - 1];
                String lastName2 = nameParts2[nameParts2.length - 1];

                int lastNameComparison = lastName1.compareTo(lastName2);
                if (lastNameComparison != 0) {
                    return lastNameComparison;
                }

                return name1.compareTo(name2);
            }
        });
        return sortedNames;
    }
}