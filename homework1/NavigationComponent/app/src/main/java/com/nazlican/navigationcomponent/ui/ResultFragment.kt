package com.nazlican.navigationcomponent.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.nazlican.navigationcomponent.R
import com.nazlican.navigationcomponent.common.viewBinding
import com.nazlican.navigationcomponent.databinding.FragmentResultBinding

class ResultFragment : Fragment(R.layout.fragment_result) {

    private val binding by viewBinding(FragmentResultBinding::bind)
    private val args by navArgs<ResultFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            textViewNameAndSurname3.text = args.info.personalInfo.nameAndSurname
            textViewEmail.text = args.info.personalInfo.email
            textViewPhoneNumber.text = args.info.personalInfo.phoneNumber
            textViewHometown.text = args.info.hometown
            textViewSchool.text = args.info.school
            textViewDepartment.text = args.info.department
        }


        binding.buttonDone.setOnClickListener {
            findNavController().navigate(R.id.action_resultFragment_to_entryFragment)

        }
    }
}