package my.lovely.marketanalog.presentation.card;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.Dispatchers;
import my.lovely.domain.usecase.GetBasketDaoDbUseCase;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lmy/lovely/marketanalog/presentation/card/CardViewModel;", "Landroidx/lifecycle/ViewModel;", "getBasketDaoDbUseCase", "Lmy/lovely/domain/usecase/GetBasketDaoDbUseCase;", "(Lmy/lovely/domain/usecase/GetBasketDaoDbUseCase;)V", "clearDB", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class CardViewModel extends androidx.lifecycle.ViewModel {
    private final my.lovely.domain.usecase.GetBasketDaoDbUseCase getBasketDaoDbUseCase = null;
    
    @javax.inject.Inject
    public CardViewModel(@org.jetbrains.annotations.NotNull
    my.lovely.domain.usecase.GetBasketDaoDbUseCase getBasketDaoDbUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job clearDB() {
        return null;
    }
}