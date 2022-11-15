package com.example.mylistapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mylistapplication.databinding.CardLayoutBinding

/** If does not apply data binding, open the command line and hide some related lines with data binding **/

//class RecyclerAdapter() :
//    RecyclerView.Adapter<RecyclerAdapter.StoryInfoViewHolder>() {

class RecyclerAdapter(var storyInfo: ArrayList<StoryInfo>) :
    RecyclerView.Adapter<RecyclerAdapter.StoryInfoViewHolder>() {

//    // dummy data
//    private var titles = arrayOf("Chapter One", "Chapter Two", "Chapter Three", "Chapter Four", "Chapter Five", "Chapter Six", "Chapter Seven", "Chapter Eight")
//
//    private var details = arrayOf("Item one details", "Item two details", "Item three details", "Item four details", "Item five details", "Item six details", "Item seven details", "Item eight details")
//
//    private var images = intArrayOf(R.drawable.gus_mouse, R.drawable.gus_mouse, R.drawable.gus_mouse, R.drawable.gus_mouse, R.drawable.gus_mouse, R.drawable.gus_mouse, R.drawable.gus_mouse, R.drawable.gus_mouse, R.drawable.gus_mouse)

    class StoryInfoViewHolder(val binding: CardLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryInfoViewHolder {
//        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
//        return StoryInfoViewHolder(v)
        val listItemBinding =
            CardLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StoryInfoViewHolder(listItemBinding)

    }

    override fun onBindViewHolder(holder: StoryInfoViewHolder, position: Int) {
//        holder.itemTitle.text = titles[position]
//        holder.itemDetail.text = details[position]
//        holder.itemImage.setImageResource(images[position])
        with(holder as StoryInfoViewHolder) {
            val newList = storyInfo[position]
            binding.itemTitle.text = newList.title
            binding.itemDetail.text = newList.detail
            binding.itemImage.setImageResource(newList.image)

            binding.root.setOnClickListener {
                Toast.makeText(
                    itemView.context,
                    "You clicked on ${newList.title}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    override fun getItemCount(): Int {
//        return titles.size
        return storyInfo.size
    }

//    inner class StoryInfoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
//        var itemImage: ImageView
//        var itemTitle: TextView
//        var itemDetail: TextView
//
//        init {
//            itemImage = itemView.findViewById(R.id.item_image)
//            itemTitle = itemView.findViewById(R.id.item_title)
//            itemDetail = itemView.findViewById(R.id.item_detail)
//
//            itemView.setOnClickListener {
//                val position: Int = adapterPosition
//
//                Toast.makeText(itemView.context, "You clicked on ${titles[position]}", Toast.LENGTH_LONG).show()
//            }
//        }
//    }

}