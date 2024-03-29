package my.lovely.marketanalog.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import my.lovely.data.api.AsiaMenuDataService;
import my.lovely.data.api.CatalogDataService;
import my.lovely.data.api.LoginService;
import my.lovely.data.api.RegistrationService;
import my.lovely.data.api.UserService;
import my.lovely.data.repository.AsiaMenuRepositoryImpl;
import my.lovely.data.repository.BasketRepositoryImpl;
import my.lovely.data.repository.CatalogRepositoryImpl;
import my.lovely.data.repository.GetDataRepositoryImpl;
import my.lovely.data.repository.LoginRepositoryImpl;
import my.lovely.data.repository.RegistrationRepositoryImpl;
import my.lovely.domain.database.BasketDao;
import my.lovely.domain.repository.AsiaMenuRepository;
import my.lovely.domain.repository.BasketRepository;
import my.lovely.domain.repository.CatalogRepository;
import my.lovely.domain.repository.GetDataRepository;
import my.lovely.domain.repository.LoginRepository;
import my.lovely.domain.repository.RegistrationRepository;
import my.lovely.domain.usecase.RequestRegistrationUseCase;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007\u00a8\u0006\u001b"}, d2 = {"Lmy/lovely/marketanalog/di/DataModule;", "", "()V", "provideAsiaMenuRepositoryImpl", "Lmy/lovely/domain/repository/AsiaMenuRepository;", "asiaMenuDataService", "Lmy/lovely/data/api/AsiaMenuDataService;", "provideBasketRepositoryImpl", "Lmy/lovely/domain/repository/BasketRepository;", "basketDao", "Lmy/lovely/domain/database/BasketDao;", "provideCatalogRepositoryImpl", "Lmy/lovely/domain/repository/CatalogRepository;", "dataService", "Lmy/lovely/data/api/CatalogDataService;", "provideGetDataRepositoryImpl", "Lmy/lovely/domain/repository/GetDataRepository;", "userService", "Lmy/lovely/data/api/UserService;", "provideLoginRepositoryImpl", "Lmy/lovely/domain/repository/LoginRepository;", "loginService", "Lmy/lovely/data/api/LoginService;", "provideRegistrationRepositoryImpl", "Lmy/lovely/domain/repository/RegistrationRepository;", "registrationService", "Lmy/lovely/data/api/RegistrationService;", "app_debug"})
@dagger.Module
public final class DataModule {
    
    public DataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final my.lovely.domain.repository.CatalogRepository provideCatalogRepositoryImpl(@org.jetbrains.annotations.NotNull
    my.lovely.data.api.CatalogDataService dataService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final my.lovely.domain.repository.AsiaMenuRepository provideAsiaMenuRepositoryImpl(@org.jetbrains.annotations.NotNull
    my.lovely.data.api.AsiaMenuDataService asiaMenuDataService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final my.lovely.domain.repository.BasketRepository provideBasketRepositoryImpl(@org.jetbrains.annotations.NotNull
    my.lovely.domain.database.BasketDao basketDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final my.lovely.domain.repository.LoginRepository provideLoginRepositoryImpl(@org.jetbrains.annotations.NotNull
    my.lovely.data.api.LoginService loginService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final my.lovely.domain.repository.RegistrationRepository provideRegistrationRepositoryImpl(@org.jetbrains.annotations.NotNull
    my.lovely.data.api.RegistrationService registrationService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final my.lovely.domain.repository.GetDataRepository provideGetDataRepositoryImpl(@org.jetbrains.annotations.NotNull
    my.lovely.data.api.UserService userService) {
        return null;
    }
}