package com.example.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation


class Moon : Fragment(R.layout.fragment_moon) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.agetextView).text
        MoonArgs.fromBundle(requireArguments()).age.toString()

        val nextpage=view.findViewById<Button>(R.id.sendbutton)

        val navController= Navigation.findNavController(view)

        nextpage.setOnClickListener{

            val action=MoonDirections.actionMoonToSun()

            navController.navigate(action)
        }
    }
}

