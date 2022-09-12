package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    lateinit var binding : ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dormirlo.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Lo estas haciendo bien!!!")
                .setMessage("Ahora tu mascota esta durmiendo puedes salir en paz")
                .setPositiveButton("Oki"){ d,i ->
                    d.dismiss()
                }
                .show()
        }
        binding.regresar.setOnClickListener {
            var segundo= Intent(this, MainActivity2::class.java)
            startActivity(segundo)
        }

    }
}