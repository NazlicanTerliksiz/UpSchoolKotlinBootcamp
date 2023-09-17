package com.nazlican.navigationcomponent.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.nazlican.navigationcomponent.R
import com.nazlican.navigationcomponent.common.viewBinding
import com.nazlican.navigationcomponent.data.Info
import com.nazlican.navigationcomponent.databinding.FragmentCustomBinding

class CustomFragment : Fragment(R.layout.fragment_custom) {

    private val binding by viewBinding(FragmentCustomBinding::bind)
    private val args by navArgs<CustomFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textViewNameAndSurname2.text = args.personalInfo.nameAndSurname
        val personalInfo = args.personalInfo

        binding.buttonSave2.setOnClickListener {
            val hometown = binding.editTextHometown.text.toString()
            val school = binding.editTextSchool.text.toString()
            val department = binding.editTextDepartment.text.toString()
            val info = Info(personalInfo,hometown,school,department)

            val action = CustomFragmentDirections.actionCustomFragmentToResultFragment(info)
            Navigation.findNavController(it).navigate(action)
        }
    }
}