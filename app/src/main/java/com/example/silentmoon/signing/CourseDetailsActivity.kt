package com.example.silentmoon.signing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.commit
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityCourseDetailsBinding
import com.example.silentmoon.databinding.ActivityManagerSleepBinding
import com.example.silentmoon.signing.male_female.FemaleFragment
import com.example.silentmoon.signing.male_female.MaleFragment
import com.example.silentmoon.signing.sleep.SleepFragment

class CourseDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCourseDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCourseDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(savedInstanceState == null){
            var fragment = MaleFragment()
            supportFragmentManager.commit {
                replace(binding.fragmentContainer2.id, fragment, fragment.tag)
            }
            binding.maleFemaleMenu.menu.getItem(0).isChecked = true
        }


        binding.maleFemaleMenu.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.male -> {
                    var fragment = MaleFragment()
                    supportFragmentManager.commit {
                        replace(binding.fragmentContainer2.id, fragment, fragment.tag)
                    }
                }
                R.id.female -> {
                    var fragment = FemaleFragment()
                    supportFragmentManager.commit {
                        replace(binding.fragmentContainer2.id, fragment, fragment.tag)
                    }
                }
                else -> {}
            }
            true
        }

    }


    fun onClickGoMusicActivity(view: View){
        val intent = Intent(this, MusicV2Activity::class.java)
        startActivity(intent)
    }


}