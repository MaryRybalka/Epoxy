package com.example.epoxy2.models

import java.util.*

object ItemDataFactory{
    private val random = Random()

    fun getItems(count:Int) : List<Item>{
        val items = mutableListOf<Item>()
        repeat(count){
            val grid = random.nextInt(7)
            if (grid >=4)
                items.add(ItemPet())
            else
                items.add(ItemBug())
        }
        return items
    }
}