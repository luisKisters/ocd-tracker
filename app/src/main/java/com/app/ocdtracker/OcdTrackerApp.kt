package com.app.ocdtracker

import android.app.Application
import com.app.ocdtracker.data.AppDatabase

class OcdTrackerApp : Application() {
    val database: AppDatabase by lazy { AppDatabase.getInstance(this) }
}
