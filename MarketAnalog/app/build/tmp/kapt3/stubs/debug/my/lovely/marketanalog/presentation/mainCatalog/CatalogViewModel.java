package my.lovely.marketanalog.presentation.mainCatalog;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import my.lovely.domain.model.DataResponse;
import my.lovely.domain.usecase.GetCatalogUseCase;
import my.lovely.domain.usecase.GetDateUseCase;
import my.lovely.domain.usecase.GetLocationUseCase;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u0012\u001a\u00020\u001dJ\u0006\u0010\u0015\u001a\u00020\u001dR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lmy/lovely/marketanalog/presentation/mainCatalog/CatalogViewModel;", "Landroidx/lifecycle/ViewModel;", "getCatalogUseCase", "Lmy/lovely/domain/usecase/GetCatalogUseCase;", "getDateUseCase", "Lmy/lovely/domain/usecase/GetDateUseCase;", "getLocationUseCase", "Lmy/lovely/domain/usecase/GetLocationUseCase;", "(Lmy/lovely/domain/usecase/GetCatalogUseCase;Lmy/lovely/domain/usecase/GetDateUseCase;Lmy/lovely/domain/usecase/GetLocationUseCase;)V", "catalog", "Landroidx/lifecycle/LiveData;", "Lmy/lovely/domain/model/DataResponse;", "getCatalog", "()Landroidx/lifecycle/LiveData;", "catalogLiveData", "Landroidx/lifecycle/MutableLiveData;", "date", "", "getDate", "dateLiveData", "location", "getLocation", "locationLiveData", "progressBar", "", "getProgressBar", "progressBarLiveData", "catalogResponse", "Lkotlinx/coroutines/Job;", "", "app_debug"})
public final class CatalogViewModel extends androidx.lifecycle.ViewModel {
    private final my.lovely.domain.usecase.GetCatalogUseCase getCatalogUseCase = null;
    private final my.lovely.domain.usecase.GetDateUseCase getDateUseCase = null;
    private final my.lovely.domain.usecase.GetLocationUseCase getLocationUseCase = null;
    private final androidx.lifecycle.MutableLiveData<my.lovely.domain.model.DataResponse> catalogLiveData = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressBarLiveData;
    private androidx.lifecycle.MutableLiveData<java.lang.String> dateLiveData;
    private androidx.lifecycle.MutableLiveData<java.lang.String> locationLiveData;
    
    @javax.inject.Inject
    public CatalogViewModel(@org.jetbrains.annotations.NotNull
    my.lovely.domain.usecase.GetCatalogUseCase getCatalogUseCase, @org.jetbrains.annotations.NotNull
    my.lovely.domain.usecase.GetDateUseCase getDateUseCase, @org.jetbrains.annotations.NotNull
    my.lovely.domain.usecase.GetLocationUseCase getLocationUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<my.lovely.domain.model.DataResponse> getCatalog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getProgressBar() {
        return null;
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
    public final kotlinx.coroutines.Job catalogResponse() {
        return null;
    }
    
    public final void getDate() {
    }
    
    public final void getLocation() {
    }
}