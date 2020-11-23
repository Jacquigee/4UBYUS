package com.jacqui.groceries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
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
                holder.bind(items.get(position))
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
        val product_image = itemView.productImage
        val product_name = itemView.tvProductName
        val product_price = itemView.tvPrice

        fun bind(productItem: ProductItem){
            product_name.setText(productItem.title)
            product_price.setText(productItem.Price)

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(productItem.image)
                .into(product_image)
        }
    }
}