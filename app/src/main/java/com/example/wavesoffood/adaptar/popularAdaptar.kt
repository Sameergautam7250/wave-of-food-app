package com.example.wavesoffood.adaptar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wavesoffood.R
import com.example.wavesoffood.databinding.ActivityMainBinding
import com.example.wavesoffood.databinding.PopulerItemBinding



//fun onCreate(savedInstanceState: Bundle?) {
//    val onCreate = super.onCreate(savedInstanceState)
//    setcontentview(R.layout.fragment_home)
//
//    val recyclerView = findViewById<RecyclerView>(R.id.PopularRecycler)
//    recyclerView.layoutManager = LinearLayoutManager(this)
//    recyclerView.adapter = MyAdapter(myDataList)
//}

class popularAdaptar(private val itmes: List<String>,
                     private val restroname:List<String>,
                     private val price:List<String>,
                     private val image:List<Int>)
    : RecyclerView.Adapter<popularAdaptar.popularViewHolder>()
{



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): popularViewHolder {
        return popularViewHolder(PopulerItemBinding.inflate(LayoutInflater.from(parent.context)
            ,parent,false))

    }
    override fun onBindViewHolder(holder: popularViewHolder, position: Int) {
        val image=image[position]
        val itmes=itmes[position]
        val price=price[position]
        val restronameView=restroname[position]
        holder.bind(itmes,price,image,restronameView)
    }
    override fun getItemCount(): Int {
       return itmes.size
    }
    class popularViewHolder (private val binding:PopulerItemBinding)
        : RecyclerView.ViewHolder(binding.root){

        private val imageView =binding.FoodimagePopular
        val restronameView = binding.RestronamePopular
        fun bind(itmes: String, price: String, image: Int, restroname:String) {
            binding.foodpopular.text= itmes
            binding.foodpricePopular.text= price.toString()

            restronameView.text= restroname.toString()
            imageView.setImageResource(image)


        }

    }
}