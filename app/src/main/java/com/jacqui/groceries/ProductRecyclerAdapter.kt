package com.jacqui.groceries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.jacqui.groceries.models.ProductItem
import kotlinx.android.synthetic.main.layout_product_list_item.view.*

class ProductRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<ProductItem> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return ProductViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_product_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){
            is ProductViewHolder ->{
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(productList: List<ProductItem>){
        items = productList
    }

    class ProductViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        private val productImage: ImageView = itemView.productImage
        private val productName: TextView = itemView.tvProductName
        private val productPrice: TextView = itemView.tvPrice
        //private val productDescription: TextView = itemView.tvProductDescription
        private val productUnit: TextView = itemView.tvUnit
        private val productQuantity: TextView = itemView.tvQuantity

        fun bind(productItem: ProductItem){
            productName.text = productItem.title
            productPrice.text = productItem.price
            //productDescription.text = productItem.description
            productUnit.text = productItem.unit
            productQuantity.text = productItem.quantity.toString()

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(productItem.image)
                .into(productImage)
        }
    }
}