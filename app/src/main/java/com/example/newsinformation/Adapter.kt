package com.example.newsinformation


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var authors:List<Author>): RecyclerView.Adapter<AuthorsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.authors_information, parent,false)
        return AuthorsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: AuthorsViewHolder, position: Int) {
        val author = authors[position]
        holder.textimage.text= author.link
        holder.texttitle.text= author.title
        holder.textDate.text = author.date
        holder.seemore.text=author.seeMore
        holder.authorsname.text = author.name


    }

    override fun getItemCount(): Int {
        return authors.size


    }
}
class AuthorsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var textimage =itemView.findViewById<TextView>(R.id.ivavatar)
    var texttitle = itemView.findViewById<TextView>(R.id.tvtitle)
    var textDate = itemView.findViewById<TextView>(R.id.tvdate)
    var authorsname = itemView.findViewById<TextView>(R.id.tvname)
    var preview = itemView.findViewById<TextView>(R.id.tvpreview)
    var seemore = itemView.findViewById<TextView>(R.id.tvseemore)







}
