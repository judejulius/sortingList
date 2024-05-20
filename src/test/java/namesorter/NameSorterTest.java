package namesorter;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameSorterTest {

    @Test
    public void testSortNames() {
        List<String> inputNames = Arrays.asList(
            "Janet Parsonsss",
            "Vaugh Lewis",
            "Adonis Julius Archer",
            "Shelby Nathan Yoder",
            "Marin Alvarez",
            "London Lindsey",
            "Beau Tristan Bentley",
            "Leo Gardner",
            "Hunter Uriah Mathew Clarke",
            "Mikayla Lopez",
            "Frankie Conner Ritter"
        );

        List<String> expectedOutput = Arrays.asList(
            "Marin Alvarez",
            "Adonis Julius Archer",
            "Beau Tristan Bentley",
            "Hunter Uriah Mathew Clarke",
            "Leo Gardner",
            "Vaugh Lewis",
            "London Lindsey",
            "Mikayla Lopez",
            "Janet Parsons",
            "Frankie Conner Ritter",
            "Shelby Nathan Yoder"
        );

        Sorter nameSorter = new NameSorter();
        List<String> sortedNames = nameSorter.sort(inputNames);

        assertEquals(expectedOutput, sortedNames);
    }
}
