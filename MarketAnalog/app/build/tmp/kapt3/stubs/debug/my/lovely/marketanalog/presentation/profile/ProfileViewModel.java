package my.lovely.marketanalog.presentation.profile;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import my.lovely.domain.model.UserResponse;
import my.lovely.domain.usecase.RequestRegistrationUseCase;
import my.lovely.domain.usecase.ResponseUserInfoUseCase;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lmy/lovely/marketanalog/presentation/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "responseUserInfoUseCase", "Lmy/lovely/domain/usecase/ResponseUserInfoUseCase;", "(Lmy/lovely/domain/usecase/ResponseUserInfoUseCase;)V", "progressBar", "Landroidx/lifecycle/LiveData;", "", "getProgressBar", "()Landroidx/lifecycle/LiveData;", "progressBarLiveData", "Landroidx/lifecycle/MutableLiveData;", "requestUserInfoLiveData", "Lmy/lovely/domain/model/UserResponse;", "userInfo", "getUserInfo", "Lkotlinx/coroutines/Job;", "login", "", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    private final my.lovely.domain.usecase.ResponseUserInfoUseCase responseUserInfoUseCase = null;
    private androidx.lifecycle.MutableLiveData<my.lovely.domain.model.UserResponse> requestUserInfoLiveData;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressBarLiveData;
    
    @javax.inject.Inject
    public ProfileViewModel(@org.jetbrains.annotations.NotNull
    my.lovely.domain.usecase.ResponseUserInfoUseCase responseUserInfoUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<my.lovely.domain.model.UserResponse> getUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getProgressBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getUserInfo(@org.jetbrains.annotations.NotNull
    java.lang.String login) {
        return null;
    }
}