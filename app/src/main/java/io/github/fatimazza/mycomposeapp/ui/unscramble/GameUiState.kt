package io.github.fatimazza.mycomposeapp.ui.unscramble

data class GameUiState(
    val currentScrambledWord: String = "",
    val isGuessedWordWrong: Boolean = false,
    val currentWordCount: Int = 1,
    val score: Int = 0
)
