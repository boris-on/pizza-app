package my.lovely.marketanalog.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import my.lovely.data.api.AsiaMenuDataService
import my.lovely.data.api.CatalogDataService
import my.lovely.data.api.LoginService
import my.lovely.data.api.RegistrationService
import my.lovely.data.api.UserService
import my.lovely.data.repository.AsiaMenuRepositoryImpl
import my.lovely.data.repository.BasketRepositoryImpl
import my.lovely.data.repository.CatalogRepositoryImpl
import my.lovely.data.repository.GetDataRepositoryImpl
import my.lovely.data.repository.LoginRepositoryImpl
import my.lovely.data.repository.RegistrationRepositoryImpl
import my.lovely.domain.database.BasketDao
import my.lovely.domain.repository.AsiaMenuRepository
import my.lovely.domain.repository.BasketRepository
import my.lovely.domain.repository.CatalogRepository
import my.lovely.domain.repository.GetDataRepository
import my.lovely.domain.repository.LoginRepository
import my.lovely.domain.repository.RegistrationRepository
import my.lovely.domain.usecase.RequestRegistrationUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideCatalogRepositoryImpl(dataService: CatalogDataService) : CatalogRepository {
        return CatalogRepositoryImpl(dataService = dataService)
    }

    @Provides
    @Singleton
    fun provideAsiaMenuRepositoryImpl(asiaMenuDataService: AsiaMenuDataService) : AsiaMenuRepository {
        return AsiaMenuRepositoryImpl(asiaMenuDataService = asiaMenuDataService)
    }

    @Provides
    @Singleton
    fun provideBasketRepositoryImpl(basketDao: BasketDao): BasketRepository {
        return BasketRepositoryImpl(basketDao = basketDao)
    }

    @Provides
    @Singleton
    fun provideLoginRepositoryImpl(loginService: LoginService) : LoginRepository {
        return LoginRepositoryImpl(loginService = loginService)
    }

    @Provides
    @Singleton
    fun provideRegistrationRepositoryImpl(registrationService: RegistrationService) : RegistrationRepository {
        return RegistrationRepositoryImpl(registrationService = registrationService)
    }

    @Provides
    @Singleton
    fun provideGetDataRepositoryImpl(userService: UserService) : GetDataRepository {
        return GetDataRepositoryImpl(dataService = userService)
    }

}