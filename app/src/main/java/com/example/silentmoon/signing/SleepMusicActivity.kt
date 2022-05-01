package com.example.silentmoon.signing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.commit
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityManagerSleepBinding
import com.example.silentmoon.databinding.ActivityManagerSleepMusicBinding
import com.example.silentmoon.signing.sleep.SleepFragment
import com.example.silentmoon.signing.sleep_music.SleepMusicFragment

class SleepMusicActivity : AppCompatActivity() {
    private lateinit var binding: ActivityManagerSleepMusicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManagerSleepMusicBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(savedInstanceState == null){
            var fragment = SleepMusicFragment()
            supportFragmentManager.commit {
                replace(binding.fragmentContainer.id, fragment, fragment.tag)
            }
            binding.bottomNavigation.menu.getItem(1).isChecked = true
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
                    val intent = Intent(this, ManagerHomeActivity::class.java)
                    startActivity(intent)
                }
                R.id.music -> {
                    val intent = Intent(this, SleepMusicV2Activity::class.java)
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