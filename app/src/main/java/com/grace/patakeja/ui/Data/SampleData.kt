package com.grace.patakeja.ui.Data


import com.grace.patakeja.ui.Models.House

object SampleData {

    val houses = listOf(

        House(
            id = 1,
            title = "Bedsitter Room",
            location = "Komarock",
            price = "Ksh 8,000",
            description = "Simple and secure bedsitter, water included.",
            landlord = "Danson Kihara",
            phone = "0721424877"
        ),

        House(
            id = 2,
            title = "Single Room",
            location = "Kayole",
            price = "Ksh 6,500",
            description = "Affordable single room near transport and shops.",
            landlord = "Grace Wanjiku",
            phone = "0723456789"
        ),

        House(
            id = 3,
            title = "One Bedroom",
            location = "Umoja",
            price = "Ksh 10,000",
            description = "Clean one bedroom with electricity and water available.",
            landlord = "Mzee",
            phone = "0722222378"
        )

    )
}