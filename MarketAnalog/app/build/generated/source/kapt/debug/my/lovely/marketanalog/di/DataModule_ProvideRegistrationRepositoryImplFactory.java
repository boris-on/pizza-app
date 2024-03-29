// Generated by Dagger (https://dagger.dev).
package my.lovely.marketanalog.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import my.lovely.data.api.RegistrationService;
import my.lovely.domain.repository.RegistrationRepository;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DataModule_ProvideRegistrationRepositoryImplFactory implements Factory<RegistrationRepository> {
  private final DataModule module;

  private final Provider<RegistrationService> registrationServiceProvider;

  public DataModule_ProvideRegistrationRepositoryImplFactory(DataModule module,
      Provider<RegistrationService> registrationServiceProvider) {
    this.module = module;
    this.registrationServiceProvider = registrationServiceProvider;
  }

  @Override
  public RegistrationRepository get() {
    return provideRegistrationRepositoryImpl(module, registrationServiceProvider.get());
  }

  public static DataModule_ProvideRegistrationRepositoryImplFactory create(DataModule module,
      Provider<RegistrationService> registrationServiceProvider) {
    return new DataModule_ProvideRegistrationRepositoryImplFactory(module, registrationServiceProvider);
  }

  public static RegistrationRepository provideRegistrationRepositoryImpl(DataModule instance,
      RegistrationService registrationService) {
    return Preconditions.checkNotNullFromProvides(instance.provideRegistrationRepositoryImpl(registrationService));
  }
}