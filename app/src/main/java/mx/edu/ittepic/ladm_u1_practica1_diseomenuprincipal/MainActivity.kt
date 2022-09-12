package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.OsConstants
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.entrar.setOnClickListener {
            var segundoActivity= Intent(this, MainActivity2::class.java)
            startActivity(segundoActivity)
        }
        binding.salir.setOnClickListener {
            finish()
            System.exit(0)
        }
    }
}