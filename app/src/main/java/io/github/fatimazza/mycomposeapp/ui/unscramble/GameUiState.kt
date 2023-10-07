package io.github.fatimazza.mycomposeapp.ui.unscramble

data class GameUiState(
    val currentScrambledWord: String = "",
    val isGuessedWordWrong: Boolean = false,
)
