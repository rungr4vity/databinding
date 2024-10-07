package il.pacolo.com.android14.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import il.pacolo.com.android14.R
import il.pacolo.com.android14.databinding.RowItemBinding
import il.pacolo.com.android14.model.Person

class PersonAdapter(private val itemList: List<Person>) :
    RecyclerView.Adapter<PersonAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: RowItemBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val binding = RowItemBinding.inflate(inflater, parent, false)
        return ItemViewHolder(binding)

    }

    // Bind data to the views in the ViewHolder
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.binding.human = currentItem
        holder.binding.executePendingBindings() // Updates the binding immediately
    }

    // Return the size of the data list
    override fun getItemCount(): Int {
        return itemList.size
    }
}
