package com.grace.patakeja.ui.Screens.Onboarding


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OnboardingScreen(
    onFinish: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("🏠 Rental App", style = MaterialTheme.typography.headlineLarge)

        Spacer(modifier = Modifier.height(12.dp))

        Text("Find houses in Komarock, Kayole & Umoja easily")

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = onFinish) {
            Text("Get Started")
        }
    }
}