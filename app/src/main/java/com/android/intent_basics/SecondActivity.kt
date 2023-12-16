package com.android.intent_basics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.android.intent_basics.ui.theme.Intent_BasicsTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Intent_BasicsTheme {
                Text(text = "Second Activity")
            }
        }
    }
}