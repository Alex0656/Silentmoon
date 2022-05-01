package com.example.silentmoon.signing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.style.ImageSpan
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.get
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityMainBinding
import com.example.silentmoon.databinding.ActivityManagerHomeBinding
import com.example.silentmoon.signing.home.HomeFragment
import com.example.silentmoon.signing.meditate.MeditateFragment
import com.example.silentmoon.signing.sleep.SleepFragment
import com.example.silentmoon.signing.sleep_music.SleepMusicFragment
import com.example.silentmoon.signing.welcome_sleep.WelcomeSleepFragment

class ManagerHomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityManagerHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManagerHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(savedInstanceState == null){
            var fragment = HomeFragment()
            supportFragmentManager.commit {
               replace(binding.fragmentContainer.id, fragment, fragment.tag)
            }
            binding.bottomNavigation.menu.getItem(0).isChecked = true
        }

        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.sleep -> {
                    val intent = Intent(this, WelcomeSleepActivity::class.java)
                    startActivity(intent)
                }
                R.id.meditate -> {
                    val intent = Intent(this, ManagerMeditateV2Activity::class.java)
                    startActivity(intent)
                }
                R.id.home -> {

                }
                R.id.music -> {
                    val intent = Intent(this, MusicV2Activity::class.java)
                    startActivity(intent)
                }
                R.id.name -> {
                    Toast.makeText(this, ":(", Toast.LENGTH_SHORT).show()
                }
                else -> {}
            }
            true
        }
    }
}