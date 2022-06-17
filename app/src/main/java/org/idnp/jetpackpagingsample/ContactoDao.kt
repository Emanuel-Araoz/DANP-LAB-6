package org.idnp.jetpackpagingsample
import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ContactoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(contactos: List<Contacto>)

    @Query("SELECT * FROM contactos")
    fun pagingSource(query: String): PagingSource<Int, Contacto>

    @Query("DELETE FROM contactos")
    suspend fun clearAll()
}