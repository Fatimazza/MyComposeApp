package io.github.fatimazza.mycomposeapp.ui.reply

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.fatimazza.mycomposeapp.data.reply.MailboxType

@Composable
fun ReplyHomeScreen(
    modifier: Modifier = Modifier
) {
    ReplyAppContent(modifier)
}

@Composable
fun ReplyAppContent(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {

    }
}

private data class NavigationItemContent(
    val mailboxType: MailboxType, val icon: ImageVector, val text: String
)
