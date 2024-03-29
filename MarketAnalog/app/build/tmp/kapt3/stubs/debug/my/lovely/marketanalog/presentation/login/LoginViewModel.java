package my.lovely.marketanalog.presentation.login;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import my.lovely.domain.model.RegistrationResponse;
import my.lovely.domain.usecase.RequestLoginUseCase;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lmy/lovely/marketanalog/presentation/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "requestLoginUseCase", "Lmy/lovely/domain/usecase/RequestLoginUseCase;", "(Lmy/lovely/domain/usecase/RequestLoginUseCase;)V", "login", "Landroidx/lifecycle/LiveData;", "Lmy/lovely/domain/model/RegistrationResponse;", "getLogin", "()Landroidx/lifecycle/LiveData;", "progressBar", "", "getProgressBar", "progressBarLiveData", "Landroidx/lifecycle/MutableLiveData;", "requestLoginLiveData", "sendPostLogin", "Lkotlinx/coroutines/Job;", "", "password", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final my.lovely.domain.usecase.RequestLoginUseCase requestLoginUseCase = null;
    private androidx.lifecycle.MutableLiveData<my.lovely.domain.model.RegistrationResponse> requestLoginLiveData;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressBarLiveData;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    my.lovely.domain.usecase.RequestLoginUseCase requestLoginUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<my.lovely.domain.model.RegistrationResponse> getLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getProgressBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job sendPostLogin(@org.jetbrains.annotations.NotNull
    java.lang.String login, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
}