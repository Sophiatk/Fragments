package com.example.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation

class HomeFragment : Fragment(R.layout.fragment_home){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ageedittext=view.findViewById<EditText>(R.id.age)
        val sendbutton=view.findViewById<Button>(R.id.sendbutton)

        val navController=Navigation.findNavController(view)

        sendbutton.setOnClickListener{

            val age =ageedittext.text.toString()

            if (age.isEmpty()){
                return@setOnClickListener
            }

            val age2=age.toInt()

            val action = HomeDirections.actionHomeToMoon(age2)

            navController.navigate(action)

        }

    }
}