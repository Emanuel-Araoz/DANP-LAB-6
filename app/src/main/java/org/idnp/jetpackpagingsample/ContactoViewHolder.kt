package org.idnp.jetpackpagingsample

import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactoViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    val datosText = view.findViewById<TextView>(R.id.textViewCui) as TextView
    val direccionText = view.findViewById<TextView>(R.id.textViewFirstName) as TextView
    val telefonoText = view.findViewById<TextView>(R.id.textViewSecondName) as TextView
    val tipoText = view.findViewById<TextView>(R.id.textViewTipo) as TextView
    fun bind(contacto: Contacto) {
        with(contacto) {
            datosText.text = datos.toString()
            direccionText.text = direccion.toString()
            telefonoText.text = telefono.toString()
            tipoText.text = tipo.toString()
            Log.d("MainActivity", datos.toString())
        }
    }
}
