package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding : ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        AlertDialog.Builder(this)
            .setTitle("Vas a ver a tu mascota :)")
            .setMessage("Te presentamos a tu mascota")
            .setPositiveButton("Oki"){ d,i->
                d.dismiss()
            }
            .show()
        binding.regresar1.setOnClickListener {
            var segundoActivity = Intent(this, MainActivity2::class.java)
            startActivity(segundoActivity)
        }
    }
}