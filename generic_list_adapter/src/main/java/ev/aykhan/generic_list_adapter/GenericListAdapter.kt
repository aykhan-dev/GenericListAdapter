package ev.aykhan.generic_list_adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.viewbinding.ViewBinding

class GenericListAdapter<Binding : ViewBinding, Model>(
    private val inflate: (LayoutInflater, ViewGroup?, Boolean) -> Binding,
    private val onBind: (Binding, Model) -> Unit,
) : ListAdapter<Model, GenericViewHolder<Binding, Model>>(GenericDiffCallback<Model>()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GenericViewHolder<Binding, Model> {
        return GenericViewHolder.build(parent, inflate, onBind)
    }

    override fun onBindViewHolder(holder: GenericViewHolder<Binding, Model>, position: Int) {
        holder.bind(getItem(position))
    }

}