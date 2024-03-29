package my.lovely.marketanalog.presentation.menu_asia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import my.lovely.domain.model.AsiaResponse;
import my.lovely.domain.model.Basket;
import my.lovely.domain.model.Dishe;
import my.lovely.domain.usecase.GetAsiaMenuUseCase;
import my.lovely.domain.usecase.GetBasketDaoDbUseCase;
import my.lovely.domain.usecase.SortByTagUseCase;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ&\u0010\u001f\u001a\u00020 2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u00182\u0006\u0010\"\u001a\u00020#R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u00180\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012\u00a8\u0006$"}, d2 = {"Lmy/lovely/marketanalog/presentation/menu_asia/AsiaViewModel;", "Landroidx/lifecycle/ViewModel;", "getAsiaMenuUseCase", "Lmy/lovely/domain/usecase/GetAsiaMenuUseCase;", "getBasketDaoDbUseCase", "Lmy/lovely/domain/usecase/GetBasketDaoDbUseCase;", "sortByTagUseCase", "Lmy/lovely/domain/usecase/SortByTagUseCase;", "(Lmy/lovely/domain/usecase/GetAsiaMenuUseCase;Lmy/lovely/domain/usecase/GetBasketDaoDbUseCase;Lmy/lovely/domain/usecase/SortByTagUseCase;)V", "asiaMenuLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lmy/lovely/domain/model/AsiaResponse;", "asiaMenuSortedLiveData", "Ljava/util/ArrayList;", "Lmy/lovely/domain/model/Dishe;", "menu", "Landroidx/lifecycle/LiveData;", "getMenu", "()Landroidx/lifecycle/LiveData;", "progressBar", "", "getProgressBar", "progressBarLiveData", "sortedMenu", "Lkotlin/collections/ArrayList;", "getSortedMenu", "asiaMenuResponse", "Lkotlinx/coroutines/Job;", "insertDish", "dish", "Lmy/lovely/domain/model/Basket;", "sortDishes", "", "dishes", "tag", "", "app_debug"})
public final class AsiaViewModel extends androidx.lifecycle.ViewModel {
    private final my.lovely.domain.usecase.GetAsiaMenuUseCase getAsiaMenuUseCase = null;
    private final my.lovely.domain.usecase.GetBasketDaoDbUseCase getBasketDaoDbUseCase = null;
    private final my.lovely.domain.usecase.SortByTagUseCase sortByTagUseCase = null;
    private final androidx.lifecycle.MutableLiveData<my.lovely.domain.model.AsiaResponse> asiaMenuLiveData = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressBarLiveData;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<my.lovely.domain.model.Dishe>> asiaMenuSortedLiveData = null;
    
    @javax.inject.Inject
    public AsiaViewModel(@org.jetbrains.annotations.NotNull
    my.lovely.domain.usecase.GetAsiaMenuUseCase getAsiaMenuUseCase, @org.jetbrains.annotations.NotNull
    my.lovely.domain.usecase.GetBasketDaoDbUseCase getBasketDaoDbUseCase, @org.jetbrains.annotations.NotNull
    my.lovely.domain.usecase.SortByTagUseCase sortByTagUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<my.lovely.domain.model.AsiaResponse> getMenu() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getProgressBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.ArrayList<my.lovely.domain.model.Dishe>> getSortedMenu() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job asiaMenuResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insertDish(@org.jetbrains.annotations.NotNull
    my.lovely.domain.model.Basket dish) {
        return null;
    }
    
    public final void sortDishes(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<my.lovely.domain.model.Dishe> dishes, @org.jetbrains.annotations.NotNull
    java.lang.String tag) {
    }
}