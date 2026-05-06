package com.grace.patakeja

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.grace.patakeja.ui.Screens.ForgetPassword.ForgotPasswordScreen
import com.grace.patakeja.ui.Screens.HomeScreen.HomeScreen
import com.grace.patakeja.ui.Screens.OnboardingScreen.OnboardingScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RentalApp()
        }
    }
}

@Composable
fun RentalApp() {

    // Simple state-based navigation
    var currentScreen by remember { mutableStateOf("onboarding") }

    when (currentScreen) {

        "onboarding" -> OnboardingScreen(
            onFinish = { currentScreen = "login" }
        )

        "login" -> LoginScreenWrapper(
            onLoginSuccess = { currentScreen = "home" },
            onSignupClick = { currentScreen = "signup" },
            onForgotPasswordClick = { currentScreen = "forgot" }
        )

        "signup" -> SignupScreenWrapper(
            onSignupSuccess = { currentScreen = "home" },
            onBackToLogin = { currentScreen = "login" }
        )

        "forgot" -> ForgotPasswordScreen(
            onResetClick = {
                // later: Firebase reset email
                currentScreen = "login"
            },
            onBackToLogin = { currentScreen = "login" }
        )

        "home" -> HomeScreen()
    }
}

@Composable
fun SignupScreenWrapper(onSignupSuccess: () -> Unit, onBackToLogin: () -> Unit) {
    TODO("Not yet implemented")
}

@Composable
fun LoginScreenWrapper(
    onLoginSuccess: () -> Unit,
    onSignupClick: () -> Unit,
    onForgotPasswordClick: () -> Unit
) {
    TODO("Not yet implemented")
}