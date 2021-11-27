package com.example.epoxy2.viewmodels

import com.airbnb.epoxy.EpoxyController
import com.example.epoxy2.models.Item
import com.example.epoxy2.models.ItemDataFactory
import com.example.epoxy2.models.epoxy.SingleItemModel_


class SingleItemController : EpoxyController(){

    private val items : List<Item> = ItemDataFactory.getItems(10)

    private var index = 0L

    override fun buildModels() = items.forEach{
        SingleItemModel_(it)
            .id(index++)
            .addTo(this)
    }
}