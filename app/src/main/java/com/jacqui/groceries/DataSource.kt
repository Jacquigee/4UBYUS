package com.jacqui.groceries

import com.jacqui.groceries.models.ProductItem

class DataSource{

    companion object{

        fun createDataset():ArrayList<ProductItem>{
            val list = ArrayList<ProductItem>()
            list.add(
                ProductItem(
                    "Tomatoes",
                    "https://www.vegetables.co.nz/assets/_resampled/FillWyI0MDAiLCIzMDAiXQ/560~Tomato-Whole-Quarters-57727.jpg",
                    "KSH 250/kg"
                )
            )
            list.add(
                ProductItem(
                    "Potatoes",
                    "https://www.vegetables.co.nz/assets/_resampled/FillWyI0MDAiLCIzMDAiXQ/406~Potatoes-Selection-87787.jpg",
                    "KSH 300/kg"
                )
            )
            list.add(
                ProductItem(
                    "Broccoli",
                    "https://www.vegetables.co.nz/assets/_resampled/FillWyI0MDAiLCIzMDAiXQ/60~Broccoflower-57560.jpg",
                    "KSH 300/kg"
                )
            )
            list.add(
                ProductItem(
                    "Carrots",
                    "https://www.vegetables.co.nz/assets/_resampled/FillWyI0MDAiLCIzMDAiXQ/691~Vegetables-Users-Guide-Images-58551.jpg",
                    "KSH 300/kg"
                )
            )
            list.add(
                ProductItem(
                    "Egg Plants",
                    "https://www.vegetables.co.nz/assets/_resampled/FillWyI0MDAiLCIzMDAiXQ/220~Egg-Plants-Varieties-57634.jpg",
                    "KSH 300/kg"
                )
            )
            list.add(
                ProductItem(
                    "Onions",
                    "https://www.vegetables.co.nz/assets/_resampled/FillWyI0MDAiLCIzMDAiXQ/353~Onion-Mixed-57125.jpg",
                    "KSH 300/kg"
                )
            )
            list.add(
                ProductItem(
                    "Cauliflower",
                    "https://www.vegetables.co.nz/assets/_resampled/FillWyI0MDAiLCIzMDAiXQ/158~Cauliflower-Head-57557.jpg",
                    "KSH 300/kg"
                )
            )
            list.add(
                ProductItem(
                    "Courgette",
                    "https://www.vegetables.co.nz/assets/_resampled/FillWyI0MDAiLCIzMDAiXQ/187~Courgette-3-57623.jpg",
                    "KSH 300/kg"
                )
            )
            list.add(
                ProductItem(
                    "Cucumbers",
                    "https://www.vegetables.co.nz/assets/_resampled/FillWyI0MDAiLCIzMDAiXQ/208~Cucumbers-Varieties-57628.jpg",
                    "KSH 300/kg"
                )
            )
            list.add(
                ProductItem(
                    "Green Cabbage",
                    "https://www.vegetables.co.nz/assets/_resampled/FillWyI0MDAiLCIzMDAiXQ/105~Cabbage-93174.jpg",
                    "KSH 300/kg"
                )
            )
            list.add(
                ProductItem(
                    "Red Cabbage",
                    "https://www.vegetables.co.nz/assets/_resampled/FillWyI0MDAiLCIzMDAiXQ/736~Vegetables-Users-Guide-Images-58514.jpg",
                    "KSH 300/kg"
                )
            )
            list.add(
                ProductItem(
                    "Spinach",
                    "https://www.vegetables.co.nz/assets/_resampled/FillWyI0MDAiLCIzMDAiXQ/466~Spinach-57692.jpg",
                    "KSH 300/kg"
                )
            )

            return list
        }
    }
}