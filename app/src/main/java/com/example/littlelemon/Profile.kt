package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Profile(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Step 1: Add the Header for Profile screen
        Header(profileHeader = true)

        // Step 2: Display user data
        Spacer(modifier = Modifier.height(16.dp))
        UserData()

        // Step 3: Log out button
        Spacer(modifier = Modifier.weight(1f))
        LogoutButton(navController = navController)
    }
}

@Preview
@Composable
fun Header(profileHeader: Boolean = false) {
    if (profileHeader) {
        // Header UI code for Profile screen
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Profile Header",
            modifier = Modifier.size(120.dp)
        )
    } else {

    }
}

@Composable
fun UserData() {
    val firstName = "John" // Retrieve from shared preferences
    val lastName = "Doe" // Retrieve from shared preferences
    val email = "john.doe@example.com" // Retrieve from shared preferences

    Column {
        Text("First Name: $firstName")
        Text("Last Name: $lastName")
        Text("Email: $email")
    }
}

@Composable
fun LogoutButton(navController: NavController) {
    Button(onClick = {
        // Clear data from shared preferences
        // Navigate to Onboarding screen
    }) {
        Text("Log out")
    }
}

@Composable
fun Home(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "App Logo",
            modifier = Modifier.size(200.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Profile Button",
            modifier = Modifier
                .size(50.dp)
                .padding(16.dp)
                .clickable {
                    navController.navigate("profile")
                }
        )
    }
}
