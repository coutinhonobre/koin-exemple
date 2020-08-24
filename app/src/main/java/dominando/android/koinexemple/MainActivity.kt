package dominando.android.koinexemple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val userViewModel by viewModel<UserViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userViewModel.data.observe(this, Observer {
            // Populate the UI
            Log.i("UI", it.toString())
        })

        userViewModel.loadingState.observe(this, Observer {
            // Observe the loading state
            Log.i("LOADING", it.toString())
        })
    }
}