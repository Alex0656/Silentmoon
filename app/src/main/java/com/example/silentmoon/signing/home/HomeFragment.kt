package com.example.silentmoon.signing.home

import android.content.Intent
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.style.ImageSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.silentmoon.R
import com.example.silentmoon.databinding.FragmentHomeBinding
import com.example.silentmoon.signing.CourseDetailsActivity

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        silentMoonP()

        binding.imgGood1.setOnClickListener {
            val intent = Intent(context, CourseDetailsActivity::class.java)
            startActivity(intent)
        }

        binding.imgGood2.setOnClickListener {
            val intent = Intent(context, CourseDetailsActivity::class.java)
            startActivity(intent)
        }

        binding.imgGood3.setOnClickListener {
            val intent = Intent(context, CourseDetailsActivity::class.java)
            startActivity(intent)
        }

        binding.imgGoodScroll1.setOnClickListener {
            val intent = Intent(context, CourseDetailsActivity::class.java)
            startActivity(intent)
        }

        binding.imgGoodScroll2.setOnClickListener {
            val intent = Intent(context, CourseDetailsActivity::class.java)
            startActivity(intent)
        }

        binding.imgGoodScroll3.setOnClickListener {
            val intent = Intent(context, CourseDetailsActivity::class.java)
            startActivity(intent)
        }
    }

    private  fun silentMoonP(){
        val silentMoon: TextView = binding.silentMoon3
        val ssd: SpannableStringBuilder = SpannableStringBuilder()
        ssd.append("Silent  ")
        ssd.setSpan(context?.let { ImageSpan(it, R.drawable.ic_logo_1) }, ssd.length - 1 ,ssd.length,0)
        ssd.append(" Moon")
        silentMoon.text = ssd
    }
}