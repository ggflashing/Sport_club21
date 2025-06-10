package com.example.sport_club21.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.sport_club21.R
import com.example.sport_club21.adapter.FoodAdapter
import com.example.sport_club21.base.BaseFragment
import com.example.sport_club21.databinding.FragmentNotificationsBinding
import com.example.sport_club21.models.Food

class NotificationsFragment : BaseFragment<FragmentNotificationsBinding>() {

    private lateinit var list_pitanie:ArrayList<Food>
    private lateinit var f_adapter:FoodAdapter


    override fun inflateViewBinding(): FragmentNotificationsBinding {
        return FragmentNotificationsBinding.inflate(layoutInflater)

    }

    override fun initViewModel() {


    }

    override fun observe() {

    }

    override fun init() {
        binding.btnBack.setOnClickListener {
            findNavController().navigate(R.id.navigation_club)

        }
     list_pitanie = arrayListOf(
        Food("Смузи фруктовое с овсянными хлопьями",230.5,   "МММММММММММ МММММММММММ МММММММММММ МММММММММММ",R.drawable.sport_food_01 ),
        Food("Каша белковая с аминокислотами",150.5,    "МММММММММММ МММММММММММ МММММММММММ МММММММММММ",R.drawable.sport_food_06 ),
        Food("Пюре овощное с зерновыми добавками",260.0,    "МММММММММММ МММММММММММ МММММММММММ",R.drawable.sport_food_08 ),
        Food("Смузи фруктовое с овсянными хлопьями",330.5,    "МММММММММММ МММММММММММ",R.drawable.sport_food_09 ),
        Food("Смузи овощное с зерновыми хлопьями",180.5,    "МММММММММММ МММММММММММ МММММММММММ",R.drawable.sport_food02 )
        )

        f_adapter = FoodAdapter(requireActivity(),list_pitanie)
        binding.rvSportPitanie.adapter= f_adapter

        setUpOnBackPressed()
    }
    private fun setUpOnBackPressed() {
        requireActivity().onBackPressedDispatcher
            .addCallback(object :OnBackPressedCallback(true){
                override fun handleOnBackPressed() {
                    if(isEnabled) {
                        requireActivity()
                            .finish()
                    }
                }
            })
    }



}