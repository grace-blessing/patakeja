package com.grace.patakeja.ui.Screens.Home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.rentalapp.ui.components.HouseCard
import com.example.rentalapp.ui.data.SampleData
import com.example.rentalapp.ui.model.House
import com.grace.patakeja.ui.Data.SampleData
import com.grace.patakeja.ui.Models.House

@Composable
fun HomeScreen(
    onSelectHouse: (House) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        // Title
        Text(
            text = "Find Your Next Home 🏠",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "Komarock • Kayole • Umoja",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(16.dp))

        // List of houses
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(SampleData.houses) { house ->

                HouseCard(
                    house = house,
                    onClick = { onSelectHouse(house) }
                )
            }
        }
    }
}

@Composable
fun HouseCard(house: House, onClick: () -> Unit) {
    TODO("Not yet implemented")
}