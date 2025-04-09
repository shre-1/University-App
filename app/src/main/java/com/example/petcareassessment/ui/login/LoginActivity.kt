package com.example.petcareassessment.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.petcareassessment.databinding.ActivityLoginBinding
import com.example.petcareassessment.ui.dashboard.DashboardActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupObservers()
        setupListeners()
    }

    private fun setupObservers() {
        viewModel.loginResult.observe(this) { result ->
            binding.loadingProgress.visibility = View.VISIBLE
            binding.loginButton.isEnabled = false
            when (result) {
                is Result.Success -> {
                    startActivity(Intent(this, DashboardActivity::class.java).apply {
                        putExtra("KEYPASS", result.data.keypass)
                    })
                    finish()
                }
                is Result.Failure -> {
                    Toast.makeText(this, "Error: ${result.exception.message}", Toast.LENGTH_LONG).show()
                }
            }
            binding.loadingProgress.visibility = View.GONE
            binding.loginButton.isEnabled = true
        }
    }
        }
    }

    private fun setupListeners() {
        binding.loginButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()
            viewModel.login(username, password)
        }
    }
}