package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    lateinit var binding :ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.asearlo.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Felicidades!!!")
                .setMessage("Tu Mascota ha sido Aseada")
                .setPositiveButton("Oki"){d,i->
                    d.dismiss()
                    Toast.makeText(this, "Ahora puedes Regresar al Menu Principal", Toast.LENGTH_LONG).show()
                }
                .show()
            binding.regresar2.setOnClickListener {
                var segundo= Intent(this, MainActivity2::class.java)
                startActivity(segundo)
            }

        }
    }
}