package com.example.sonproje_v1
import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.Navigation

fun Navigation.switchPage(it: View, id:Int) {
    Navigation.findNavController(it).navigate(id)
}

fun Navigation.switchPage(it:View,id: NavDirections){
    Navigation.findNavController(it).navigate(id)
}