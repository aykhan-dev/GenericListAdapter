package ev.aykhan.generic_list_adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

class GenericViewHolder<Binding : ViewBinding, Model> private constructor(
    private val binding: Binding,
    private val onBind: (Binding, Model) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(data: Model) {
        onBind(binding, data)
    }

    companion object {

        fun <Binding : ViewBinding, Model> build(
            parent: ViewGroup,
            inflate: (LayoutInflater, ViewGroup?, Boolean) -> Binding,
            onBind: (Binding, Model) -> Unit
        ): GenericViewHolder<Binding, Model> {
            val view = inflate(LayoutInflater.from(parent.context), parent, false)
            return GenericViewHolder(view, onBind)
        }

    }

}