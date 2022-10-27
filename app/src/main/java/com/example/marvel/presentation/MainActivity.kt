package com.example.marvel.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
<<<<<<< HEAD
import com.example.marvel.CardsNavHost
=======
>>>>>>> 606843f... based structure for clean architecture

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
<<<<<<< HEAD
            CardsNavHost()
=======
            Home()

>>>>>>> 606843f... based structure for clean architecture
        }
    }
}
