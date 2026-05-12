package com.lifeline.app.utils

import android.content.Context
import android.content.Intent
import android.net.Uri

object SOSUtils {
    fun callEmergency(context: Context) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:112")
        }
        context.startActivity(intent)
    }
}
