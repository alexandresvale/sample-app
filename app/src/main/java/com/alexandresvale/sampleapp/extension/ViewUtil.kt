package com.alexandresvale.sampleapp.extension

import android.view.View

fun View.visible(visible: Boolean = false) {
    visibility = if (visible) View.VISIBLE else View.GONE
}