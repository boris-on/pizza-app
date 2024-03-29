// Generated by Dagger (https://dagger.dev).
package my.lovely.marketanalog.presentation.registration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import my.lovely.domain.usecase.RequestRegistrationUseCase;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RegistrationViewModel_Factory implements Factory<RegistrationViewModel> {
  private final Provider<RequestRegistrationUseCase> requestRegistrationUseCaseProvider;

  public RegistrationViewModel_Factory(
      Provider<RequestRegistrationUseCase> requestRegistrationUseCaseProvider) {
    this.requestRegistrationUseCaseProvider = requestRegistrationUseCaseProvider;
  }

  @Override
  public RegistrationViewModel get() {
    return newInstance(requestRegistrationUseCaseProvider.get());
  }

  public static RegistrationViewModel_Factory create(
      Provider<RequestRegistrationUseCase> requestRegistrationUseCaseProvider) {
    return new RegistrationViewModel_Factory(requestRegistrationUseCaseProvider);
  }

  public static RegistrationViewModel newInstance(
      RequestRegistrationUseCase requestRegistrationUseCase) {
    return new RegistrationViewModel(requestRegistrationUseCase);
  }
}