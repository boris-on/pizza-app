package my.lovely.marketanalog.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import my.lovely.domain.repository.AsiaMenuRepository;
import my.lovely.domain.repository.BasketRepository;
import my.lovely.domain.repository.CatalogRepository;
import my.lovely.domain.repository.GetDataRepository;
import my.lovely.domain.repository.LoginRepository;
import my.lovely.domain.repository.RegistrationRepository;
import my.lovely.domain.usecase.*;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007J\b\u0010!\u001a\u00020\"H\u0007\u00a8\u0006#"}, d2 = {"Lmy/lovely/marketanalog/di/DomainModule;", "", "()V", "provideCatalogUseCase", "Lmy/lovely/domain/usecase/GetCatalogUseCase;", "catalogRepository", "Lmy/lovely/domain/repository/CatalogRepository;", "provideGetAsiaMenuUseCase", "Lmy/lovely/domain/usecase/GetAsiaMenuUseCase;", "asiaMenuRepository", "Lmy/lovely/domain/repository/AsiaMenuRepository;", "provideGetBasketDaoDBUseCase", "Lmy/lovely/domain/usecase/GetBasketDaoDbUseCase;", "basketReposotiry", "Lmy/lovely/domain/repository/BasketRepository;", "provideGetDateUseCase", "Lmy/lovely/domain/usecase/GetDateUseCase;", "provideGetLocationUseCase", "Lmy/lovely/domain/usecase/GetLocationUseCase;", "context", "Landroid/content/Context;", "provideRequestLoginUseCase", "Lmy/lovely/domain/usecase/RequestLoginUseCase;", "loginRepository", "Lmy/lovely/domain/repository/LoginRepository;", "provideRequestRegistrationUseCase", "Lmy/lovely/domain/usecase/RequestRegistrationUseCase;", "registrationRepository", "Lmy/lovely/domain/repository/RegistrationRepository;", "provideResponseUserInfoUseCase", "Lmy/lovely/domain/usecase/ResponseUserInfoUseCase;", "getDataRepository", "Lmy/lovely/domain/repository/GetDataRepository;", "provideSortByTagUseCase", "Lmy/lovely/domain/usecase/SortByTagUseCase;", "app_debug"})
@dagger.Module
public final class DomainModule {
    
    public DomainModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final my.lovely.domain.usecase.GetCatalogUseCase provideCatalogUseCase(@org.jetbrains.annotations.NotNull
    my.lovely.domain.repository.CatalogRepository catalogRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final my.lovely.domain.usecase.GetAsiaMenuUseCase provideGetAsiaMenuUseCase(@org.jetbrains.annotations.NotNull
    my.lovely.domain.repository.AsiaMenuRepository asiaMenuRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final my.lovely.domain.usecase.GetBasketDaoDbUseCase provideGetBasketDaoDBUseCase(@org.jetbrains.annotations.NotNull
    my.lovely.domain.repository.BasketRepository basketReposotiry) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final my.lovely.domain.usecase.GetDateUseCase provideGetDateUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final my.lovely.domain.usecase.SortByTagUseCase provideSortByTagUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final my.lovely.domain.usecase.GetLocationUseCase provideGetLocationUseCase(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final my.lovely.domain.usecase.RequestLoginUseCase provideRequestLoginUseCase(@org.jetbrains.annotations.NotNull
    my.lovely.domain.repository.LoginRepository loginRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final my.lovely.domain.usecase.RequestRegistrationUseCase provideRequestRegistrationUseCase(@org.jetbrains.annotations.NotNull
    my.lovely.domain.repository.RegistrationRepository registrationRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final my.lovely.domain.usecase.ResponseUserInfoUseCase provideResponseUserInfoUseCase(@org.jetbrains.annotations.NotNull
    my.lovely.domain.repository.GetDataRepository getDataRepository) {
        return null;
    }
}