package com.example.educlean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.principal_contenido.*

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)





        val toggle = ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close)
        toggle.isDrawerIndicatorEnabled=true
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        nav_menu.setNavigationItemSelectedListener(this)

        supportActionBar?.title=""

//        setToolbartitle("Home")
             changeFragment(Home())




    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawer(GravityCompat.START)
      when(item.itemId){
          R.id.nav_home ->{
//              setToolbartitle("Inicio")
              changeFragment(Home())
          }
          R.id.nav_Activities ->{
//              setToolbartitle("Actividades")
              changeFragment(Activities())
          }

          R.id.nav_Videos ->{
//              setToolbartitle("Videos")
              changeFragment(Videos())
          }
          R.id.nav_Readings ->{
//              setToolbartitle("Lecturas")
              changeFragment(Readings())
          }
      }
        return true
    }
//    fun setToolbartitle(title:String){
//        supportActionBar?.title = title
//    }

    fun changeFragment(frag: Fragment){
        val fragment= supportFragmentManager.beginTransaction()
        fragment.replace(R.id.fragment_container,frag).commit()
    }

}