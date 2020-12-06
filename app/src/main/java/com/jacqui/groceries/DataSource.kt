package com.jacqui.groceries

import com.jacqui.groceries.models.ProductItem

class DataSource{

    companion object{

        fun createDataset():ArrayList<ProductItem>{
            val list = ArrayList<ProductItem>()
            list.add(
                ProductItem(
                    "Tomatoes",
                    "https://raw.githubusercontent.com/Jacquigee/4UBYUS/master/app/src/main/res/drawable/tomato.png",
                    "KSH 250",
                    "KG",
                    1.0,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam luctus sollicitudin risus eget accumsan. Pellentesque fringilla finibus tristique."
                )
            )
            list.add(
                ProductItem(
                    "Red Pepper",
                    "https://raw.githubusercontent.com/Jacquigee/4UBYUS/master/app/src/main/res/drawable/capsicum.png",
                    "KSH 300",
                    "KG",
                    1.0,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam luctus sollicitudin risus eget accumsan. Pellentesque fringilla finibus tristique."
                )
            )
            list.add(
                ProductItem(
                    "apple",
                    "https://raw.githubusercontent.com/Jacquigee/4UBYUS/master/app/src/main/res/drawable/apple.png",
                    "KSH 300",
                    "KG",
                    1.0,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam luctus sollicitudin risus eget accumsan. Pellentesque fringilla finibus tristique."

                )
            )
            list.add(
                ProductItem(
                    "Bananas",
                    "https://raw.githubusercontent.com/Jacquigee/4UBYUS/master/app/src/main/res/drawable/banana.png",
                    "KSH 300/kg",
                    "KG",
                    1.0,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam luctus sollicitudin risus eget accumsan. Pellentesque fringilla finibus tristique."

                )
            )
            list.add(
                ProductItem(
                    "Kiwi",
                    "https://raw.githubusercontent.com/Jacquigee/4UBYUS/master/app/src/main/res/drawable/kiwi.png",
                    "KSH 300",
                    "KG",
                    1.0,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam luctus sollicitudin risus eget accumsan. Pellentesque fringilla finibus tristique."

                )
            )
            list.add(
                ProductItem(
                    "Onions",
                    "https://raw.githubusercontent.com/Jacquigee/4UBYUS/master/app/src/main/res/drawable/onion.png",
                    "KSH 300",
                    "KG",
                    1.0,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam luctus sollicitudin risus eget accumsan. Pellentesque fringilla finibus tristique."

                )
            )
            list.add(
                ProductItem(
                    "Courgette",
                    "https://raw.githubusercontent.com/Jacquigee/4UBYUS/master/app/src/main/res/drawable/zuchini.png",
                    "KSH 300",
                    "KG",
                    1.0,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam luctus sollicitudin risus eget accumsan. Pellentesque fringilla finibus tristique."

                )
            )
            list.add(
                ProductItem(
                    "potato",
                    "https://raw.githubusercontent.com/Jacquigee/4UBYUS/master/app/src/main/res/drawable/potato.png",
                    "KSH 300",
                    "KG",
                    1.0,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam luctus sollicitudin risus eget accumsan. Pellentesque fringilla finibus tristique."

                )
            )


            return list
        }
    }
}