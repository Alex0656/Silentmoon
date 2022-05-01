package com.example.silentmoon.signing.sleep_music

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.silentmoon.R
import com.example.silentmoon.databinding.FragmentSleepBinding
import com.example.silentmoon.databinding.FragmentSleepMusicBinding
import com.example.silentmoon.signing.PlayOptionActivity
import com.example.silentmoon.signing.SleepMusicActivity
import com.example.silentmoon.signing.welcome_sleep.WelcomeSleepFragment


class SleepMusicFragment : Fragment() {
    private var _binding: FragmentSleepMusicBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSleepMusicBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgSleep001.setOnClickListener {
            val intent = Intent(context, PlayOptionActivity::class.java)
            startActivity(intent)
        }
        binding.imgSleep002.setOnClickListener {
            val intent = Intent(context, PlayOptionActivity::class.java)
            startActivity(intent)
        }
        binding.imgSleep003.setOnClickListener {
            val intent = Intent(context, PlayOptionActivity::class.java)
            startActivity(intent)
        }
        binding.imgSleep004.setOnClickListener {
            val intent = Intent(context, PlayOptionActivity::class.java)
            startActivity(intent)
        }
        binding.imgSleep005.setOnClickListener {
            val intent = Intent(context, PlayOptionActivity::class.java)
            startActivity(intent)
        }
        binding.imgSleep006.setOnClickListener {
            val intent = Intent(context, PlayOptionActivity::class.java)
            startActivity(intent)
        }
        binding.imgSleep007.setOnClickListener {
            val intent = Intent(context, PlayOptionActivity::class.java)
            startActivity(intent)
        }
        binding.imgSleep008.setOnClickListener {
            val intent = Intent(context, PlayOptionActivity::class.java)
            startActivity(intent)
        }

        binding.back.setOnClickListener {
            activity?.finish()
        }
    }

}