// Generated by Dagger (https://dagger.dev).
package my.lovely.marketanalog.presentation.card;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import my.lovely.domain.usecase.GetBasketDaoDbUseCase;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class CardViewModel_Factory implements Factory<CardViewModel> {
  private final Provider<GetBasketDaoDbUseCase> getBasketDaoDbUseCaseProvider;

  public CardViewModel_Factory(Provider<GetBasketDaoDbUseCase> getBasketDaoDbUseCaseProvider) {
    this.getBasketDaoDbUseCaseProvider = getBasketDaoDbUseCaseProvider;
  }

  @Override
  public CardViewModel get() {
    return newInstance(getBasketDaoDbUseCaseProvider.get());
  }

  public static CardViewModel_Factory create(
      Provider<GetBasketDaoDbUseCase> getBasketDaoDbUseCaseProvider) {
    return new CardViewModel_Factory(getBasketDaoDbUseCaseProvider);
  }

  public static CardViewModel newInstance(GetBasketDaoDbUseCase getBasketDaoDbUseCase) {
    return new CardViewModel(getBasketDaoDbUseCase);
  }
}