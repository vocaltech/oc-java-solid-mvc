package fr.vocaltech.cardgame.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class SuitTest {
    @ParameterizedTest(name = "Get the value for Suit.{0}")
    @ValueSource(strings = {"DIAMONDS", "HEARTS", "SPADES", "CLUBS"})
    void givenSuitName_whenValue_thenReturnValue(String args) {
        // GIVEN
        Suit suit = Suit.valueOf(args);

        // WHEN
        int value = suit.value();

        // THEN
        assertThat(value).isIn(1, 2, 3, 4);
    }

    @Test
    void givenClubsAndDiamonds_whenCompareValue_thenClubsValueGreaterThanDiamondsValue() {
        // GIVEN
        Suit clubs = Suit.CLUBS;
        Suit diamonds = Suit.DIAMONDS;

        // WHEN
        int clubsValue = clubs.value();
        int diamondsValue = diamonds.value();

        // THEN
        assertThat(clubsValue).isGreaterThan(diamondsValue);
    }
}