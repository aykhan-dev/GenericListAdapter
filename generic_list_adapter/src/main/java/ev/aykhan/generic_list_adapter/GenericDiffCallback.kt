package ev.aykhan.generic_list_adapter

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil

class GenericDiffCallback<Model> : DiffUtil.ItemCallback<Model>() {

    override fun areItemsTheSame(oldItem: Model, newItem: Model): Boolean {
        return oldItem === newItem
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: Model, newItem: Model): Boolean {
        return oldItem == newItem
    }

}