package my.lovely.data.repository

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import my.lovely.data.api.LoginService
import my.lovely.domain.model.LoginRequest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever
import retrofit2.Response
import retrofit2.Retrofit

class LoginRepositoryImplTest {

    private val dataService = mock<LoginService>()
    private val retrofit = mock<Retrofit>()

    private val loginRepository = LoginRepositoryImpl(dataService)

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `log in returns login Response`() = runTest {

        val testDataResponse = Unit
        val testLoginRequest = LoginRequest(
            login = "",
            password = ""
        )

        whenever(retrofit.create(LoginService::class.java)).thenReturn(dataService)
        whenever(dataService.sendPostLogin(testLoginRequest)).thenReturn(Response.success(testDataResponse))

        Assertions.assertEquals(
            testDataResponse,
            loginRepository.loginRequest(login = "", password = "")!!.body()

        )
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `log in from repository returns Error because of Internet`() = runTest {

        val testDataResponse = null

        whenever(retrofit.create(LoginService::class.java)).thenReturn(dataService)
        whenever(dataService.sendPostLogin(LoginRequest(login = "",password = ""))).thenReturn(Response.success(testDataResponse))

        Assertions.assertEquals(
            testDataResponse,
            loginRepository.loginRequest(login = "", password ="")!!.body()
        )
    }
}