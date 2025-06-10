package com.example.sport_club21.ui.home

import android.content.Context
import android.content.SharedPreferences
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
import com.example.sport_club21.adapter.AnnounceAdapter
import com.example.sport_club21.adapter.TrenerAdapter
import com.example.sport_club21.base.BaseFragment
import com.example.sport_club21.databinding.FragmentClubBinding

import com.example.sport_club21.models.Announce
import com.example.sport_club21.models.Trener
import com.example.sport_club21.visibility

class HomeFragment : BaseFragment<FragmentClubBinding>() {

    private lateinit var viewModel:HomeViewModel
    private lateinit var bundle: Bundle

    private lateinit var an_adapter:AnnounceAdapter
    private lateinit var list_announce:ArrayList<Announce>

    private lateinit var tr_adapter:TrenerAdapter
    private lateinit var list_treners:ArrayList<Trener>

    private lateinit var preferences: SharedPreferences
    private  var is_abonement_directed:Boolean = false






    override fun inflateViewBinding(): FragmentClubBinding {
        return FragmentClubBinding.inflate(layoutInflater)
    }

    override fun initViewModel()  {
        viewModel = ViewModelProvider(requireActivity()).get(HomeViewModel::class.java)
    }

    override fun observe(){
        preferences = requireActivity().getSharedPreferences("setting",Context.MODE_PRIVATE)
        is_abonement_directed = preferences.getBoolean("abonement_is_directed",true)


        if (is_abonement_directed==false){
            hide()
        }

        binding.pool1.setOnClickListener {
            viewModel.onAbonementClick("Бассейн. Время: 8:00 до 11:30 группа дети 8-14лет")
            hide()
            direct()
        }
        binding.zal1.setOnClickListener {
            viewModel.onAbonementClick("Бассейн. Время: 8:00 до 11:30 группа дети 8-14лет")
            hide()
            direct()
        }

        binding.pool2.setOnClickListener {
            viewModel.onAbonementClick("Бассейн. Время: 8:00 до 11:30 группа дети 8-14лет")
            hide()
            direct()
        }
        binding.zal2.setOnClickListener {
            viewModel.onAbonementClick("Бассейн. Время: 8:00 до 11:30 группа дети 8-14лет")
            hide()
            direct()
        }

        binding.pool3.setOnClickListener {
            viewModel.onAbonementClick("Бассейн. Время: 8:00 до 11:30 группа дети 8-14лет")
            hide()
            direct()
        }
        binding.zal3.setOnClickListener {
            viewModel.onAbonementClick("Бассейн. Время: 8:00 до 11:30 группа дети 8-14лет")
            hide()
            direct()
        }

        binding.pool4.setOnClickListener {
            viewModel.onAbonementClick("Бассейн. Время: 8:00 до 11:30 группа дети 8-14лет")
            hide()
            direct()
        }
        binding.zal4.setOnClickListener {
            viewModel.onAbonementClick("Бассейн. Время: 8:00 до 11:30 группа дети 8-14лет")
            hide()
            direct()
        }

        binding.pool5.setOnClickListener {
            viewModel.onAbonementClick("Бассейн. Время: 8:00 до 11:30 группа дети 8-14лет")
            hide()
            direct()
        }
        binding.zal5.setOnClickListener {
            viewModel.onAbonementClick("Бассейн. Время: 8:00 до 11:30 группа дети 8-14лет")
            hide()
            direct()
        }

        bundle = Bundle()
        bundle.putString("KEY_ABONEMENT",viewModel.abonement.value)




    }

    override fun init(){
        list_announce = arrayListOf(   Announce(
            "Соревнования \n по плаванию", "28.10.2024", "9.30",        R.drawable.sport_winner_medal  ),
            Announce(        "Соревнования \n по армреслингу", "15.11.2024", "16.00",
                R.drawable.sport_armresling    ),    Announce(
                "Соревнования \n по плаванию свыше 18 лет", "28.10.2024", "9.30",        R.drawable.sport_winner_medal   ),
        )

        an_adapter = AnnounceAdapter(requireActivity(),list_announce)
        binding.rvAnnounce.adapter=an_adapter


        list_treners= arrayListOf(
        Trener("Заруба Иван","координатор тренажерного зала, мастер-тренер",R.drawable.trener_zaruba),
        Trener("Краснов Алексей","мастер-тренер тренажерного зала",R.drawable.trener_krasnov),
        Trener("Хохорина Анастасия","мастер-тренер тренажерного зала",R.drawable.trener_hohorina),
        Trener("Ливанова Анна","мастер-тренер тренажерного зала",R.drawable.trener_livanova),
        Trener("Заруба Иван","координатор тренажерного зала, мастер-тренер",R.drawable.trener_zaruba)
        )
        tr_adapter = TrenerAdapter(requireActivity(),list_treners)
        binding.rvTreners.adapter = tr_adapter



        clicl()
        direct()

        setUpOnBackPressed()
    }

    private fun clicl(){
        binding.btnFood.setOnClickListener {
            findNavController().navigate(R.id.navigation_notifications)
        }
        binding.btnRegister.setOnClickListener{
            findNavController().navigate(R.id.registerFragment)
        }
    }



    fun hide(){
        binding.apply {
            textChoose.visibility(true)
            l1.visibility(false)
            l2.visibility(false)
            l3.visibility(false)
            l4.visibility(false)
            l5.visibility(false)
            view40.visibility(false)

            rvTreners.visibility(true)
            textTreners.visibility(true)
        }
    }

    fun direct(){
        is_abonement_directed = true
        preferences.edit().putBoolean("abonement_is_directed", true).apply()
    }




    private fun setUpOnBackPressed() {
        requireActivity().onBackPressedDispatcher
            .addCallback(object : OnBackPressedCallback(true){
                override fun handleOnBackPressed() {
                    if(isEnabled) {
                        requireActivity()
                            .finish()
                    }
                }
            })
    }


}