package my.lovely.marketanalog.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import my.lovely.domain.repository.AsiaMenuRepository
import my.lovely.domain.repository.BasketRepository
import my.lovely.domain.repository.CatalogRepository
import my.lovely.domain.repository.GetDataRepository
import my.lovely.domain.repository.LoginRepository
import my.lovely.domain.repository.RegistrationRepository
import my.lovely.domain.usecase.*

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideCatalogUseCase(catalogRepository: CatalogRepository): GetCatalogUseCase {
        return GetCatalogUseCase(catalogRepository = catalogRepository)
    }

    @Provides
    fun provideGetAsiaMenuUseCase(asiaMenuRepository: AsiaMenuRepository): GetAsiaMenuUseCase {
        return GetAsiaMenuUseCase(asiaMenuRepository = asiaMenuRepository)
    }

    @Provides
    fun provideGetBasketDaoDBUseCase(basketReposotiry: BasketRepository): GetBasketDaoDbUseCase {
        return GetBasketDaoDbUseCase(basketRepository = basketReposotiry)
    }

    @Provides
    fun provideGetDateUseCase(): GetDateUseCase {
        return GetDateUseCase()
    }

    @Provides
    fun provideSortByTagUseCase(): SortByTagUseCase {
        return SortByTagUseCase()
    }

    @Provides
    fun provideGetLocationUseCase(@ApplicationContext context: Context): GetLocationUseCase {
        return GetLocationUseCase(context = context)
    }

    @Provides
    fun provideRequestLoginUseCase(loginRepository: LoginRepository): RequestLoginUseCase {
        return RequestLoginUseCase(loginRepository = loginRepository)
    }

    @Provides
    fun provideRequestRegistrationUseCase(registrationRepository: RegistrationRepository): RequestRegistrationUseCase {
        return RequestRegistrationUseCase(registrationRepository = registrationRepository)
    }

    @Provides
    fun provideResponseUserInfoUseCase(getDataRepository: GetDataRepository): ResponseUserInfoUseCase {
        return ResponseUserInfoUseCase(getDataRepository = getDataRepository)
    }
}