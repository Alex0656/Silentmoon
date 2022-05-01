package com.example.silentmoon.signing.male_female

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.silentmoon.R
import com.example.silentmoon.databinding.FragmentMaleBinding
import com.example.silentmoon.databinding.FragmentSleepBinding


class MaleFragment : Fragment() {
    private var _binding: FragmentMaleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMaleBinding.inflate(inflater, container, false)
        return binding.root
    }

}