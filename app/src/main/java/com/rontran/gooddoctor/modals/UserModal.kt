package com.rontran.gooddoctor.modals

import java.util.*

data class UserModal(
    val firstName : String,
    val lastName: String,
    val dob: Date,
    val email: String?,
    val gender: Gender,
    val phoneNumber: String?,
    val height: Double,
    val weight: Double,
)

enum class Gender{
    male,
    female,
}