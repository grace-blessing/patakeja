package com.grace.patakeja.ui.Screens.Details

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.grace.patakeja.ui.Models.House

@Composable
fun HouseDetailsScreen(
    house: House,
    onBack: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        // Back button
        Button(onClick = onBack) {
            Text("← Back")
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Title
        Text(
            text = house.title,
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Location & Price
        Text("📍 Location: ${house.location}")
        Text("💰 Price: ${house.price}")

        Spacer(modifier = Modifier.height(16.dp))

        // Description
        Text(
            text = "Description",
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(house.description)

        Spacer(modifier = Modifier.height(20.dp))

        // Landlord Info
        Text(
            text = "Landlord Info",
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text("👤 Name: ${house.landlord}")
        Text("📞 Phone: ${house.phone}")

        Spacer(modifier = Modifier.height(24.dp))

        // Contact Button
        Button(
            onClick = {
                // later: open WhatsApp or dialer
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Contact Landlord")
        }
    }
}