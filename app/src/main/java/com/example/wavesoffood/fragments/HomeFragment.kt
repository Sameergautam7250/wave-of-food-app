package com.example.wavesoffood.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.wavesoffood.R
import com.example.wavesoffood.adaptar.popularAdaptar
import com.example.wavesoffood.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var bindings: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindings=FragmentHomeBinding.inflate(inflater,container,false)
        return bindings.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageList = ArrayList<SlideModel>() // Create image list

        imageList.add(SlideModel(R.drawable.banner1, ))
        imageList.add(SlideModel(R.drawable.banner2, ))
        imageList.add(SlideModel(R.drawable.banner3, ))

        val imageSlider=bindings.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        imageSlider.setOnClickListener(object : ItemClickListener{
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
                TODO("Not yet implemented")
                val itemPosition = imageList[position]
                val itemMessage = "Selected Image $position"
                Toast.makeText(requireContext(),itemMessage, Toast.LENGTH_SHORT).show()
            }

        })
        val foodname= listOf("Herbal Pancake","Fruit Salad","Green Noddle","Herbal Pancake","Fruit Salad","Green Noddle")
        val price= listOf("$ 14.99","$ 9.99","$ 7.99","$ 14.99","$ 9.99","$ 7.99")
        val image= listOf(R.drawable.menu_photo,R.drawable.photo_menu_1,R.drawable.photo_menu_2,R.drawable.menu_photo,R.drawable.photo_menu_1,R.drawable.photo_menu_2)
        val restroname= listOf("Warung Herbal","Wijie Resto","Noodle Home","Warung Herbal","Wijie Resto","Noodle Home")
        val adapter= popularAdaptar(foodname,restroname,price,image)
        LinearLayoutManager(requireContext()).also { bindings.PopularRecycler.layoutManager = it }
        adapter.also { bindings.PopularRecycler.adapter = it }
    }

}

private fun ImageSlider.setOnClickListener(itemClickListener: ItemClickListener) {

}
