package com.example.epoxy2.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.epoxy2.R

open class Item (
    @DrawableRes val image:Int = -1,
    val title:String="",
    val desc:String=""
)