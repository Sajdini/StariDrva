package com.gsixacademy.android.staridrva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.bottom_navigation_layout.*

class MainActivity : AppCompatActivity() {

    lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    navController=Navigation.findNavController(this,R.id.navigation_host_fragment)
        initListeners()
    }
    fun initListeners(){
        text_view_home.setOnClickListener {
            navController.navigate(R.id.action_global_homeFragment)
        }
        text_view_map.setOnClickListener {

        }
        text_view_list.setOnClickListener {

        }
        text_view_info.setOnClickListener {

        }
    }
}