// Generated by Dagger (https://dagger.dev).
package my.lovely.marketanalog.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import my.lovely.domain.usecase.GetDateUseCase;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DomainModule_ProvideGetDateUseCaseFactory implements Factory<GetDateUseCase> {
  private final DomainModule module;

  public DomainModule_ProvideGetDateUseCaseFactory(DomainModule module) {
    this.module = module;
  }

  @Override
  public GetDateUseCase get() {
    return provideGetDateUseCase(module);
  }

  public static DomainModule_ProvideGetDateUseCaseFactory create(DomainModule module) {
    return new DomainModule_ProvideGetDateUseCaseFactory(module);
  }

  public static GetDateUseCase provideGetDateUseCase(DomainModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetDateUseCase());
  }
}
