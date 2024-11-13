package com.example.wavesoffood.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffood.R
import com.example.wavesoffood.adaptar.cartAdapter
import com.example.wavesoffood.databinding.FragmentCartBinding


class CartFragment : Fragment() {
    private lateinit var bindings: FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindings =FragmentCartBinding.inflate(inflater,container,false)

        val cartItems= mutableListOf("Herbal Pancake","Fruit Salad","Green Noddle")
        val cartPrices= mutableListOf("$ 14.99","$ 9.99","$ 7.99")
        val cartImages= mutableListOf(R.drawable.menu_photo,
            R.drawable.photo_menu_1,
            R.drawable.photo_menu_2)


        val adapter=cartAdapter(ArrayList(cartItems) ,ArrayList(cartPrices),ArrayList(cartImages))
        bindings.cartrecyclerView.layoutManager= LinearLayoutManager(requireContext())
        bindings.cartrecyclerView.adapter= adapter
        return bindings.root
    }


    companion object
}