package com.example.silentmoon.signing.sleep

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.silentmoon.databinding.FragmentSleepBinding
import com.example.silentmoon.signing.PlayOptionActivity
import com.example.silentmoon.signing.SleepMusicActivity


class SleepFragment : Fragment() {
    private var _binding: FragmentSleepBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSleepBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bigDraw.setOnClickListener {
            val intent = Intent(context, SleepMusicActivity::class.java)
            startActivity(intent)
        }

        binding.imgVerticalScroll2.setOnClickListener {
            val intent = Intent(context, PlayOptionActivity::class.java)
            startActivity(intent)
        }
        binding.imgVerticalScroll3.setOnClickListener {
            val intent = Intent(context, PlayOptionActivity::class.java)
            startActivity(intent)
        }
        binding.imgVerticalScroll4.setOnClickListener {
            val intent = Intent(context, PlayOptionActivity::class.java)
            startActivity(intent)
        }
        binding.imgVerticalScroll5.setOnClickListener {
            val intent = Intent(context, PlayOptionActivity::class.java)
            startActivity(intent)
        }
    }
}