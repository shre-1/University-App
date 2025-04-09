package com.example.petcareassessment.ui.details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.petcareassessment.data.model.Entity
import com.example.petcareassessment.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val entity = intent.getSerializableExtra("ENTITY") as? Entity ?: return
        binding.property1TextView.text = entity.property1
        binding.property2TextView.text = entity.property2
        binding.descriptionTextView.text = entity.description
    }
}