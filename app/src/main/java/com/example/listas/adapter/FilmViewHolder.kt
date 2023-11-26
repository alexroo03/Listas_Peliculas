package com.example.listas.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listas.Film
import com.example.listas.databinding.ItemFilmBinding

class FilmViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemFilmBinding.bind(view)
    fun render(filmModel: Film){
        binding.filmName.text = filmModel.title
        binding.FilmDirector.text = filmModel.director
        binding.FilmYear.text = filmModel.year.toString()

        Glide.with(binding.filmPhoto.context).load(filmModel.photo)
            .into(binding.filmPhoto)
        //Evento de hacer clic sobre la iagen de la pelicula
        binding.filmPhoto.setOnClickListener{
            Toast.makeText(binding.filmPhoto.context, filmModel.title,
                Toast.LENGTH_LONG).show()
        }

        //evento de hacer clic sobre toda la pelicula:
        itemView.setOnClickListener{
            Toast.makeText(binding.filmPhoto.context, filmModel.director  ,
            Toast.LENGTH_LONG).show()}
    }
}