// Generated by Dagger (https://dagger.dev).
package my.lovely.marketanalog.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import my.lovely.data.database.BasketDataBase;
import my.lovely.domain.database.BasketDao;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DataBaseModule_ProvideBasketDaoFactory implements Factory<BasketDao> {
  private final DataBaseModule module;

  private final Provider<BasketDataBase> basketDatabaseProvider;

  public DataBaseModule_ProvideBasketDaoFactory(DataBaseModule module,
      Provider<BasketDataBase> basketDatabaseProvider) {
    this.module = module;
    this.basketDatabaseProvider = basketDatabaseProvider;
  }

  @Override
  public BasketDao get() {
    return provideBasketDao(module, basketDatabaseProvider.get());
  }

  public static DataBaseModule_ProvideBasketDaoFactory create(DataBaseModule module,
      Provider<BasketDataBase> basketDatabaseProvider) {
    return new DataBaseModule_ProvideBasketDaoFactory(module, basketDatabaseProvider);
  }

  public static BasketDao provideBasketDao(DataBaseModule instance, BasketDataBase basketDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideBasketDao(basketDatabase));
  }
}
