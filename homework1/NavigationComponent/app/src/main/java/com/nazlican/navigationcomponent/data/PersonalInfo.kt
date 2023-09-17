package com.nazlican.navigationcomponent.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonalInfo(val nameAndSurname:String, val email: String, val password: String, val phoneNumber:String):Parcelable
