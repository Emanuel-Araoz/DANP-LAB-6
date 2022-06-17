package org.idnp.jetpackpagingsample
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contactos")
data class Contacto (
    @PrimaryKey
    val datos: String,
    val direccion:String,
    val telefono:String,
    val tipo:String
)
