package com.example.questnavigastugas_228.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(
    OnSubmitBtnClick:()-> Unit
){
    Scaffold { isiRuang->
        val jeno = painterResource(R.drawable.jeno)
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFD8B4FE))
                .padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){  }
    }
}