package com.ipsoft.nubankcomposeclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ipsoft.nubankcomposeclone.ui.theme.NuColor03
import com.ipsoft.nubankcomposeclone.ui.theme.NubankComposeCloneTheme
import com.ipsoft.nubankcomposeclone.ui.widgets.AccountBalance
import com.ipsoft.nubankcomposeclone.ui.widgets.ActionViewList
import com.ipsoft.nubankcomposeclone.ui.widgets.ButtonAccount
import com.ipsoft.nubankcomposeclone.ui.widgets.CreditCard
import com.ipsoft.nubankcomposeclone.ui.widgets.CreditInfo01
import com.ipsoft.nubankcomposeclone.ui.widgets.CreditInfo02
import com.ipsoft.nubankcomposeclone.ui.widgets.DiscoveryInfo
import com.ipsoft.nubankcomposeclone.ui.widgets.HeaderUser
import com.ipsoft.nubankcomposeclone.ui.widgets.Info
import com.ipsoft.nubankcomposeclone.ui.widgets.ServiceInfo02

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NubankComposeCloneTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun MenuList() {
    Column() {
        ButtonAccount()
        AccountBalance()
        ActionViewList()
        CreditCard()
        Info()
        Divider(color = NuColor03, thickness = 2.dp)
        CreditInfo01()
        Divider(color = NuColor03, thickness = 2.dp)
        CreditInfo02()
        Divider(color = NuColor03, thickness = 2.dp)
        ServiceInfo02()
        Divider(color = NuColor03, thickness = 2.dp)
        DiscoveryInfo()
    }
}

@Composable
fun Home() {
    val scrollState = rememberScrollState()

    LaunchedEffect(Unit) {
        scrollState.animateScrollTo(0)
    }

    Column(
        modifier = Modifier
            .background(Color(0xFF223322))
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        HeaderUser()
        MenuList()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NubankComposeCloneTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Home()
        }
    }
}