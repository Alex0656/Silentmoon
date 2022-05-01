package com.example.silentmoon.signing.meditate

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.silentmoon.R
import com.example.silentmoon.databinding.FragmentHomeBinding
import com.example.silentmoon.databinding.FragmentMeditateBinding
import com.example.silentmoon.signing.CourseDetailsActivity
import com.example.silentmoon.signing.PlayOptionActivity
import com.example.silentmoon.signing.SleepMusicActivity

class MeditateFragment : Fragment() {
    private var _binding: FragmentMeditateBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMeditateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bigDraw.setOnClickListener {
            val intent = Intent(context, CourseDetailsActivity::class.java)
            startActivity(intent)
        }
    }

}