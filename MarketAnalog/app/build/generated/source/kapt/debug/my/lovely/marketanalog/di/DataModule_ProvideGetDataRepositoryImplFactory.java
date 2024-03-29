// Generated by Dagger (https://dagger.dev).
package my.lovely.marketanalog.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import my.lovely.data.api.UserService;
import my.lovely.domain.repository.GetDataRepository;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DataModule_ProvideGetDataRepositoryImplFactory implements Factory<GetDataRepository> {
  private final DataModule module;

  private final Provider<UserService> userServiceProvider;

  public DataModule_ProvideGetDataRepositoryImplFactory(DataModule module,
      Provider<UserService> userServiceProvider) {
    this.module = module;
    this.userServiceProvider = userServiceProvider;
  }

  @Override
  public GetDataRepository get() {
    return provideGetDataRepositoryImpl(module, userServiceProvider.get());
  }

  public static DataModule_ProvideGetDataRepositoryImplFactory create(DataModule module,
      Provider<UserService> userServiceProvider) {
    return new DataModule_ProvideGetDataRepositoryImplFactory(module, userServiceProvider);
  }

  public static GetDataRepository provideGetDataRepositoryImpl(DataModule instance,
      UserService userService) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetDataRepositoryImpl(userService));
  }
}
