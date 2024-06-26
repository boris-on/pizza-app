// Generated by Dagger (https://dagger.dev).
package my.lovely.marketanalog.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import my.lovely.domain.repository.AsiaMenuRepository;
import my.lovely.domain.usecase.GetAsiaMenuUseCase;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DomainModule_ProvideGetAsiaMenuUseCaseFactory implements Factory<GetAsiaMenuUseCase> {
  private final DomainModule module;

  private final Provider<AsiaMenuRepository> asiaMenuRepositoryProvider;

  public DomainModule_ProvideGetAsiaMenuUseCaseFactory(DomainModule module,
      Provider<AsiaMenuRepository> asiaMenuRepositoryProvider) {
    this.module = module;
    this.asiaMenuRepositoryProvider = asiaMenuRepositoryProvider;
  }

  @Override
  public GetAsiaMenuUseCase get() {
    return provideGetAsiaMenuUseCase(module, asiaMenuRepositoryProvider.get());
  }

  public static DomainModule_ProvideGetAsiaMenuUseCaseFactory create(DomainModule module,
      Provider<AsiaMenuRepository> asiaMenuRepositoryProvider) {
    return new DomainModule_ProvideGetAsiaMenuUseCaseFactory(module, asiaMenuRepositoryProvider);
  }

  public static GetAsiaMenuUseCase provideGetAsiaMenuUseCase(DomainModule instance,
      AsiaMenuRepository asiaMenuRepository) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetAsiaMenuUseCase(asiaMenuRepository));
  }
}
