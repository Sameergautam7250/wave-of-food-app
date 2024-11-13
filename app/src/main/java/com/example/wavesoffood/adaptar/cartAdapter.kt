package com.example.wavesoffood.adaptar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wavesoffood.databinding.CartItemBinding

class cartAdapter(private val cart_Items:MutableList<String>,
                  private val cart_Price:MutableList<String>,
                  private val cart_Image:MutableList<Int>) : RecyclerView.Adapter<cartAdapter.cartViewHolder>(){
                  private val itemsquantity=MutableList(cart_Items.size){1}



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cartViewHolder {
        val binding= CartItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return cartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: cartViewHolder, position: Int) {
        holder.bind(position)
    }
    override fun getItemCount(): Int =cart_Items.size


    inner class cartViewHolder(private val Binding: CartItemBinding)
        : RecyclerView.ViewHolder(Binding.root) {

            fun bind(position: Int) {
            if (position < cart_Items.size && position < cart_Price.size && position < cart_Image.size)
             Binding.apply{
             val quantity=itemsquantity.getOrNull(position) ?: 1
             cartItems.text=cart_Items [position]
             cartPrice.text=cart_Price[position]
             cartImage.setImageResource (cart_Image[position])
             cartitemQuantity.text=quantity.toString()

         }

        }

    }

    companion object {
    }
}


