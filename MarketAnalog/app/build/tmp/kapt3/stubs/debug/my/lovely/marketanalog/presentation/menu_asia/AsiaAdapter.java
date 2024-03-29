package my.lovely.marketanalog.presentation.menu_asia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import my.lovely.domain.model.Dishe;
import my.lovely.marketanalog.R;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0014\u0010\u0019\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bJ\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lmy/lovely/marketanalog/presentation/menu_asia/AsiaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lmy/lovely/marketanalog/presentation/menu_asia/AsiaAdapter$AsiaViewHolder;", "()V", "asianList", "", "Lmy/lovely/domain/model/Dishe;", "getAsianList", "()Ljava/util/List;", "setAsianList", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "menuListener", "Lmy/lovely/marketanalog/presentation/menu_asia/AsiaAdapter$OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAsiaList", "dish", "", "setOnItemClickListener", "listener", "AsiaViewHolder", "OnItemClickListener", "app_debug"})
public final class AsiaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<my.lovely.marketanalog.presentation.menu_asia.AsiaAdapter.AsiaViewHolder> {
    private android.content.Context context;
    private my.lovely.marketanalog.presentation.menu_asia.AsiaAdapter.OnItemClickListener menuListener;
    @org.jetbrains.annotations.NotNull
    private java.util.List<my.lovely.domain.model.Dishe> asianList;
    
    public AsiaAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<my.lovely.domain.model.Dishe> getAsianList() {
        return null;
    }
    
    public final void setAsianList(@org.jetbrains.annotations.NotNull
    java.util.List<my.lovely.domain.model.Dishe> p0) {
    }
    
    public final void setAsiaList(@org.jetbrains.annotations.NotNull
    java.util.List<my.lovely.domain.model.Dishe> dish) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public my.lovely.marketanalog.presentation.menu_asia.AsiaAdapter.AsiaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    my.lovely.marketanalog.presentation.menu_asia.AsiaAdapter.AsiaViewHolder holder, int position) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull
    my.lovely.marketanalog.presentation.menu_asia.AsiaAdapter.OnItemClickListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lmy/lovely/marketanalog/presentation/menu_asia/AsiaAdapter$AsiaViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "listener", "Lmy/lovely/marketanalog/presentation/menu_asia/AsiaAdapter$OnItemClickListener;", "(Landroid/view/View;Lmy/lovely/marketanalog/presentation/menu_asia/AsiaAdapter$OnItemClickListener;)V", "imAsiaMenu", "Landroid/widget/ImageView;", "getImAsiaMenu", "()Landroid/widget/ImageView;", "tvMenuName", "Landroid/widget/TextView;", "getTvMenuName", "()Landroid/widget/TextView;", "app_debug"})
    public static final class AsiaViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView imAsiaMenu = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView tvMenuName = null;
        
        public AsiaViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView, @org.jetbrains.annotations.NotNull
        my.lovely.marketanalog.presentation.menu_asia.AsiaAdapter.OnItemClickListener listener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getImAsiaMenu() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTvMenuName() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lmy/lovely/marketanalog/presentation/menu_asia/AsiaAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(int position);
    }
}