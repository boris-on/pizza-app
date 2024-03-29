// Generated by Dagger (https://dagger.dev).
package my.lovely.marketanalog.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import my.lovely.data.api.AsiaMenuDataService;
import my.lovely.domain.repository.AsiaMenuRepository;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DataModule_ProvideAsiaMenuRepositoryImplFactory implements Factory<AsiaMenuRepository> {
  private final DataModule module;

  private final Provider<AsiaMenuDataService> asiaMenuDataServiceProvider;

  public DataModule_ProvideAsiaMenuRepositoryImplFactory(DataModule module,
      Provider<AsiaMenuDataService> asiaMenuDataServiceProvider) {
    this.module = module;
    this.asiaMenuDataServiceProvider = asiaMenuDataServiceProvider;
  }

  @Override
  public AsiaMenuRepository get() {
    return provideAsiaMenuRepositoryImpl(module, asiaMenuDataServiceProvider.get());
  }

  public static DataModule_ProvideAsiaMenuRepositoryImplFactory create(DataModule module,
      Provider<AsiaMenuDataService> asiaMenuDataServiceProvider) {
    return new DataModule_ProvideAsiaMenuRepositoryImplFactory(module, asiaMenuDataServiceProvider);
  }

  public static AsiaMenuRepository provideAsiaMenuRepositoryImpl(DataModule instance,
      AsiaMenuDataService asiaMenuDataService) {
    return Preconditions.checkNotNullFromProvides(instance.provideAsiaMenuRepositoryImpl(asiaMenuDataService));
  }
}