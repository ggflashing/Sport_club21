package com.example.sport_club21.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.sport_club21.R
import com.example.sport_club21.adapter.Total_ListAdapter
import com.example.sport_club21.base.BaseFragment
import com.example.sport_club21.databinding.FragmentDashboardBinding
import com.example.sport_club21.databinding.FragmentTotalListBinding
import com.example.sport_club21.models.Item_compiex
import com.example.sport_club21.ui.home.HomeViewModel

class Total_list_fragment : BaseFragment<FragmentTotalListBinding>() {

    private lateinit var total_list_adapter: Total_ListAdapter

    private lateinit var total_list:ArrayList<Item_compiex>
    private lateinit var favor_list:ArrayList<Item_compiex>
    private lateinit var  viewModel: HomeViewModel

    override fun inflateViewBinding(): FragmentTotalListBinding {
        return FragmentTotalListBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity()).get(HomeViewModel::class.java)
    }

    override fun observe() {
        TODO("Not yet implemented")
    }

    override fun init() {
        total_list= arrayListOf(
            (Item_compiex(    "Сильная спина",
                "МММММММММММММММММММММММММММММММММММ",    R.drawable.duain_jonson_01, R.drawable.scharznegger_01)),
            Item_compiex(
                "LLLLLLL",    "Комплекс верхние плечевые мышцы включает в себя: 1. Расстягивающие 2. Силовые 3. Структурные",
                R.drawable.duain_jonson_01, R.drawable.scharznegger_01),
            (Item_compiex(    "MMMMM",
                "ВВВВВВВВВВВВВВВВВВВВВВВВВВВВ 1. Расстягивающие 2. Силовые 3. Структурные",    R.drawable.duain_jonson_01, R.drawable.scharznegger_01
            ))
        )

        total_list_adapter = Total_ListAdapter(requireActivity(), total_list)

        binding.rvTotalComplex.adapter = total_list_adapter

        favor_list = arrayListOf(
            Item_compiex(    "Разминка",
                "Общий легкий комплекс упражнений,\n" +
                        " направленных, в основном, на вытягивание всех групп мышц,\n" +
                        "          для маскимального эффекта предстоящей тренировки",
                R.drawable.duain_jonson_01, R.drawable.scharznegger_01
            )
        )

        total_list_adapter.setOnClickListener()





    }


}