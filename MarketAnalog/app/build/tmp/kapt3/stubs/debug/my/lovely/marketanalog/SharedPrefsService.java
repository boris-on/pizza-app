package my.lovely.marketanalog;

import android.content.Context;
import android.content.SharedPreferences;
import my.lovely.marketanalog.app.App;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\r\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rJ\u001a\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lmy/lovely/marketanalog/SharedPrefsService;", "", "()V", "USER_ADRES", "", "USER_EMAIL", "USER_LOGIN", "USER_LOGIN_VALUE", "USER_NAME", "USER_NUMBER", "appSharedPreference", "Landroid/content/SharedPreferences;", "getIsUserLogin", "", "()Ljava/lang/Boolean;", "getString", "key", "getUserAdres", "getUserEmail", "getUserLogin", "getUserName", "getUserNumber", "putIsUserLogin", "", "value", "putString", "putUserAdres", "putUserEmail", "putUserLogin", "putUserName", "putUserNumber", "app_debug"})
public final class SharedPrefsService {
    @org.jetbrains.annotations.NotNull
    public static final my.lovely.marketanalog.SharedPrefsService INSTANCE = null;
    private static final java.lang.String USER_LOGIN = "IS_LOGIN";
    private static final java.lang.String USER_NAME = "USER_NAME";
    private static final java.lang.String USER_NUMBER = "USER_NUMBER";
    private static final java.lang.String USER_ADRES = "USER_ADRES";
    private static final java.lang.String USER_EMAIL = "USER_EMAIL";
    private static final java.lang.String USER_LOGIN_VALUE = "USER_LOGIN";
    private static final android.content.SharedPreferences appSharedPreference = null;
    
    private SharedPrefsService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIsUserLogin() {
        return null;
    }
    
    public final void putIsUserLogin(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserAdres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserLogin() {
        return null;
    }
    
    public final void putUserAdres(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void putUserNumber(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void putUserName(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void putUserEmail(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void putUserLogin(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    private final java.lang.String getString(java.lang.String key) {
        return null;
    }
    
    private final void putString(java.lang.String key, java.lang.String value) {
    }
}