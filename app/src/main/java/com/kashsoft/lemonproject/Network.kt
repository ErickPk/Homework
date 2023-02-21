package com.kashsoft.lemonproject

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MenuNetwork(
    @SerialName("menu")
    val items: List<MenuItemNetwork>
)

@Serializable
data class MenuItemNetwork(
    @SerialName("id")
    val id: Int,
    @SerialName("title")
    val title: String,
    @SerialName("price")
    val price: String,
) {
    fun toMenuItemRoom(): MenuItemRoom = MenuItemRoom(
        id = id,
        title = title,
        price = price.toDouble(),
    )
}
