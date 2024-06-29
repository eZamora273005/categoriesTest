package com.ezamora.ejercicio.presentation.ui.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ezamora.ejercicio.R
import com.ezamora.ejercicio.databinding.ItemCategoriesBinding
import com.ezamora.ejercicio.utils.inflate

class CategoriesAdapter : RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder>() {

    lateinit var categoriesList : List<String>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = parent.inflate(R.layout.item_categories,  false)
        return CategoriesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val item = categoriesList[position]
        holder.bind(item)
    }

    inner class CategoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemCategoriesBinding.bind(itemView)
        fun bind(categorie : String) = with(binding){
            txtCategories.text = categorie
        }
    }
}