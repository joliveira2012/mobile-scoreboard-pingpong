package br.com.jaqueline.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Método para chamar uma tela após determinado tempo
        Handler().postDelayed({
            nextScreen()
        }, 2000L)
    }


    private fun nextScreen() {
        //No Intent eu passo o contexto e a tela que quero chamar
        val nextScreen = Intent(this, PlayerActivity::class.java)
        //Chama a próxima tela
        startActivity(nextScreen)
        //finaliza a chamada
        finish()
    }
}
