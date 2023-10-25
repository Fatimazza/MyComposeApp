package io.github.fatimazza.mycomposeapp.ui.reply

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import io.github.fatimazza.mycomposeapp.R
import io.github.fatimazza.mycomposeapp.data.reply.MailboxType

@Composable
fun ReplyDetailsScreen(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.inverseOnSurface)
                .padding(top = dimensionResource(R.dimen.detail_card_list_padding_top))
        ) {
            item {
                ReplyDetailsScreenTopBar(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = dimensionResource(R.dimen.detail_topbar_padding_bottom))
                )
                ReplyEmailDetailsCard(
                    modifier = Modifier.padding(horizontal = dimensionResource(R.dimen.detail_card_outer_padding_horizontal))
                )
            }
        }
    }
}

@Composable
private fun ReplyDetailsScreenTopBar(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        IconButton(
            onClick = { },
            modifier = Modifier
                .padding(horizontal = dimensionResource(R.dimen.detail_topbar_back_button_padding_horizontal))
                .background(MaterialTheme.colorScheme.surface, shape = CircleShape),
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = stringResource(id = R.string.navigation_back)
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = dimensionResource(R.dimen.detail_subject_padding_end))
        ) {
            Text(
                text = stringResource(R.string.email_0_subject),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Composable
private fun ReplyEmailDetailsCard(
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.detail_card_inner_padding))
        ) {
            DetailsScreenHeader(
                Modifier.fillMaxWidth()
            )
            Text(
                text = stringResource(R.string.email_0_subject),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.outline,
                modifier = Modifier.padding(
                    top = dimensionResource(R.dimen.detail_content_padding_top),
                    bottom = dimensionResource(R.dimen.detail_expanded_subject_body_spacing)
                ),
            )
            Text(
                text = stringResource(R.string.email_0_body),
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
            DetailsScreenButtonBar()
        }
    }
}

@Composable
private fun DetailsScreenButtonBar(
    modifier: Modifier = Modifier,
    mailboxType: MailboxType = MailboxType.Inbox
) {
    Box(modifier = modifier) {
        when (mailboxType) {
            MailboxType.Drafts ->
                ActionButton(
                    text = stringResource(id = R.string.email_continue_composing),
                )

            MailboxType.Spam ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            vertical = dimensionResource(R.dimen.detail_button_bar_padding_vertical)
                        ),
                    horizontalArrangement = Arrangement.spacedBy(
                        dimensionResource(R.dimen.detail_button_bar_item_spacing)
                    ),
                ) {
                    ActionButton(
                        text = stringResource(id = R.string.email_move_to_inbox),
                        modifier = Modifier.weight(1f)
                    )
                    ActionButton(
                        text = stringResource(id = R.string.email_delete),
                        modifier = Modifier.weight(1f)
                    )
                }

            MailboxType.Sent, MailboxType.Inbox ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            vertical = dimensionResource(R.dimen.detail_button_bar_padding_vertical)
                        ),
                    horizontalArrangement = Arrangement.spacedBy(
                        dimensionResource(R.dimen.detail_button_bar_item_spacing)
                    ),
                ) {
                    ActionButton(
                        text = stringResource(id = R.string.reply),
                        modifier = Modifier.weight(1f)
                    )
                    ActionButton(
                        text = stringResource(id = R.string.reply_all),
                        modifier = Modifier.weight(1f)
                    )
                }

        }
    }
}

@Composable
private fun DetailsScreenHeader(
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier) {
        ReplyProfileImage(
            drawableResource = R.drawable.reply_avatar_1,
            description = stringResource(R.string.account_1_first_name) + " "
                    + stringResource(R.string.account_1_last_name),
            modifier = Modifier.size(
                dimensionResource(R.dimen.email_header_profile_size)
            )
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(
                    horizontal = dimensionResource(R.dimen.email_header_content_padding_horizontal),
                    vertical = dimensionResource(R.dimen.email_header_content_padding_vertical)
                ),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(R.string.account_1_first_name),
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = stringResource(R.string.email_1_time),
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.outline
            )
        }
    }
}

@Composable
private fun ActionButton(
    text: String,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = dimensionResource(R.dimen.detail_action_button_padding_vertical))
        ) {
            Text(
                text = text
            )
        }
    }
}


@Preview
@Composable
fun ReplyDetailsScreenPreview() {
    ReplyDetailsScreen()
}
