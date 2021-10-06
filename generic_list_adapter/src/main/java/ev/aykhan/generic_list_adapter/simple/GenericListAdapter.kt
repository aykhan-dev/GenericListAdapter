package ev.aykhan.generic_list_adapter.simple

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import ev.aykhan.generic_list_adapter.GenericViewHolder

class GenericListAdapter<Binding : ViewBinding, Model>(
    private val inflate: (LayoutInflater, ViewGroup?, Boolean) -> Binding,
    private val onBind: (Binding, Model) -> Unit,
) : RecyclerView.Adapter<GenericViewHolder<Binding, Model>>() {

    private val data: MutableList<Model> = mutableListOf()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GenericViewHolder<Binding, Model> {
        return GenericViewHolder.build(parent, inflate, onBind)
    }

    override fun onBindViewHolder(holder: GenericViewHolder<Binding, Model>, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    fun submitList(data: List<Model>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

}