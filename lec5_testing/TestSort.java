package lec5_testing;

import org.junit.jupiter.api.Test;
import static com.google.common.truth.Truth.assertThat;

/** Evaluate that Sort.sort and its helper
 *  functions work correctly. */

public class TestSort {
    @Test
    public void testSort() {
        String[] input = {"hello", "whoa", "apple", "hola"};
        String[] expected = {"apple", "hello", "hola", "whoa"};

        // after i call this, input should be sorted
        Sort.sort(input);

        assertThat(input).isEqualTo(expected);
    }

    @Test
    public void testFindSmallest() {

        String[] input = {"hello", "whoa", "apple", "hola"};

        // expected smallest string ALPHABETICALLY
        // because we are sorting ALPHABETICALLY
        int expected = 3;
        int actual = Sort.findSmallest(input, 3);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testSwap() {
        String[] input = {"hello", "whoa", "apple", "hola"};
        String[] expected = {"hello", "hola", "apple", "whoa"};

        Sort.swap(input, 1, 3);
        assertThat(input).isEqualTo(expected);
    }
}
