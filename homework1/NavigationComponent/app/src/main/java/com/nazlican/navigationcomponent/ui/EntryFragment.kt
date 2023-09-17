package com.nazlican.navigationcomponent.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.nazlican.navigationcomponent.R
import com.nazlican.navigationcomponent.common.viewBinding
import com.nazlican.navigationcomponent.databinding.FragmentEntryBinding
import kotlinx.coroutines.handleCoroutineException

class EntryFragment : Fragment(R.layout.fragment_entry) {

    private val binding by viewBinding(FragmentEntryBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonEnter.setOnClickListener {
            try {
                val nameAndSurname = binding.editTextNameAndSurname.text.toString().trim()

                if (nameAndSurname.isNotEmpty()) {
                    val action = EntryFragmentDirections.actionEntryFragmentToPersonalDetailsFragment(nameAndSurname)
                    findNavController().navigate(action)
                } else {
                    Toast.makeText(context, "Lütfen boş alanları doldurunuz", Toast.LENGTH_LONG).show()
                }
            } catch (e: Exception) {
                Toast.makeText(requireContext(), e.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        }
    }
}