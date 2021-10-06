package ev.aykhan.genericrecycleradapter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ev.aykhan.generic_list_adapter.simple.GenericListAdapter;
import ev.aykhan.genericrecycleradapter.databinding.ListItemBinding;

public class JavaActivity extends AppCompatActivity {

    private GenericListAdapter<ListItemBinding, String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        adapter = new GenericListAdapter<>(
                ListItemBinding::inflate,
                (binding, data) -> {
                    binding.getRoot().setOnClickListener(v -> {

                    });
                    return null;
                }
        );

    }

}