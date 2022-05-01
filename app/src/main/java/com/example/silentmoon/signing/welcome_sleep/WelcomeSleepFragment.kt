package com.example.silentmoon.signing.welcome_sleep

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import com.example.silentmoon.R
import com.example.silentmoon.databinding.FragmentWelcomeSleepBinding
import com.example.silentmoon.signing.SleepMusicActivity
import com.example.silentmoon.signing.sleep.SleepFragment

class WelcomeSleepFragment : Fragment() {
    private var _binding: FragmentWelcomeSleepBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeSleepBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // binding.getStarted2.setOnClickListener {
        //    childFragmentManager.beginTransaction().replace(R.id.action_container,SleepFragment.getInstance()).commit()
      //  }


       //childFragmentManager.beginTransaction().replace(R.id.action_container,SleepFragment.getInstance()).commit()
    }


}