package io.github.fatimazza.mycomposeapp.ui.reply

import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Drafts
import androidx.compose.material.icons.filled.Inbox
import androidx.compose.material.icons.filled.Report
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import io.github.fatimazza.mycomposeapp.R
import io.github.fatimazza.mycomposeapp.data.reply.MailboxType

@Composable
fun ReplyHomeScreen(
    modifier: Modifier = Modifier
) {
    val navigationItemContentList = listOf(
        NavigationItemContent(
            mailboxType = MailboxType.Inbox,
            icon = Icons.Default.Inbox,
            text = stringResource(id = R.string.email_tab_inbox)
        ),
        NavigationItemContent(
            mailboxType = MailboxType.Sent,
            icon = Icons.Default.Send,
            text = stringResource(id = R.string.email_tab_sent)
        ),
        NavigationItemContent(
            mailboxType = MailboxType.Drafts,
            icon = Icons.Default.Drafts,
            text = stringResource(id = R.string.email_tab_drafts)
        ),
        NavigationItemContent(
            mailboxType = MailboxType.Spam,
            icon = Icons.Default.Report,
            text = stringResource(id = R.string.email_tab_spam)
        )
    )
    ReplyAppContent(
        navigationItemContentList = navigationItemContentList,
        modifier = modifier
    )
}

@Composable
private fun ReplyAppContent(
    navigationItemContentList: List<NavigationItemContent>,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        ReplyNavigationRail(
            navigationItemContentList = navigationItemContentList
        )
    }
}

@Composable
private fun ReplyNavigationRail(
    navigationItemContentList: List<NavigationItemContent>,
    modifier: Modifier = Modifier
) {
    NavigationRail(modifier = modifier) {
        for (navItem in navigationItemContentList) {
            NavigationRailItem(
                selected = true,
                onClick = { },
                icon = {
                    Icon(
                        imageVector = navItem.icon,
                        contentDescription = navItem.text
                    )
                }
            )
        }
    }
}

private data class NavigationItemContent(
    val mailboxType: MailboxType, val icon: ImageVector, val text: String
)
