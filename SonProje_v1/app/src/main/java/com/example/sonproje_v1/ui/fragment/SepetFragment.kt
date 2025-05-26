package com.example.sonproje_v1
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.sonproje_v1.R
import com.example.sonproje_v1.SepetYemeklerAdapter
import com.example.sonproje_v1.SepetViewModel
import com.example.sonproje_v1.databinding.FragmentSepetBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SepetFragment : Fragment() {

    private lateinit var binding : FragmentSepetBinding
    private lateinit var viewModel: SepetViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout via data binding
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sepet, container, false)
        binding.sepetFragment = this

        // Adapter
        viewModel.sepetYemeklerListesi.observe(viewLifecycleOwner){
            val adapter = SepetYemeklerAdapter(requireContext(),it,viewModel)
            binding.sepetYemeklerAdapter = adapter

            val totalPrice = viewModel.calculateTotalPrice()
            binding.textViewCartSum.text = "₺ $totalPrice"
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: SepetViewModel by viewModels()
        viewModel = tempViewModel
    }

}