package com.it10x.foodappgstav7_30.printer.common

import android.graphics.Bitmap

data class PrintDocument(
    val text: String,
    val logo: Bitmap? = null,
    val qrData: String? = null
)