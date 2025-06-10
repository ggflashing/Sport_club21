package com.example.sport_club21.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment <VB: ViewBinding>:Fragment() {
    protected lateinit var binding: VB

    override fun onCreateView(inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflateViewBinding()
        return binding.root
    }

    protected abstract fun inflateViewBinding(): VB

    protected abstract fun initViewModel()

    protected abstract fun observe()

    protected abstract fun init()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewModel()
        observe()
        init()



    }


}