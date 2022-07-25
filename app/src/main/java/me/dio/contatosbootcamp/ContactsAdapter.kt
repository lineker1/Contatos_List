package me.dio.contatosbootcamp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(private val contactsList: ArrayList<Contact>) : RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_view, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(contactsList[position])
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(contact: Contact) {
            val textName = itemView.findViewById<TextView>(R.id.contact_name)
            val textFone = itemView.findViewById<TextView>(R.id.contact_phone_number)

            textName.text = contact.name
            textFone.text = contact.phoneNumber
        }
    }

}