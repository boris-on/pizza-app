package my.lovely.marketanalog.presentation.registration;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import my.lovely.domain.usecase.RequestRegistrationUseCase;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lmy/lovely/marketanalog/presentation/registration/RegistrationViewModel;", "Landroidx/lifecycle/ViewModel;", "requestRegistrationUseCase", "Lmy/lovely/domain/usecase/RequestRegistrationUseCase;", "(Lmy/lovely/domain/usecase/RequestRegistrationUseCase;)V", "progressBar", "Landroidx/lifecycle/LiveData;", "", "getProgressBar", "()Landroidx/lifecycle/LiveData;", "progressBarLiveData", "Landroidx/lifecycle/MutableLiveData;", "registration", "", "getRegistration", "requestRegistrationLiveData", "sendPostRegistration", "Lkotlinx/coroutines/Job;", "login", "", "password", "email", "number", "adress", "app_debug"})
public final class RegistrationViewModel extends androidx.lifecycle.ViewModel {
    private final my.lovely.domain.usecase.RequestRegistrationUseCase requestRegistrationUseCase = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> requestRegistrationLiveData;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressBarLiveData;
    
    @javax.inject.Inject
    public RegistrationViewModel(@org.jetbrains.annotations.NotNull
    my.lovely.domain.usecase.RequestRegistrationUseCase requestRegistrationUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getRegistration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getProgressBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job sendPostRegistration(@org.jetbrains.annotations.NotNull
    java.lang.String login, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String email, int number, @org.jetbrains.annotations.NotNull
    java.lang.String adress) {
        return null;
    }
}