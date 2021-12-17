package org.thoughtcrime.securesms.onboarding

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import org.thoughtcrime.securesms.R

class OnBoardingMainMenuActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_onboarding_main_menu)
    val create = findViewById<Button>(R.id.createAccount)
    create.setOnClickListener {
      finish()
    }

    val haveAccount = findViewById<Button>(R.id.haveAnAccount)
    haveAccount.setOnClickListener {
      finish()
    }

    setImmersiveMode()
  }

  fun setImmersiveMode() {
    window.decorView.systemUiVisibility = (
      View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        or View.SYSTEM_UI_FLAG_FULLSCREEN
      )
  }


}