package com.example.petcareassessment.ui.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.petcareassessment.databinding.ActivityDashboardBinding
import com.example.petcareassessment.ui.details.DetailsActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    private val viewModel: DashboardViewModel by viewModels()
    private lateinit var adapter: EntityAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val keypass = intent.getStringExtra("KEYPASS") ?: return
        setupRecyclerView()
        setupObservers()
        viewModel.loadDashboard(keypass)
    }

    private fun setupRecyclerView() {
        adapter = EntityAdapter { entity ->
            startActivity(Intent(this, DetailsActivity::class.java).apply {
                putExtra("ENTITY", entity)
            })
        }
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@DashboardActivity)
            adapter = this@DashboardActivity.adapter
        }
    }

    private fun setupObservers() {
        viewModel.dashboardResult.observe(this) { result ->
            when (result) {
                is Result.Success -> adapter.submitList(result.data.entities)
                is Result.Failure -> {
                    Toast.makeText(this, result.exception.message, Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}