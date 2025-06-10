package com.example.sport_club21.ui.MyCabinetFragment

import android.content.Context
import android.content.SharedPreferences
import android.icu.text.DateFormat
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.sport_club21.R
import com.example.sport_club21.adapter.MyPlanAdapter
import com.example.sport_club21.databinding.FragmentMyCabinetBinding
import com.example.sport_club21.models.Item_compiex
import com.example.sport_club21.ui.home.HomeViewModel
import java.util.Date


class MyCabinetFragment : Fragment() {

    private var _binding:FragmentMyCabinetBinding? = null
    private val binding get() = _binding!!

    private lateinit var my_list_adapter: MyPlanAdapter

    private lateinit var my_list:ArrayList<Item_compiex>

    private lateinit var viewModel: HomeViewModel

    private lateinit var preferences: SharedPreferences

    private var remember_text:String? = null
    var currentDate: String = DateFormat.getDateInstance(DateFormat.FULL).format(Date())
    var currentTime: String = DateFormat.getDateInstance().format(Date())


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState:
        Bundle?
    ): View? {
        _binding = FragmentMyCabinetBinding.inflate(inflater,container,false)
        val root:View = binding.root

        preferences = requireActivity().getSharedPreferences("setting",Context.MODE_PRIVATE)

        initViewModel()
        observe()
        init()
        setUpOnBackPressed()
        return root
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity()).get(HomeViewModel::class.java)
    }

    private fun observe() {

    }

    fun init(){
        binding.timeStamp.text = currentTime
        binding.todayStamp.text = currentDate
    }

    private fun setUpOnBackPressed() {

    }


}