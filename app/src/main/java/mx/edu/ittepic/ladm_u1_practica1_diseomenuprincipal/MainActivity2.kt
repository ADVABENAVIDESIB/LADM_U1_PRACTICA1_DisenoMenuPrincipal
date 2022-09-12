package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menu1.setOnClickListener {
            var tercerActivity= Intent(this, MainActivity3::class.java)
            startActivity(tercerActivity)
        }
        binding.menu2.setOnClickListener {
            var comerActivity = Intent(this, MainActivity4::class.java)
            startActivity(comerActivity)
        }
        binding.menu3.setOnClickListener {
            var asealoActivity =  Intent(this, MainActivity5::class.java)
            startActivity(asealoActivity)
        }
        binding.menu4.setOnClickListener {
            var suenoActivity = Intent(this, MainActivity6::class.java)
            startActivity(suenoActivity)
        }
        binding.menu5.setOnClickListener {
            var principal = Intent(this, MainActivity::class.java)
            startActivity(principal)
        }

    }
}