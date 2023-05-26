package com.example.mycomposeintroduction

import android.content.Context
import android.content.Intent
import android.net.Uri


fun openWebPage(localContext: Context, url: String) {
    val webpage: Uri = Uri.parse(url)
    val intent = Intent(Intent.ACTION_VIEW, webpage)
    localContext.startActivity(intent)
}

