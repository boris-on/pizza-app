package my.lovely.marketanalog.presentation.basket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import my.lovely.domain.model.Basket;
import my.lovely.marketanalog.R;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0014\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cJ\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u000eJ\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lmy/lovely/marketanalog/presentation/basket/BasketAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lmy/lovely/marketanalog/presentation/basket/BasketAdapter$BasketViewHolder;", "()V", "basketDishesList", "", "Lmy/lovely/domain/model/Basket;", "getBasketDishesList", "()Ljava/util/List;", "setBasketDishesList", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "minusBasketListener", "Lmy/lovely/marketanalog/presentation/basket/BasketAdapter$OnItemClickListener;", "plusBasketListener", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setBasketList", "basket", "", "setOnMinusClickListener", "listener", "setOnPlusBookListener", "BasketViewHolder", "OnItemClickListener", "app_debug"})
public final class BasketAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<my.lovely.marketanalog.presentation.basket.BasketAdapter.BasketViewHolder> {
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull
    private java.util.List<my.lovely.domain.model.Basket> basketDishesList;
    private my.lovely.marketanalog.presentation.basket.BasketAdapter.OnItemClickListener minusBasketListener;
    private my.lovely.marketanalog.presentation.basket.BasketAdapter.OnItemClickListener plusBasketListener;
    
    public BasketAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<my.lovely.domain.model.Basket> getBasketDishesList() {
        return null;
    }
    
    public final void setBasketDishesList(@org.jetbrains.annotations.NotNull
    java.util.List<my.lovely.domain.model.Basket> p0) {
    }
    
    public final void setBasketList(@org.jetbrains.annotations.NotNull
    java.util.List<my.lovely.domain.model.Basket> basket) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public my.lovely.marketanalog.presentation.basket.BasketAdapter.BasketViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    my.lovely.marketanalog.presentation.basket.BasketAdapter.BasketViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnMinusClickListener(@org.jetbrains.annotations.NotNull
    my.lovely.marketanalog.presentation.basket.BasketAdapter.OnItemClickListener listener) {
    }
    
    public final void setOnPlusBookListener(@org.jetbrains.annotations.NotNull
    my.lovely.marketanalog.presentation.basket.BasketAdapter.OnItemClickListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lmy/lovely/marketanalog/presentation/basket/BasketAdapter$BasketViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "minuslistener", "Lmy/lovely/marketanalog/presentation/basket/BasketAdapter$OnItemClickListener;", "plusListener", "(Landroid/view/View;Lmy/lovely/marketanalog/presentation/basket/BasketAdapter$OnItemClickListener;Lmy/lovely/marketanalog/presentation/basket/BasketAdapter$OnItemClickListener;)V", "btMinus", "Landroid/widget/ImageButton;", "btPlus", "imDishImage", "Landroid/widget/ImageView;", "getImDishImage", "()Landroid/widget/ImageView;", "tvDishCount", "Landroid/widget/TextView;", "getTvDishCount", "()Landroid/widget/TextView;", "tvDishName", "getTvDishName", "tvDishPrice", "getTvDishPrice", "tvDishWeight", "getTvDishWeight", "app_debug"})
    public static final class BasketViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView tvDishName = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView tvDishPrice = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView tvDishWeight = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView tvDishCount = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView imDishImage = null;
        private final android.widget.ImageButton btPlus = null;
        private final android.widget.ImageButton btMinus = null;
        
        public BasketViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView, @org.jetbrains.annotations.NotNull
        my.lovely.marketanalog.presentation.basket.BasketAdapter.OnItemClickListener minuslistener, @org.jetbrains.annotations.NotNull
        my.lovely.marketanalog.presentation.basket.BasketAdapter.OnItemClickListener plusListener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTvDishName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTvDishPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTvDishWeight() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTvDishCount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getImDishImage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lmy/lovely/marketanalog/presentation/basket/BasketAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(int position);
    }
}