package com.nazlican.navigationcomponent.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.nazlican.navigationcomponent.R
import com.nazlican.navigationcomponent.common.viewBinding
import com.nazlican.navigationcomponent.data.PersonalInfo
import com.nazlican.navigationcomponent.databinding.FragmentPersonalDetailsBinding

class PersonalDetailsFragment : Fragment(R.layout.fragment_personal_details) {

    private val binding by viewBinding(FragmentPersonalDetailsBinding::bind)
    private val args by navArgs<PersonalDetailsFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textViewNameAndSurname.text = args.nameAndSurname

        val nameAndSurname = args.nameAndSurname
        val email = binding.editTextEmail.text.toString()
        val password = binding.editTextPassword.text.toString()
        val phoneNumber = binding.editTextPhoneNumber.text.toString()
        val personalInfo = PersonalInfo(nameAndSurname, email, password, phoneNumber)

        val action = PersonalDetailsFragmentDirections.actionPersonalDetailsFragmentToCustomFragment(personalInfo)
        findNavController().navigate(action)


    }
}