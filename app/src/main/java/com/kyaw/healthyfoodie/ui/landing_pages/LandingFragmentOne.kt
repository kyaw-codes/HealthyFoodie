package com.kyaw.healthyfoodie.ui.landing_pages


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.kyaw.healthyfoodie.R

/**
 * A simple [Fragment] subclass.
 */
class LandingFragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_landing_fragment_one, container, false)
    }


}
