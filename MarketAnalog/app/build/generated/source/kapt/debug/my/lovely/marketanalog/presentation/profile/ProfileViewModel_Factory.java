// Generated by Dagger (https://dagger.dev).
package my.lovely.marketanalog.presentation.profile;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import my.lovely.domain.usecase.ResponseUserInfoUseCase;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<ResponseUserInfoUseCase> responseUserInfoUseCaseProvider;

  public ProfileViewModel_Factory(
      Provider<ResponseUserInfoUseCase> responseUserInfoUseCaseProvider) {
    this.responseUserInfoUseCaseProvider = responseUserInfoUseCaseProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(responseUserInfoUseCaseProvider.get());
  }

  public static ProfileViewModel_Factory create(
      Provider<ResponseUserInfoUseCase> responseUserInfoUseCaseProvider) {
    return new ProfileViewModel_Factory(responseUserInfoUseCaseProvider);
  }

  public static ProfileViewModel newInstance(ResponseUserInfoUseCase responseUserInfoUseCase) {
    return new ProfileViewModel(responseUserInfoUseCase);
  }
}
