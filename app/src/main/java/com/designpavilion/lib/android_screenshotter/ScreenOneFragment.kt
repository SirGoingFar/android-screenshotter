package com.designpavilion.lib.android_screenshotter

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.firebase.remoteconfig.FirebaseRemoteConfig


class ScreenOneFragment : Fragment(R.layout.fragment_screen_one) {

    private val mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance().apply {
        setDefaultsAsync(R.xml.remote_config_defaults)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.nextButton).setOnClickListener {
            fetchAndSet(view)
        }
    }

    private fun fetchAndSet(view: View) {
        mFirebaseRemoteConfig.fetch(60).addOnCompleteListener(this.requireActivity() as Activity)
        { task ->
            if (task.isSuccessful) {
                Toast.makeText(
                    requireContext(), "Fetch Succeeded",
                    Toast.LENGTH_SHORT
                ).show()
                mFirebaseRemoteConfig.activate().addOnCompleteListener {
                    view.findViewById<Button>(R.id.nextButton).text =
                        mFirebaseRemoteConfig.getString("button_name")
                }
            } else {
                Toast.makeText(
                    requireContext(), "Fetch Failed",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}