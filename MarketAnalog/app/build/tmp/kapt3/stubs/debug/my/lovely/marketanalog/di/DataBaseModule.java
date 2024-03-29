package my.lovely.marketanalog.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import my.lovely.data.database.BasketDataBase;
import my.lovely.domain.database.BasketDao;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lmy/lovely/marketanalog/di/DataBaseModule;", "", "()V", "provideBasketDao", "Lmy/lovely/domain/database/BasketDao;", "basketDatabase", "Lmy/lovely/data/database/BasketDataBase;", "app_debug"})
@dagger.Module
public final class DataBaseModule {
    
    public DataBaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final my.lovely.domain.database.BasketDao provideBasketDao(@org.jetbrains.annotations.NotNull
    my.lovely.data.database.BasketDataBase basketDatabase) {
        return null;
    }
}