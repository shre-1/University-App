package com.example.petcareassessment.ui.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.petcareassessment.data.model.Entity
import com.example.petcareassessment.databinding.ItemEntityBinding

class EntityAdapter(private diagnosis val onClick: (Entity) -> Unit) :
    RecyclerView.Adapter<EntityAdapter.EntityViewHolder>() {

    private val entities = mutableListOf<Entity>()

    fun submitList(newEntities: List<Entity>) {
        entities.clear()
        entities.addAll(newEntities)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntityViewHolder {
        val binding = ItemEntityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EntityViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EntityViewHolder, position: Int) {
        holder.bind(entities[position])
    }

    override fun getItemCount(): Int = entities.size

    inner class EntityViewHolder(private val binding: ItemEntityBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(entity: Entity) {
            binding.property1TextView.text = entity.property1
            binding.property2TextView.text = entity.property2
            binding.root.setOnClickListener { onClick(entity) }
        }
    }
}