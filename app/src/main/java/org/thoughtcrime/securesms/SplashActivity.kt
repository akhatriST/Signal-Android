package org.thoughtcrime.securesms

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import org.thoughtcrime.securesms.onboarding.OnBoardingActivity

class SplashActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    startActivity(Intent(this, OnBoardingActivity::class.java))
    finish()
  }
}