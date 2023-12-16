package com.android.intent_basics

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.intent_basics.ui.theme.Intent_BasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Intent_BasicsTheme {
                Column (modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Button(onClick = {

                        // Explicit Intent

//                     Intent(applicationContext, SecondActivity::class.java).also {
//                         it.putExtra("mytext", "This is my custom text")
//                         it.putExtra(Intent.EXTRA_TEXT, "This is the content of my email")
//                                startActivity(it)
//                        }
//                        Intent(Intent.ACTION_MAIN).also {
//                            it.`package` = "com.google.android.youtube"
//                            try {
//                                startActivity(it)
//                            } catch (e: ActivityNotFoundException){
//                                e.printStackTrace()
//                            }
//                        }

                        // Implicit Intent
                        val intent = Intent(Intent.ACTION_SEND).apply {
                            type = "text/plain"
                            putExtra(Intent.EXTRA_EMAIL, arrayOf("test@test.com"))
                            putExtra(Intent.EXTRA_SUBJECT, "This is my subject")
                            putExtra(Intent.EXTRA_TEXT, "This is the content of my email")
                        }
                        if (intent.resolveActivity(packageManager) != null ){
                            startActivity(intent)
                        }

                    }) {
                        Text(text = "Click me")
                    }

                }
            }
        }
    }
}

