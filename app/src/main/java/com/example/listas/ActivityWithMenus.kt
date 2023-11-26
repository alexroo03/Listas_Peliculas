package com.example.listas

import android.content.Intent
import android.os.Build.VERSION_CODES
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

open class ActivityWithMenus: AppCompatActivity() {
    companion object{
        var actividadActual = 0
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_principal, menu)

        //Desactivar la opcion de ka actividad em la que ya estamos:
        for(i in 0  until  menu.size()){
            if(i == actividadActual) menu.getItem(i).isEnabled = false
            else menu.getItem(i).isEnabled = true
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       return when (item.itemId){
        R.id.peliculas ->{
            actividadActual = 0;
            //Hacemos que se habra la pantalla del listado de peliculas
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            true
        }
           R.id.editar ->{
               actividadActual = 1;
               //Hacemos que se habra la pantalla de añadir peliculas
               val intent = Intent(this, AnadirPelicula::class.java)
               startActivity(intent)
               true
           }
           R.id.app ->{
               actividadActual = 2;
               //Hacemos que se habra la pantalla de app
               val intent = Intent(this, App::class.java)
               startActivity(intent)
               true
           }
           R.id.buscar ->{
               actividadActual = 3;
               true
           }
           R.id.salir ->{
               actividadActual = 4;
               //Hacemos que al seleccionar exit, nos muestre un mensaje de si quermos salir de la app o no
               var miDialogo = AlertDialog.Builder(this)
               AlertDialog.Builder(this)
                   .setTitle("Salir")
                   .setMessage("¿Desea Salir de la Aplicacion?")
                   .setCancelable(false)
                   .setPositiveButton(android.R.string.ok, { dialog, which ->
                       finish()
                   })
                   .setNegativeButton(android.R.string.cancel,  { dialog, which ->
                   })
                   .show()
               true
           }

           else -> super.onOptionsItemSelected(item)
       }

    }
}