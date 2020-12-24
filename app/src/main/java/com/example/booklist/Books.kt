package com.example.booklist

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Books (val name : String,
                  val image : Int,
                  var rating : Int,
                  var des : String = "kkk") : Parcelable {
}