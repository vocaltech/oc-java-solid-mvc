package fr.vocaltech.cardgame.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PlayingCardTest {
    @Test
    void givenPlayingCardAceAndHearts_whenValue_thenReturn13And2() {
        // GIVEN
        Rank rank = Rank.ACE;
        Suit suit = Suit.HEARTS;
        PlayingCard playingCard = new PlayingCard(rank, suit);

        // WHEN
        int rankValue = playingCard.getRank().value();
        int suitValue = playingCard.getSuit().value();

        // THEN
        assertThat(rankValue).isEqualTo(13);
        assertThat(suitValue).isEqualTo(2);
    }

    @Test
    void givenPlayingCard_whenFlip_thenFaceUpIsTrue() {
        // GIVEN
        PlayingCard playingCard = new PlayingCard(Rank.KING, Suit.DIAMONDS);

        // WHEN
        boolean afterFlip = playingCard.flip();

        // THEN
        assertThat(afterFlip).isTrue();
    }
}
