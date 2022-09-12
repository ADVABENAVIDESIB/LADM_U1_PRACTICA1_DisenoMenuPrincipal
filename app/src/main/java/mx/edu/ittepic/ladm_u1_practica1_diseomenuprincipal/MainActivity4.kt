package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    lateinit var binding : ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regresar1.setOnClickListener {
            var segundoActivity = Intent(this, MainActivity2::class.java)
            startActivity(segundoActivity)
        }
        binding.darComida.setOnClickListener {
            var quecomio= "nada"
            if (binding.carne.isChecked){
                quecomio="Carne"
            }
            if (binding.pasto.isChecked){
                quecomio="Pasto"
            }
            if(binding.maiz.isChecked){
                quecomio= "Maiz"
            }

            AlertDialog.Builder(this)
                .setTitle("Felicidades!!!")
                .setMessage("Eres un adulto responsable, tu mascota comio: "+quecomio)
                .setPositiveButton("Oki"){d,i->
                    d.dismiss()
                    Toast.makeText(this,"Puedes Regresar al menu principal", Toast.LENGTH_LONG).show()
                }
                .show()
        }
    }
}