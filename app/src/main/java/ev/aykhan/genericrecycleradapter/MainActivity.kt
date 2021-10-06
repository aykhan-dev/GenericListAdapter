package ev.aykhan.genericrecycleradapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ev.aykhan.generic_list_adapter.simple.GenericListAdapter
import ev.aykhan.genericrecycleradapter.databinding.ListItemBinding

class MainActivity : AppCompatActivity() {

    private val adapter: GenericListAdapter<ListItemBinding, String> by lazy {
        GenericListAdapter(
            inflate = ListItemBinding::inflate,
            onBind = { binding, data ->

            }
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}