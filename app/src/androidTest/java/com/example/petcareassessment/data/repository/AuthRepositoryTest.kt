import com.example.petcareassessment.data.model.AuthResponse
import com.example.petcareassessment.data.remote.ApiService
import com.example.petcareassessment.data.repository.AuthRepository
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Test
import retrofit2.Response

class AuthRepositoryTest {
    @Test
    fun `login success returns keypass`() = runTest {
        val mockApiService = mockk<ApiService>()
        coEvery { mockApiService.login(any()) } returns Response.success(AuthResponse("testKeypass"))
        val repository = AuthRepository(mockApiService)
        val result = repository.login("Shreyashi", "s12345678")
        assert(result.isSuccess)
        assert(result.getOrNull()?.keypass == "testKeypass")
    }

    private fun runTest(function: () -> Unit): Any {}
}

private fun AuthRepositoryTest.mockk() {
}
