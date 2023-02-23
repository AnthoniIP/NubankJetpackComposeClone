package com.ipsoft.nubankcomposeclone.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.ipsoft.nubankcomposeclone.ui.theme.white

@Composable
fun UserAvatar() {
    Row(
        modifier = Modifier
            .clip(CircleShape)
            .background(MaterialTheme.colors.secondary)
    ) {
        Icon(
            Icons.Filled.AccountBox,
            "avatar",
            tint = white,
            modifier = Modifier
                .size(50.dp)
                .padding(horizontal = 10.dp)
        )
    }
}