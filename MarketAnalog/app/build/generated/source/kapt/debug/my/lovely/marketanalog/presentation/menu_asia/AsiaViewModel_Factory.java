// Generated by Dagger (https://dagger.dev).
package my.lovely.marketanalog.presentation.menu_asia;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import my.lovely.domain.usecase.GetAsiaMenuUseCase;
import my.lovely.domain.usecase.GetBasketDaoDbUseCase;
import my.lovely.domain.usecase.SortByTagUseCase;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AsiaViewModel_Factory implements Factory<AsiaViewModel> {
  private final Provider<GetAsiaMenuUseCase> getAsiaMenuUseCaseProvider;

  private final Provider<GetBasketDaoDbUseCase> getBasketDaoDbUseCaseProvider;

  private final Provider<SortByTagUseCase> sortByTagUseCaseProvider;

  public AsiaViewModel_Factory(Provider<GetAsiaMenuUseCase> getAsiaMenuUseCaseProvider,
      Provider<GetBasketDaoDbUseCase> getBasketDaoDbUseCaseProvider,
      Provider<SortByTagUseCase> sortByTagUseCaseProvider) {
    this.getAsiaMenuUseCaseProvider = getAsiaMenuUseCaseProvider;
    this.getBasketDaoDbUseCaseProvider = getBasketDaoDbUseCaseProvider;
    this.sortByTagUseCaseProvider = sortByTagUseCaseProvider;
  }

  @Override
  public AsiaViewModel get() {
    return newInstance(getAsiaMenuUseCaseProvider.get(), getBasketDaoDbUseCaseProvider.get(), sortByTagUseCaseProvider.get());
  }

  public static AsiaViewModel_Factory create(
      Provider<GetAsiaMenuUseCase> getAsiaMenuUseCaseProvider,
      Provider<GetBasketDaoDbUseCase> getBasketDaoDbUseCaseProvider,
      Provider<SortByTagUseCase> sortByTagUseCaseProvider) {
    return new AsiaViewModel_Factory(getAsiaMenuUseCaseProvider, getBasketDaoDbUseCaseProvider, sortByTagUseCaseProvider);
  }

  public static AsiaViewModel newInstance(GetAsiaMenuUseCase getAsiaMenuUseCase,
      GetBasketDaoDbUseCase getBasketDaoDbUseCase, SortByTagUseCase sortByTagUseCase) {
    return new AsiaViewModel(getAsiaMenuUseCase, getBasketDaoDbUseCase, sortByTagUseCase);
  }
}