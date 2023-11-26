package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listas.adapter.FilmAdapter
import com.example.listas.databinding.ActivityMainBinding

class MainActivity : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val decoration = DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //FilmProvider.filmList[2].title
        binding.recycler.layoutManager = LinearLayoutManager(this)
        //binding.recycler.layoutManager = GridLayoutManager(this, 2)
            var adapter = FilmAdapter(FilmProvider.filmList)
            binding.recycler.adapter = adapter
        //binding.recycler.addItemDecoration(decoration)

        //Hacemos que el edittex de buscador realize un filtro segun el titulo de la pelicula que introduzcamos
        binding.buscador.addTextChangedListener() {buscar ->
            val filtroPeli =FilmProvider.filmList.filter { Film ->
                Film.title.lowercase().contains(buscar.toString().lowercase()) }
            adapter.actualizarPelis(filtroPeli)

        }


    }
}