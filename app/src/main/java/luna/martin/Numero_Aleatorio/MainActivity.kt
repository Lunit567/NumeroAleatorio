package luna.martin.Numero_Aleatorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import luna.martin.Numero_Aleatorio.R
import android.widget.Button as Button1

class MainActivity : AppCompatActivity() {
    lateinit var b_iniciar: Button1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b_iniciar = findViewById(R.id.b_inicio)
        b_iniciar.setOnClickListener {
            val AbrirJuego = Intent(this,JuegoActivity::class.java)
            startActivity(AbrirJuego)
        }
    }
}