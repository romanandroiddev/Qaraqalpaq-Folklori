package uz.project.qaraqalpaqfolklori.local.sharepref

import android.content.Context
import android.content.SharedPreferences

class SharePref(context: Context) {
    private val pref: SharedPreferences =
        context.getSharedPreferences("sharePref", Context.MODE_PRIVATE)
//
//    var getIsSignUp: Boolean by BooleanPreference(pref, true)
}