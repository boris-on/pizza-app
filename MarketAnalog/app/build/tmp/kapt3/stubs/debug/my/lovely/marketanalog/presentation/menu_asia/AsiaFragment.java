package my.lovely.marketanalog.presentation.menu_asia;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.*;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import dagger.hilt.android.AndroidEntryPoint;
import my.lovely.domain.model.Basket;
import my.lovely.domain.model.Dishe;
import my.lovely.domain.model.Tag;
import my.lovely.marketanalog.R;
import my.lovely.marketanalog.databinding.FragmentAsiaMenuBinding;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lmy/lovely/marketanalog/presentation/menu_asia/AsiaFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lmy/lovely/marketanalog/presentation/menu_asia/AsiaAdapter;", "asiaViewModel", "Lmy/lovely/marketanalog/presentation/menu_asia/AsiaViewModel;", "getAsiaViewModel", "()Lmy/lovely/marketanalog/presentation/menu_asia/AsiaViewModel;", "asiaViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lmy/lovely/marketanalog/databinding/FragmentAsiaMenuBinding;", "btErrorTryAgain", "Landroid/widget/Button;", "dishesList", "Ljava/util/ArrayList;", "Lmy/lovely/domain/model/Dishe;", "errorContainer", "Landroid/widget/LinearLayout;", "list", "Lmy/lovely/domain/model/Tag;", "tagAdapter", "Lmy/lovely/marketanalog/presentation/menu_asia/TagAdapter;", "addToBasketDish", "", "position", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showInfoAboutDish", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class AsiaFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy asiaViewModel$delegate = null;
    private my.lovely.marketanalog.databinding.FragmentAsiaMenuBinding binding;
    private my.lovely.marketanalog.presentation.menu_asia.AsiaAdapter adapter;
    private my.lovely.marketanalog.presentation.menu_asia.TagAdapter tagAdapter;
    private android.widget.LinearLayout errorContainer;
    private android.widget.Button btErrorTryAgain;
    private java.util.ArrayList<my.lovely.domain.model.Dishe> dishesList;
    private java.util.ArrayList<my.lovely.domain.model.Tag> list;
    
    public AsiaFragment() {
        super();
    }
    
    private final my.lovely.marketanalog.presentation.menu_asia.AsiaViewModel getAsiaViewModel() {
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
    
    private final void showInfoAboutDish(int position) {
    }
    
    private final void addToBasketDish(int position) {
    }
}