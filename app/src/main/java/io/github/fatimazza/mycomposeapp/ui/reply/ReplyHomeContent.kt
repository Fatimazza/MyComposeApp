package io.github.fatimazza.mycomposeapp.ui.reply

import androidx.compose.foundation.Image
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import io.github.fatimazza.mycomposeapp.R

@Composable
fun ReplyLogo(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.primary
) {
    Image(
        painter = painterResource(R.drawable.reply_logo),
        contentDescription = stringResource(R.string.email_logo),
        colorFilter = ColorFilter.tint(color),
        modifier = modifier
    )
}
