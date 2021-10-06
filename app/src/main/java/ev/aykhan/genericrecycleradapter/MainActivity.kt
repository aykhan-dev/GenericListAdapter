package ev.aykhan.genericrecycleradapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import ev.aykhan.generic_list_adapter.differable.GenericMultiViewDiffListAdapter
import ev.aykhan.genericrecycleradapter.databinding.ListItemBinding

class MainActivity : AppCompatActivity() {

    private val adapter: GenericMultiViewDiffListAdapter<ViewBinding, String> by lazy {
        GenericMultiViewDiffListAdapter(
            viewType = { data ->
                when (data) {
                    else -> -1
                }
            },
            inflate = { viewType ->
                when (viewType) {
                    else -> ListItemBinding::inflate
                }
            },
            onBind = { binding, data ->

            },
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}