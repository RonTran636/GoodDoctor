package com.rontran.gooddoctor.utils

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper

fun Context.getActivity(): Activity? = when (this) {
    is Activity -> this
    // this recursion should be okay since we call getActivity on a view context
    // that should have an Activity as its baseContext at some point
    is ContextWrapper -> baseContext.getActivity()
    else -> null
}