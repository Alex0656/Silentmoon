package com.example.silentmoon.signing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.commit
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityManagerHomeBinding
import com.example.silentmoon.databinding.ActivityManagerMeditateV2Binding
import com.example.silentmoon.signing.home.HomeFragment
import com.example.silentmoon.signing.meditate.MeditateFragment

class ManagerMeditateV2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityManagerMeditateV2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManagerMeditateV2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        if(savedInstanceState == null){
            var fragment = MeditateFragment()
            supportFragmentManager.commit {
                replace(binding.fragmentContainer.id, fragment, fragment.tag)
            }
            //navigationView.getMenu().getItem(0).setChecked(true);
            binding.bottomNavigation.menu.getItem(2).isChecked = true
        }


        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.sleep -> {
                    val intent = Intent(this, WelcomeSleepActivity::class.java)
                    startActivity(intent)
                }
                R.id.meditate -> {
                    //val intent = Intent(this, ManagerMeditateV2Activity::class.java)
                    //startActivity(intent)
                }
                R.id.home -> {
                    val intent = Intent(this, ManagerHomeActivity::class.java)
                    startActivity(intent)
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