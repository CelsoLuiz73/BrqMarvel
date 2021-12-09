package br.com.celsooliveira.brqmarvel.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import br.com.celsooliveira.brqmarvel.R
import br.com.celsooliveira.modelos.ConstantesUI
import br.com.celsooliveira.telalogin.view.LoginActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent()
            intent.setClassName(this, ConstantesUI.loginActivity)
            startActivity(intent)
            finish()
        }, 5000)

    }
}