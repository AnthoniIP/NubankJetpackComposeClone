package com.ipsoft.nubankcomposeclone.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ipsoft.nubankcomposeclone.R.drawable
import com.ipsoft.nubankcomposeclone.ui.theme.NuBackgroundColor01
import com.ipsoft.nubankcomposeclone.ui.theme.NuColor04

@Composable
fun ServiceInfo02() {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .fillMaxWidth()
            .padding(horizontal = 6.dp)
            .paddingFromBaseline(
                top = 65.dp,
                bottom = 24.dp,
            )
    ) {
        Icon(
            ImageVector.vectorResource(id = drawable.ic_heart_outline),
            "Seguro de vida",
            modifier = Modifier
                .size(34.dp)
                .padding(start = 8.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Seguro de vida",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )
            )
            Icon(
                Icons.Filled.AccountBox,
                "",
                tint = NuBackgroundColor01,
                modifier = Modifier
                    .size(32.dp)
            )
        }
        Text(
            text = "Conhe??a NuBank Vida: um seguro simples e que cabe no bolso",
            modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth(),
            style = TextStyle(
                color = NuColor04,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = (-0.5).sp,
            )
        )
    }
}
