package fr.vocaltech.cardgame.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;

class RankTest {
    @Test
    void givenTWO_whenValue_thenReturn2() {
        // GIVEN
        Rank two = Rank.TWO;

        // WHEN
        int value = two.value();

        // THEN
        assertThat(value).isEqualTo(2);
    }

    @Test
    void givenJACK_whenValue_thenReturn10() {
        // GIVEN
        Rank jack = Rank.JACK;

        // WHEN
        int value = jack.value();

        // THEN
        assertThat(value).isEqualTo(10);
    }

    @Test
    void givenAceAndJack_whenCompareValue_thenAceValueIsGreaterThanJackValue() {
        // GIVEN
        Rank jack = Rank.JACK;
        Rank ace = Rank.ACE;

        // WHEN
        int aceValue = ace.value();
        int jackValue = jack.value();

        // THEN
        assertThat(aceValue).isGreaterThan(jackValue);
    }

    @ParameterizedTest(name = "Get the value for Rank.{0}")
    @ValueSource(strings = {"ACE", "KING", "QUEEN", "JACK"})
    void givenRanks_whenValue_thenReturnCorrectValues(String args) {
        // GIVEN
        Rank rank = Rank.valueOf(args);

        // WHEN
        int value = rank.value();

        // THEN
        assertThat(value).isIn(13,12,11,10);
    }
}