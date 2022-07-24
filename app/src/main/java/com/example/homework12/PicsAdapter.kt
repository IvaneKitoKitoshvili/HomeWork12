package com.example.homework12

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.homework12.databinding.FragmentSecondPageBinding
import com.example.homework12.databinding.PicViewBinding

class PicsAdapter(
    private val clickOpen: (PicModel) -> Unit

) : RecyclerView.Adapter<PicsAdapter.PicViewHolder>() {
    private var list: List<PicModel> = listOf()
    fun subList(newList: List<PicModel>) {
        this.list = newList
    }

    class PicViewHolder(private val binding: PicViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(modelPic: PicModel, clickOpen: (PicModel) -> Unit) {
            with(binding) {
                ivOne.setImageResource(modelPic.image)
                ivOne.setOnClickListener { clickOpen(modelPic) }
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PicViewHolder {
        val binding = PicViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PicViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PicViewHolder, position: Int) {
        val picture = list[position]
        holder.bind(picture, clickOpen)
    }

    override fun getItemCount() = list.size


}