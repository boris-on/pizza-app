package my.lovely.marketanalog.presentation.mainCatalog;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.hilt.android.AndroidEntryPoint;
import my.lovely.marketanalog.R;
import my.lovely.marketanalog.databinding.FragmentCatalogBinding;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0016J\u0006\u0010\u001d\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lmy/lovely/marketanalog/presentation/mainCatalog/CatalogFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lmy/lovely/marketanalog/presentation/mainCatalog/CatalogAdapter;", "binding", "Lmy/lovely/marketanalog/databinding/FragmentCatalogBinding;", "btErrorTryAgain", "Landroid/widget/Button;", "bundle", "Landroid/os/Bundle;", "catalogViewModel", "Lmy/lovely/marketanalog/presentation/mainCatalog/CatalogViewModel;", "getCatalogViewModel", "()Lmy/lovely/marketanalog/presentation/mainCatalog/CatalogViewModel;", "catalogViewModel$delegate", "Lkotlin/Lazy;", "errorContainer", "Landroid/widget/LinearLayout;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "onViewCreated", "", "view", "requestPermission", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class CatalogFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy catalogViewModel$delegate = null;
    private my.lovely.marketanalog.presentation.mainCatalog.CatalogAdapter adapter;
    private my.lovely.marketanalog.databinding.FragmentCatalogBinding binding;
    private android.os.Bundle bundle;
    private android.widget.LinearLayout errorContainer;
    private android.widget.Button btErrorTryAgain;
    
    public CatalogFragment() {
        super();
    }
    
    private final my.lovely.marketanalog.presentation.mainCatalog.CatalogViewModel getCatalogViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void requestPermission() {
    }
}