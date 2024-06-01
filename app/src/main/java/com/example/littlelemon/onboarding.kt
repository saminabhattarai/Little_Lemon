package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


// Step 2: Add the Header
@Preview
@Composable
fun OnboardingPreview() {
    Onboarding()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Header with app logo
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "App Logo"
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Step 3: Collect user input
        Text(text = "Let's get to know you")

        val firstName = remember { mutableStateOf("") }
        TextField(
            value = firstName.value,
            onValueChange = { firstName.value = it },
            label = { Text("First Name") }
        )

        val lastName = remember { mutableStateOf("") }
        TextField(
            value = lastName.value,
            onValueChange = { lastName.value = it },
            label = { Text("Last Name") }
        )

        val email = remember { mutableStateOf("") }
        TextField(
            value = email.value,
            onValueChange = { email.value = it },
            label = { Text("Email Address") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Step 4: Add a register button
        Button(onClick = { /* Handle register button click */ }) {
            Text("Register")
        }
    }
}

@Composable
fun Onboarding() {
    TODO("Not yet implemented")
}
