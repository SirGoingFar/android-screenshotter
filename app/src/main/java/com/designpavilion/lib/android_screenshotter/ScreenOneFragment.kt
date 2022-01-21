package com.designpavilion.lib.android_screenshotter

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class ScreenOneFragment : Fragment(R.layout.fragment_screen_one) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.nextButton).setOnClickListener {
//            findNavController().navigate(ScreenOneFragmentDirections)
        }
    }
}