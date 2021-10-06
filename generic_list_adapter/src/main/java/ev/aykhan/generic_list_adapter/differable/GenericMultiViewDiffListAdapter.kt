package ev.aykhan.generic_list_adapter.differable

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.viewbinding.ViewBinding
import ev.aykhan.generic_list_adapter.GenericViewHolder

class GenericMultiViewDiffListAdapter<Binding : ViewBinding, Model>(
    private val viewType: (Model) -> Int,
    private val inflate: (viewType: Int) -> ((LayoutInflater, ViewGroup?, Boolean) -> Binding),
    private val onBind: (Binding, Model) -> Unit,
    differ: DiffUtil.ItemCallback<Model> = GenericDiffCallback(),
) : ListAdapter<Model, GenericViewHolder<Binding, Model>>(differ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GenericViewHolder<Binding, Model> {
        return GenericViewHolder.build(parent, inflate(viewType), onBind)
    }

    override fun onBindViewHolder(holder: GenericViewHolder<Binding, Model>, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return viewType(getItem(position))
    }

}