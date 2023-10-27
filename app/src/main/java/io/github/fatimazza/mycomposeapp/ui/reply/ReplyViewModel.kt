package io.github.fatimazza.mycomposeapp.ui.reply

import androidx.lifecycle.ViewModel
import io.github.fatimazza.mycomposeapp.data.reply.Email
import io.github.fatimazza.mycomposeapp.data.reply.MailboxType
import io.github.fatimazza.mycomposeapp.data.reply.local.LocalEmailsDataProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ReplyViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(ReplyUiState())
    val uiState: StateFlow<ReplyUiState> = _uiState

    init {
        initializeUIState()
    }

    private fun initializeUIState() {
        val mailboxes: Map<MailboxType, List<Email>> =
            LocalEmailsDataProvider.allEmails.groupBy { it.mailbox }
        _uiState.value =
            ReplyUiState(
                mailboxes = mailboxes,
                currentSelectedEmail = mailboxes[MailboxType.Inbox]?.get(0)
                    ?: LocalEmailsDataProvider.defaultEmail
            )
    }
}
