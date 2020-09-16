package com.livehappyapps.githubviewer.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.livehappyapps.githubviewer.databinding.ActivitySettingsBinding
import com.livehappyapps.githubviewer.fragment.SettingsFragment

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            val fragment = SettingsFragment.newInstance()
            supportFragmentManager.beginTransaction()
                .replace(binding.container.id, fragment)
                .commit()
        }
    }

    companion object {

        fun newInstance(context: Context) =
            Intent(context, SettingsActivity::class.java)
    }
}