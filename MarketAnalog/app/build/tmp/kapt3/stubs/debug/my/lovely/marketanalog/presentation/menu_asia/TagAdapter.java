package my.lovely.marketanalog.presentation.menu_asia;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import my.lovely.domain.model.Tag;
import my.lovely.marketanalog.R;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0007J\u0014\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lmy/lovely/marketanalog/presentation/menu_asia/TagAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lmy/lovely/marketanalog/presentation/menu_asia/TagAdapter$TagViewHolder;", "()V", "context", "Landroid/content/Context;", "tagListener", "Lmy/lovely/marketanalog/presentation/menu_asia/TagAdapter$OnItemClickListener;", "tagsList", "", "Lmy/lovely/domain/model/Tag;", "getTagsList", "()Ljava/util/List;", "setTagsList", "(Ljava/util/List;)V", "getItemCount", "", "isAnyItemExpanded", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "setTagList", "tag", "", "OnItemClickListener", "TagViewHolder", "app_debug"})
public final class TagAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<my.lovely.marketanalog.presentation.menu_asia.TagAdapter.TagViewHolder> {
    private android.content.Context context;
    private my.lovely.marketanalog.presentation.menu_asia.TagAdapter.OnItemClickListener tagListener;
    @org.jetbrains.annotations.NotNull
    private java.util.List<my.lovely.domain.model.Tag> tagsList;
    
    public TagAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<my.lovely.domain.model.Tag> getTagsList() {
        return null;
    }
    
    public final void setTagsList(@org.jetbrains.annotations.NotNull
    java.util.List<my.lovely.domain.model.Tag> p0) {
    }
    
    public final void setTagList(@org.jetbrains.annotations.NotNull
    java.util.List<my.lovely.domain.model.Tag> tag) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public my.lovely.marketanalog.presentation.menu_asia.TagAdapter.TagViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    my.lovely.marketanalog.presentation.menu_asia.TagAdapter.TagViewHolder holder, int position) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull
    my.lovely.marketanalog.presentation.menu_asia.TagAdapter.OnItemClickListener listener) {
    }
    
    private final void isAnyItemExpanded(int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lmy/lovely/marketanalog/presentation/menu_asia/TagAdapter$TagViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "cardView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getCardView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "tvTagName", "Landroid/widget/TextView;", "getTvTagName", "()Landroid/widget/TextView;", "app_debug"})
    public static final class TagViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView tvTagName = null;
        @org.jetbrains.annotations.NotNull
        private final androidx.constraintlayout.widget.ConstraintLayout cardView = null;
        
        public TagViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTvTagName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.constraintlayout.widget.ConstraintLayout getCardView() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lmy/lovely/marketanalog/presentation/menu_asia/TagAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(int position);
    }
}