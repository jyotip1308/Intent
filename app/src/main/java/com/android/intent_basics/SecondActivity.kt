package com.android.intent_basics

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.android.intent_basics.ui.theme.Intent_BasicsTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent.getStringExtra(Intent.EXTRA_EMAIL)
        intent.getStringExtra(Intent.EXTRA_TEXT)

//        var a = intent.getStringExtra(Intent.EXTRA_TEXT)
//        var b = intent.getStringExtra("mytext")

        setContent {
            Intent_BasicsTheme {
                Text(text = "Second Activity")
//                Text(text = a!!)
//                Text(text = b!!)
            }
        }
    }
}