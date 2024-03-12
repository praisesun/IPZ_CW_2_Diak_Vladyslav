package com.example.ipz_cw_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ipz_cw_2.ui.theme.IPZ_CW_2_Diak_VladyslavTheme
import ua.edu.lntu.cw_2.ui.theme.IPZ_CW_2_Diak_VladyslavTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IPZ_CW_2_Diak_VladyslavTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SignIn(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun SignIn(modifier: Modifier = Modifier) {
    Column {
        TextField(value = "", onValueChange = {}, placeholder = { Text("Введіть пошту") })
        TextField(value = "", onValueChange = {}, placeholder = { Text("Введіть пароль") })
        Button(onClick = {}) { Text(text = "Увійти") }
    }
}

@Preview(showBackground = true)
@Composable
fun SignInPreview() {
    IPZ_CW_2_Diak_VladyslavTheme {
        SignIn()
    }
}