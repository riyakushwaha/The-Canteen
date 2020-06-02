package com.example.thecanteen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.thecanteen.databinding.FragmentCustomizedMenuBinding
import com.example.thecanteen.databinding.FragmentEndBinding

class EndFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentEndBinding>(inflater, R.layout.fragment_end, container, false)
        binding.backbutton.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.action_endFragment_to_titleFragment2)
        }
        return binding.root
    }

}