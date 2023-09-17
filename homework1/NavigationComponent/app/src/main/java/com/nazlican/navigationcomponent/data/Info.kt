package com.nazlican.navigationcomponent.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Info(val personalInfo: PersonalInfo, val hometown:String, val school: String, val department: String ):Parcelable
