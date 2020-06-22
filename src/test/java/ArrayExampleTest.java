import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class ArrayExampleTest {

    @Test
    void remDupes() {
        String [] dane= new String[]{"Basia", "Kasia", "Zosia", "Basia", "Kasia", "Zosia"};

        String [] expected= new String [] {"Basia", "Kasia", "Zosia"};
        String [] actual= ArrayExample.remDupes(dane);

        assertArrayEquals(expected,actual);

assertThat(expected).isEqualTo(actual);
    }
}