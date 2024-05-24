package my.lovely.data.repository

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import my.lovely.data.api.RegistrationService
import my.lovely.domain.model.RegistrationRequest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever
import retrofit2.Response
import retrofit2.Retrofit

class RegistrationRepositoryImplTest {

    private val dataService = mock<RegistrationService>()
    private val retrofit = mock<Retrofit>()

    private val registrationRepository = RegistrationRepositoryImpl(dataService)

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `registration returns registration Response`() = runTest {

        val testDataResponse = Unit
        val testRegistrationRequest = RegistrationRequest(
            login = "",
            email = "",
            password = "",
            phone = 0,
            address = ""
        )

        whenever(retrofit.create(RegistrationService::class.java)).thenReturn(dataService)
        whenever(dataService.sendPostRegistration(testRegistrationRequest)).thenReturn(Response.success(testDataResponse))

        Assertions.assertEquals(
            testDataResponse,
            registrationRepository.passwordRequest(login = "", password = "", email = "", phone = 0, adress = "")?.body()
        )
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `registration from repository returns Error because of Internet`() = runTest {

        val testDataResponse = null

        whenever(retrofit.create(RegistrationService::class.java)).thenReturn(dataService)
        whenever(dataService.sendPostRegistration(RegistrationRequest(login = "", email = "", password = "", phone = 0, address = ""))).thenReturn(
            Response.success(testDataResponse))

        Assertions.assertEquals(
            testDataResponse,
            registrationRepository.passwordRequest(login = "", password = "", email = "", phone = 0, adress = "")!!.body()
        )
    }
}