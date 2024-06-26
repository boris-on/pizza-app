// Generated by Dagger (https://dagger.dev).
package my.lovely.marketanalog.app;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import my.lovely.data.api.AsiaMenuDataObject;
import my.lovely.data.api.AsiaMenuDataObject_GetInstanceFactory;
import my.lovely.data.api.AsiaMenuDataService;
import my.lovely.data.api.AuthorisationObject;
import my.lovely.data.api.AuthorisationObject_GetUserInfoFactory;
import my.lovely.data.api.AuthorisationObject_PostLoginFactory;
import my.lovely.data.api.AuthorisationObject_PostRegistrationFactory;
import my.lovely.data.api.CatalogDataObject;
import my.lovely.data.api.CatalogDataObject_GetInstanceFactory;
import my.lovely.data.api.CatalogDataService;
import my.lovely.data.api.LoginService;
import my.lovely.data.api.RegistrationService;
import my.lovely.data.api.UserService;
import my.lovely.data.database.BasketDataBase;
import my.lovely.data.database.DataBaseObject;
import my.lovely.data.database.DataBaseObject_GetInstanceFactory;
import my.lovely.domain.database.BasketDao;
import my.lovely.domain.repository.AsiaMenuRepository;
import my.lovely.domain.repository.BasketRepository;
import my.lovely.domain.repository.CatalogRepository;
import my.lovely.domain.repository.GetDataRepository;
import my.lovely.domain.repository.LoginRepository;
import my.lovely.domain.repository.RegistrationRepository;
import my.lovely.domain.usecase.GetAsiaMenuUseCase;
import my.lovely.domain.usecase.GetBasketDaoDbUseCase;
import my.lovely.domain.usecase.GetCatalogUseCase;
import my.lovely.domain.usecase.GetLocationUseCase;
import my.lovely.domain.usecase.RequestLoginUseCase;
import my.lovely.domain.usecase.RequestRegistrationUseCase;
import my.lovely.domain.usecase.ResponseUserInfoUseCase;
import my.lovely.marketanalog.di.DataBaseModule;
import my.lovely.marketanalog.di.DataBaseModule_ProvideBasketDaoFactory;
import my.lovely.marketanalog.di.DataModule;
import my.lovely.marketanalog.di.DataModule_ProvideAsiaMenuRepositoryImplFactory;
import my.lovely.marketanalog.di.DataModule_ProvideBasketRepositoryImplFactory;
import my.lovely.marketanalog.di.DataModule_ProvideCatalogRepositoryImplFactory;
import my.lovely.marketanalog.di.DataModule_ProvideGetDataRepositoryImplFactory;
import my.lovely.marketanalog.di.DataModule_ProvideLoginRepositoryImplFactory;
import my.lovely.marketanalog.di.DataModule_ProvideRegistrationRepositoryImplFactory;
import my.lovely.marketanalog.di.DomainModule;
import my.lovely.marketanalog.di.DomainModule_ProvideCatalogUseCaseFactory;
import my.lovely.marketanalog.di.DomainModule_ProvideGetAsiaMenuUseCaseFactory;
import my.lovely.marketanalog.di.DomainModule_ProvideGetBasketDaoDBUseCaseFactory;
import my.lovely.marketanalog.di.DomainModule_ProvideGetDateUseCaseFactory;
import my.lovely.marketanalog.di.DomainModule_ProvideGetLocationUseCaseFactory;
import my.lovely.marketanalog.di.DomainModule_ProvideRequestLoginUseCaseFactory;
import my.lovely.marketanalog.di.DomainModule_ProvideRequestRegistrationUseCaseFactory;
import my.lovely.marketanalog.di.DomainModule_ProvideResponseUserInfoUseCaseFactory;
import my.lovely.marketanalog.di.DomainModule_ProvideSortByTagUseCaseFactory;
import my.lovely.marketanalog.presentation.MainActivity;
import my.lovely.marketanalog.presentation.basket.BasketFragment;
import my.lovely.marketanalog.presentation.basket.BasketViewModel;
import my.lovely.marketanalog.presentation.basket.BasketViewModel_HiltModules_KeyModule_ProvideFactory;
import my.lovely.marketanalog.presentation.card.CardFragment;
import my.lovely.marketanalog.presentation.login.LoginFragment;
import my.lovely.marketanalog.presentation.login.LoginViewModel;
import my.lovely.marketanalog.presentation.login.LoginViewModel_HiltModules_KeyModule_ProvideFactory;
import my.lovely.marketanalog.presentation.mainCatalog.CatalogFragment;
import my.lovely.marketanalog.presentation.mainCatalog.CatalogViewModel;
import my.lovely.marketanalog.presentation.mainCatalog.CatalogViewModel_HiltModules_KeyModule_ProvideFactory;
import my.lovely.marketanalog.presentation.menu_asia.AsiaFragment;
import my.lovely.marketanalog.presentation.menu_asia.AsiaViewModel;
import my.lovely.marketanalog.presentation.menu_asia.AsiaViewModel_HiltModules_KeyModule_ProvideFactory;
import my.lovely.marketanalog.presentation.pay.PaymentFragment;
import my.lovely.marketanalog.presentation.pay.PaymentViewModel;
import my.lovely.marketanalog.presentation.pay.PaymentViewModel_HiltModules_KeyModule_ProvideFactory;
import my.lovely.marketanalog.presentation.profile.ProfileFragment;
import my.lovely.marketanalog.presentation.profile.ProfileViewModel;
import my.lovely.marketanalog.presentation.profile.ProfileViewModel_HiltModules_KeyModule_ProvideFactory;
import my.lovely.marketanalog.presentation.registration.RegistrationFragment;
import my.lovely.marketanalog.presentation.registration.RegistrationViewModel;
import my.lovely.marketanalog.presentation.registration.RegistrationViewModel_HiltModules_KeyModule_ProvideFactory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DaggerApp_HiltComponents_SingletonC {
  private DaggerApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private DataBaseModule dataBaseModule;

    private DataModule dataModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder asiaMenuDataObject(AsiaMenuDataObject asiaMenuDataObject) {
      Preconditions.checkNotNull(asiaMenuDataObject);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder authorisationObject(AuthorisationObject authorisationObject) {
      Preconditions.checkNotNull(authorisationObject);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder catalogDataObject(CatalogDataObject catalogDataObject) {
      Preconditions.checkNotNull(catalogDataObject);
      return this;
    }

    public Builder dataBaseModule(DataBaseModule dataBaseModule) {
      this.dataBaseModule = Preconditions.checkNotNull(dataBaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder dataBaseObject(DataBaseObject dataBaseObject) {
      Preconditions.checkNotNull(dataBaseObject);
      return this;
    }

    public Builder dataModule(DataModule dataModule) {
      this.dataModule = Preconditions.checkNotNull(dataModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (dataBaseModule == null) {
        this.dataBaseModule = new DataBaseModule();
      }
      if (dataModule == null) {
        this.dataModule = new DataModule();
      }
      return new SingletonCImpl(applicationContextModule, dataBaseModule, dataModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public App_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public App_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public App_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, new DomainModule(), savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends App_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }

    @Override
    public void injectBasketFragment(BasketFragment basketFragment) {
    }

    @Override
    public void injectCardFragment(CardFragment cardFragment) {
    }

    @Override
    public void injectLoginFragment(LoginFragment loginFragment) {
    }

    @Override
    public void injectCatalogFragment(CatalogFragment catalogFragment) {
    }

    @Override
    public void injectAsiaFragment(AsiaFragment asiaFragment) {
    }

    @Override
    public void injectPaymentFragment(PaymentFragment paymentFragment) {
    }

    @Override
    public void injectProfileFragment(ProfileFragment profileFragment) {
    }

    @Override
    public void injectRegistrationFragment(RegistrationFragment registrationFragment) {
    }
  }

  private static final class ViewCImpl extends App_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends App_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(7).add(AsiaViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(BasketViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(CatalogViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(LoginViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(PaymentViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ProfileViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(RegistrationViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }
  }

  private static final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
    private final DomainModule domainModule;

    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<AsiaViewModel> asiaViewModelProvider;

    private Provider<BasketViewModel> basketViewModelProvider;

    private Provider<CatalogViewModel> catalogViewModelProvider;

    private Provider<LoginViewModel> loginViewModelProvider;

    private Provider<PaymentViewModel> paymentViewModelProvider;

    private Provider<ProfileViewModel> profileViewModelProvider;

    private Provider<RegistrationViewModel> registrationViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, DomainModule domainModuleParam,
        SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.domainModule = domainModuleParam;
      initialize(domainModuleParam, savedStateHandleParam, viewModelLifecycleParam);

    }

    private GetAsiaMenuUseCase getAsiaMenuUseCase() {
      return DomainModule_ProvideGetAsiaMenuUseCaseFactory.provideGetAsiaMenuUseCase(domainModule, singletonCImpl.provideAsiaMenuRepositoryImplProvider.get());
    }

    private GetBasketDaoDbUseCase getBasketDaoDbUseCase() {
      return DomainModule_ProvideGetBasketDaoDBUseCaseFactory.provideGetBasketDaoDBUseCase(domainModule, singletonCImpl.provideBasketRepositoryImplProvider.get());
    }

    private GetLocationUseCase getLocationUseCase() {
      return DomainModule_ProvideGetLocationUseCaseFactory.provideGetLocationUseCase(domainModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));
    }

    private GetCatalogUseCase getCatalogUseCase() {
      return DomainModule_ProvideCatalogUseCaseFactory.provideCatalogUseCase(domainModule, singletonCImpl.provideCatalogRepositoryImplProvider.get());
    }

    private RequestLoginUseCase requestLoginUseCase() {
      return DomainModule_ProvideRequestLoginUseCaseFactory.provideRequestLoginUseCase(domainModule, singletonCImpl.provideLoginRepositoryImplProvider.get());
    }

    private ResponseUserInfoUseCase responseUserInfoUseCase() {
      return DomainModule_ProvideResponseUserInfoUseCaseFactory.provideResponseUserInfoUseCase(domainModule, singletonCImpl.provideGetDataRepositoryImplProvider.get());
    }

    private RequestRegistrationUseCase requestRegistrationUseCase() {
      return DomainModule_ProvideRequestRegistrationUseCaseFactory.provideRequestRegistrationUseCase(domainModule, singletonCImpl.provideRegistrationRepositoryImplProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final DomainModule domainModuleParam,
        final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.asiaViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.basketViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.catalogViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.loginViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.paymentViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.profileViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.registrationViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(7).put("my.lovely.marketanalog.presentation.menu_asia.AsiaViewModel", ((Provider) asiaViewModelProvider)).put("my.lovely.marketanalog.presentation.basket.BasketViewModel", ((Provider) basketViewModelProvider)).put("my.lovely.marketanalog.presentation.mainCatalog.CatalogViewModel", ((Provider) catalogViewModelProvider)).put("my.lovely.marketanalog.presentation.login.LoginViewModel", ((Provider) loginViewModelProvider)).put("my.lovely.marketanalog.presentation.pay.PaymentViewModel", ((Provider) paymentViewModelProvider)).put("my.lovely.marketanalog.presentation.profile.ProfileViewModel", ((Provider) profileViewModelProvider)).put("my.lovely.marketanalog.presentation.registration.RegistrationViewModel", ((Provider) registrationViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // my.lovely.marketanalog.presentation.menu_asia.AsiaViewModel 
          return (T) new AsiaViewModel(viewModelCImpl.getAsiaMenuUseCase(), viewModelCImpl.getBasketDaoDbUseCase(), DomainModule_ProvideSortByTagUseCaseFactory.provideSortByTagUseCase(viewModelCImpl.domainModule));

          case 1: // my.lovely.marketanalog.presentation.basket.BasketViewModel 
          return (T) new BasketViewModel(viewModelCImpl.getBasketDaoDbUseCase(), viewModelCImpl.getLocationUseCase(), DomainModule_ProvideGetDateUseCaseFactory.provideGetDateUseCase(viewModelCImpl.domainModule));

          case 2: // my.lovely.marketanalog.presentation.mainCatalog.CatalogViewModel 
          return (T) new CatalogViewModel(viewModelCImpl.getCatalogUseCase(), DomainModule_ProvideGetDateUseCaseFactory.provideGetDateUseCase(viewModelCImpl.domainModule), viewModelCImpl.getLocationUseCase());

          case 3: // my.lovely.marketanalog.presentation.login.LoginViewModel 
          return (T) new LoginViewModel(viewModelCImpl.requestLoginUseCase());

          case 4: // my.lovely.marketanalog.presentation.pay.PaymentViewModel 
          return (T) new PaymentViewModel(viewModelCImpl.getBasketDaoDbUseCase());

          case 5: // my.lovely.marketanalog.presentation.profile.ProfileViewModel 
          return (T) new ProfileViewModel(viewModelCImpl.responseUserInfoUseCase());

          case 6: // my.lovely.marketanalog.presentation.registration.RegistrationViewModel 
          return (T) new RegistrationViewModel(viewModelCImpl.requestRegistrationUseCase());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends App_HiltComponents.SingletonC {
    private final DataModule dataModule;

    private final DataBaseModule dataBaseModule;

    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<AsiaMenuDataService> getInstanceProvider;

    private Provider<AsiaMenuRepository> provideAsiaMenuRepositoryImplProvider;

    private Provider<BasketDataBase> getInstanceProvider2;

    private Provider<BasketRepository> provideBasketRepositoryImplProvider;

    private Provider<CatalogDataService> getInstanceProvider3;

    private Provider<CatalogRepository> provideCatalogRepositoryImplProvider;

    private Provider<LoginService> postLoginProvider;

    private Provider<LoginRepository> provideLoginRepositoryImplProvider;

    private Provider<UserService> getUserInfoProvider;

    private Provider<GetDataRepository> provideGetDataRepositoryImplProvider;

    private Provider<RegistrationService> postRegistrationProvider;

    private Provider<RegistrationRepository> provideRegistrationRepositoryImplProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam,
        DataBaseModule dataBaseModuleParam, DataModule dataModuleParam) {
      this.dataModule = dataModuleParam;
      this.dataBaseModule = dataBaseModuleParam;
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam, dataBaseModuleParam, dataModuleParam);

    }

    private BasketDao basketDao() {
      return DataBaseModule_ProvideBasketDaoFactory.provideBasketDao(dataBaseModule, getInstanceProvider2.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam,
        final DataBaseModule dataBaseModuleParam, final DataModule dataModuleParam) {
      this.getInstanceProvider = DoubleCheck.provider(new SwitchingProvider<AsiaMenuDataService>(singletonCImpl, 1));
      this.provideAsiaMenuRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<AsiaMenuRepository>(singletonCImpl, 0));
      this.getInstanceProvider2 = DoubleCheck.provider(new SwitchingProvider<BasketDataBase>(singletonCImpl, 3));
      this.provideBasketRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<BasketRepository>(singletonCImpl, 2));
      this.getInstanceProvider3 = DoubleCheck.provider(new SwitchingProvider<CatalogDataService>(singletonCImpl, 5));
      this.provideCatalogRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<CatalogRepository>(singletonCImpl, 4));
      this.postLoginProvider = DoubleCheck.provider(new SwitchingProvider<LoginService>(singletonCImpl, 7));
      this.provideLoginRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<LoginRepository>(singletonCImpl, 6));
      this.getUserInfoProvider = DoubleCheck.provider(new SwitchingProvider<UserService>(singletonCImpl, 9));
      this.provideGetDataRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<GetDataRepository>(singletonCImpl, 8));
      this.postRegistrationProvider = DoubleCheck.provider(new SwitchingProvider<RegistrationService>(singletonCImpl, 11));
      this.provideRegistrationRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<RegistrationRepository>(singletonCImpl, 10));
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    @Override
    public void injectApp(App app) {
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // my.lovely.domain.repository.AsiaMenuRepository 
          return (T) DataModule_ProvideAsiaMenuRepositoryImplFactory.provideAsiaMenuRepositoryImpl(singletonCImpl.dataModule, singletonCImpl.getInstanceProvider.get());

          case 1: // my.lovely.data.api.AsiaMenuDataService 
          return (T) AsiaMenuDataObject_GetInstanceFactory.getInstance();

          case 2: // my.lovely.domain.repository.BasketRepository 
          return (T) DataModule_ProvideBasketRepositoryImplFactory.provideBasketRepositoryImpl(singletonCImpl.dataModule, singletonCImpl.basketDao());

          case 3: // my.lovely.data.database.BasketDataBase 
          return (T) DataBaseObject_GetInstanceFactory.getInstance(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 4: // my.lovely.domain.repository.CatalogRepository 
          return (T) DataModule_ProvideCatalogRepositoryImplFactory.provideCatalogRepositoryImpl(singletonCImpl.dataModule, singletonCImpl.getInstanceProvider3.get());

          case 5: // my.lovely.data.api.CatalogDataService 
          return (T) CatalogDataObject_GetInstanceFactory.getInstance();

          case 6: // my.lovely.domain.repository.LoginRepository 
          return (T) DataModule_ProvideLoginRepositoryImplFactory.provideLoginRepositoryImpl(singletonCImpl.dataModule, singletonCImpl.postLoginProvider.get());

          case 7: // my.lovely.data.api.LoginService 
          return (T) AuthorisationObject_PostLoginFactory.postLogin();

          case 8: // my.lovely.domain.repository.GetDataRepository 
          return (T) DataModule_ProvideGetDataRepositoryImplFactory.provideGetDataRepositoryImpl(singletonCImpl.dataModule, singletonCImpl.getUserInfoProvider.get());

          case 9: // my.lovely.data.api.UserService 
          return (T) AuthorisationObject_GetUserInfoFactory.getUserInfo();

          case 10: // my.lovely.domain.repository.RegistrationRepository 
          return (T) DataModule_ProvideRegistrationRepositoryImplFactory.provideRegistrationRepositoryImpl(singletonCImpl.dataModule, singletonCImpl.postRegistrationProvider.get());

          case 11: // my.lovely.data.api.RegistrationService 
          return (T) AuthorisationObject_PostRegistrationFactory.postRegistration();

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
