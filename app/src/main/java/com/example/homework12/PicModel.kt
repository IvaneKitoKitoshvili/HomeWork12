package com.example.homework12

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PicModel(
    val image: Int,
    val name: String,
    val description: String
):Parcelable
