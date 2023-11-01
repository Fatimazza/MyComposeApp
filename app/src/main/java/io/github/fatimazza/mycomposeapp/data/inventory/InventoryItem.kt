package io.github.fatimazza.mycomposeapp.data.inventory

/**
 * Entity data class represents a single row in the database.
 */
class InventoryItem(
    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
)
