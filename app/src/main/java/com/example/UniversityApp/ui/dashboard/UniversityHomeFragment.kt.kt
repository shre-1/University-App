package com.example.UniversityApp.ui.universityhome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.UniversityApp.databinding.FragmentUniversityHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UniversityHomeFragment : Fragment() {

    private var _binding: FragmentUniversityHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUniversityHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textUniversity.text = "Welcome to University App"
        binding.searchCourses.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                query?.let { binding.textUniversity.text = "Searching for course: $it" }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText.isNullOrEmpty()) {
                    binding.textUniversity
                        .text = "Welcome to University App"
                }
                return true
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

private fun FragmentUniversityHomeBinding.Companion.inflate(
    inflater: LayoutInflater,
    group: ViewGroup?,
    bool: Boolean
): FragmentUniversityHomeBinding? {
    TODO("Not yet implemented")
}

annotation class FragmentUniversityHomeBinding {
    companion object
}
