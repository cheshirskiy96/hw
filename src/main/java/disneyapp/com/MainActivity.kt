package disneyapp.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import disneyapp.com.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonStart.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view, CharacterListFragment.newInstance()).commit()
        }
    }

}
