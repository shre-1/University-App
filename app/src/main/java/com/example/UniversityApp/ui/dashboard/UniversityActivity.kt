import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UniversityActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUniversityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUniversityBinding.inflate(layoutInflater)
    }
}

private fun ActivityUniversityBinding.Companion.inflate(inflater: LayoutInflater): ActivityUniversityBinding {
    TODO("Not yet implemented")
}

annotation class ActivityUniversityBinding {
    companion object
}