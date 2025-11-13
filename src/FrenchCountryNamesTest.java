import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrenchCountryNamesTest {

    @Test
    @DisplayName("Country that is feminine")
    void testFeminine() {
        assertEquals("la Mongolie", FrenchCountryNames.addFrenchArticleToCountry("Mongolie"));
    }

    @Test
    @DisplayName("Country that is plural")
    void testPlural() {
        assertEquals("les Etats-Unis", FrenchCountryNames.addFrenchArticleToCountry("Etats-Unis"));
    }

    @Test
    @DisplayName("Country that is masculine despite ending with 'e'")
    void test3() {
        assertEquals("le Mexique", FrenchCountryNames.addFrenchArticleToCountry("Mexique"));
    }

    @Test
    @DisplayName("Country that starts with a vowel")
    void test4() {
        assertEquals("l'Algerie", FrenchCountryNames.addFrenchArticleToCountry("Algerie"));
    }
}