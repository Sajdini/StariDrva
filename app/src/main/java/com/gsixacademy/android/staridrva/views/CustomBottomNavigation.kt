package com.gsixacademy.android.staridrva.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.gsixacademy.android.staridrva.R
import java.util.jar.Attributes
import java.util.zip.Inflater

class CustomBottomNavigation:FrameLayout {

    lateinit var mInflater: LayoutInflater

    constructor(context:Context):super(context){
        init(context)
    }
    constructor(context: Context,attr:AttributeSet?):super(context,attr){
        init(context)
    }
    constructor(context: Context,attr:AttributeSet?,style:Int):super(context,attr,style){
        init(context)
    }


    fun init(context: Context){
        mInflater= LayoutInflater.from(context)
        mInflater.inflate(R.layout.bottom_navigation_layout,this,true)

    }
}