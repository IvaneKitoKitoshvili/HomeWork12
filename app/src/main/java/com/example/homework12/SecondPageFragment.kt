package com.example.homework12

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.homework12.databinding.FragmentFirstPageBinding
import com.example.homework12.databinding.FragmentSecondPageBinding

class SecondPageFragment : Fragment() {
    private var binding: FragmentSecondPageBinding? = null
    private val args: SecondPageFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondPageBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.let {
           it.ivPic.setImageResource(args.currentPic.image)
            it.tvName.text = args.currentPic.name
            it.tvDescription.text = args.currentPic.description
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}