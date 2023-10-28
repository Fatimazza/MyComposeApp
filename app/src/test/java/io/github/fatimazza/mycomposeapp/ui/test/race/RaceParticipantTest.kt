package io.github.fatimazza.mycomposeapp.ui.test.race

import io.github.fatimazza.mycomposeapp.ui.race.RaceParticipant

class RaceParticipantTest {
    private val raceParticipant = RaceParticipant(
        name = "Test",
        maxProgress = 100,
        progressDelayMillis = 500L,
        initialProgress = 0,
        progressIncrement = 1
    )
}
