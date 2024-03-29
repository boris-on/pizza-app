package my.lovely.marketanalog.presentation.basket;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import my.lovely.domain.model.Basket;
import my.lovely.domain.usecase.GetBasketDaoDbUseCase;
import my.lovely.domain.usecase.GetDateUseCase;
import my.lovely.domain.usecase.GetLocationUseCase;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\f\u001a\u00020\u001cJ\u0006\u0010\u0017\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lmy/lovely/marketanalog/presentation/basket/BasketViewModel;", "Landroidx/lifecycle/ViewModel;", "getBasketDaoDbUseCase", "Lmy/lovely/domain/usecase/GetBasketDaoDbUseCase;", "getLocationUseCase", "Lmy/lovely/domain/usecase/GetLocationUseCase;", "getDateUseCase", "Lmy/lovely/domain/usecase/GetDateUseCase;", "(Lmy/lovely/domain/usecase/GetBasketDaoDbUseCase;Lmy/lovely/domain/usecase/GetLocationUseCase;Lmy/lovely/domain/usecase/GetDateUseCase;)V", "date", "Landroidx/lifecycle/LiveData;", "", "getDate", "()Landroidx/lifecycle/LiveData;", "dateLiveData", "Landroidx/lifecycle/MutableLiveData;", "dishes", "", "Lmy/lovely/domain/model/Basket;", "getDishes", "setDishes", "(Landroidx/lifecycle/LiveData;)V", "location", "getLocation", "locationLiveData", "deleteDish", "Lkotlinx/coroutines/Job;", "dish", "", "updateDish", "app_debug"})
public final class BasketViewModel extends androidx.lifecycle.ViewModel {
    private final my.lovely.domain.usecase.GetBasketDaoDbUseCase getBasketDaoDbUseCase = null;
    private final my.lovely.domain.usecase.GetLocationUseCase getLocationUseCase = null;
    private final my.lovely.domain.usecase.GetDateUseCase getDateUseCase = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LiveData<java.util.List<my.lovely.domain.model.Basket>> dishes;
    private androidx.lifecycle.MutableLiveData<java.lang.String> dateLiveData;
    private androidx.lifecycle.MutableLiveData<java.lang.String> locationLiveData;
    
    @javax.inject.Inject
    public BasketViewModel(@org.jetbrains.annotations.NotNull
    my.lovely.domain.usecase.GetBasketDaoDbUseCase getBasketDaoDbUseCase, @org.jetbrains.annotations.NotNull
    my.lovely.domain.usecase.GetLocationUseCase getLocationUseCase, @org.jetbrains.annotations.NotNull
    my.lovely.domain.usecase.GetDateUseCase getDateUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<my.lovely.domain.model.Basket>> getDishes() {
        return null;
    }
    
    public final void setDishes(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<java.util.List<my.lovely.domain.model.Basket>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateDish(@org.jetbrains.annotations.NotNull
    my.lovely.domain.model.Basket dish) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteDish(@org.jetbrains.annotations.NotNull
    my.lovely.domain.model.Basket dish) {
        return null;
    }
    
    public final void getLocation() {
    }
    
    public final void getDate() {
    }
}