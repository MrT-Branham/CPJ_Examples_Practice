import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceTest {

    private Sequence seq;

    @BeforeEach
    void setUp() {
        seq = new Sequence();
    }

    @Test
    @DisplayName("isPermutationOf: valid permutation with different order")
    void isPermutationOf_validPermutation_returnsTrue() {
        int[] one = {1, 2, 3};
        int[] two = {3, 1, 2};
        assertTrue(seq.isPermutationOf(one, two),
                "Arrays with same elements in different order should be permutations");
    }

    @Test
    @DisplayName("isPermutationOf: not a permutation (different elements)")
    void isPermutationOf_differentElements_returnsFalse() {
        int[] one = {1, 2, 3};
        int[] two = {1, 2, 4};
        assertFalse(seq.isPermutationOf(one, two),
                "Arrays with different elements should not be permutations");
    }

    @Test
    @DisplayName("isPermutationOf: different lengths")
    void isPermutationOf_differentLengths_returnsFalse() {
        int[] one = {1, 2, 3};
        int[] two = {1, 2};
        assertFalse(seq.isPermutationOf(one, two),
                "Arrays of different lengths cannot be permutations");
    }

    @Test
    @DisplayName("isPermutationOf: identical arrays")
    void isPermutationOf_identicalArrays_returnsTrue() {
        int[] one = {5, 10, 15};
        int[] two = {5, 10, 15};
        assertTrue(seq.isPermutationOf(one, two),
                "Identical arrays should be permutations");
    }

    @Test
    @DisplayName("isPermutationOf: arrays with duplicates")
    void isPermutationOf_withDuplicates_returnsTrue() {
        int[] one = {1, 1, 2, 2};
        int[] two = {2, 1, 2, 1};
        assertTrue(seq.isPermutationOf(one, two),
                "Arrays with duplicates in different order should be permutations");
    }

    @Test
    @DisplayName("isPermutationOf: empty arrays")
    void isPermutationOf_emptyArrays_returnsTrue() {
        int[] one = {};
        int[] two = {};
        assertTrue(seq.isPermutationOf(one, two),
                "Two empty arrays should be permutations");
    }
}