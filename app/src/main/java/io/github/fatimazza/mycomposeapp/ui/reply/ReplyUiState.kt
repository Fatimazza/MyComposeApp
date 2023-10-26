package io.github.fatimazza.mycomposeapp.ui.reply

import io.github.fatimazza.mycomposeapp.data.reply.Email
import io.github.fatimazza.mycomposeapp.data.reply.MailboxType
import io.github.fatimazza.mycomposeapp.data.reply.local.LocalEmailsDataProvider

data class ReplyUiState(
    val mailboxes: Map<MailboxType, List<Email>> = emptyMap(),
    val currentMailbox: MailboxType = MailboxType.Inbox,
    val currentSelectedEmail: Email = LocalEmailsDataProvider.defaultEmail,
    val isShowingHomepage: Boolean = true
) {
    val currentMailboxEmails: List<Email> by lazy { mailboxes[currentMailbox]!! }
}
