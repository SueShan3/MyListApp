package com.example.mylistapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class StoryInfo(
    val title: String,
    val detail: String,
    val image: Int
) : Parcelable