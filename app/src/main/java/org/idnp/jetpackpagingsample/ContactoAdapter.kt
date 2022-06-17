package org.idnp.jetpackpagingsample
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil

class ContactoAdapter : PagingDataAdapter<Contacto, ContactoViewHolder>(DiffUtilCallBack()){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContactoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_user, parent, false)
        return ContactoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactoViewHolder, position: Int) {
//        getItem(position)?.let { holder.bind(it) }
//        val item = getItem(position)
//        holder.bind(item)

        val item = getItem(position)
        item?.let { contacto ->
            holder.bind(contacto)
        }

    }

}

class DiffUtilCallBack : DiffUtil.ItemCallback<Contacto>() {
    override fun areItemsTheSame(oldItem: Contacto, newItem: Contacto): Boolean {
        return oldItem.datos == newItem.datos
    }

    override fun areContentsTheSame(oldItem: Contacto, newItem: Contacto): Boolean {
        return oldItem == newItem
    }

}