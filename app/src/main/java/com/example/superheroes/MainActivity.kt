package com.example.superheroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.superheroes.data.HeroesRepository
import com.example.superheroes.model.Hero
import com.example.superheroes.ui.theme.SuperheroesTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperheroesTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text("Super Heroes") }
                        )
                    }
                ) { innerPadding ->

                    ListOfHeroes(
                        heroesList = HeroesRepository.heroes,
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun SuperHeroPreview() {
    SuperheroesTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Super Heroes") }
                )
            }
        ) { innerPadding ->
            ListOfHeroes(
                heroesList = HeroesRepository.heroes,
                modifier = Modifier.padding(innerPadding)
            )

        }
    }
}