package com.muhua.wz.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import androidx.recyclerview.widget.RecyclerView;
import com.core.base.utils.SystemUtils;
import com.muhua.wz.bean.GameInfo;
import com.muhua.wz.databinding.MenuItemBinding;
import com.muhua.wz.util.ImageLoaderUtil;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameAdapter.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010!\u001a\u00020\u001cH\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001cH\u0016J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001cH\u0016R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00060\u0011R\u00020\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006+"}, d2 = {"Lcom/muhua/wz/widget/GameAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/muhua/wz/widget/GameViewHolder;", "context", "Landroid/content/Context;", "datas", "Ljava/util/ArrayList;", "Lcom/muhua/wz/bean/GameInfo;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/muhua/wz/widget/OnItemClickListener;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/muhua/wz/widget/OnItemClickListener;)V", "getDatas", "()Ljava/util/ArrayList;", "setDatas", "(Ljava/util/ArrayList;)V", "filter", "Lcom/muhua/wz/widget/GameAdapter$ArrayFilter;", "getFilter", "()Lcom/muhua/wz/widget/GameAdapter$ArrayFilter;", "setFilter", "(Lcom/muhua/wz/widget/GameAdapter$ArrayFilter;)V", "getListener", "()Lcom/muhua/wz/widget/OnItemClickListener;", "origins", "getOrigins", "setOrigins", "widht", "", "getWidht", "()I", "setWidht", "(I)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ArrayFilter", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GameAdapter extends RecyclerView.Adapter<GameViewHolder> {
    private ArrayList<GameInfo> datas;
    private ArrayFilter filter;
    private final OnItemClickListener listener;
    private ArrayList<GameInfo> origins;
    private int widht;

    public final int getWidht() {
        return this.widht;
    }

    public final void setWidht(int i) {
        this.widht = i;
    }

    public final ArrayList<GameInfo> getDatas() {
        return this.datas;
    }

    public final void setDatas(ArrayList<GameInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.datas = arrayList;
    }

    public final ArrayList<GameInfo> getOrigins() {
        return this.origins;
    }

    public final void setOrigins(ArrayList<GameInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.origins = arrayList;
    }

    public final ArrayFilter getFilter() {
        return this.filter;
    }

    public final void setFilter(ArrayFilter arrayFilter) {
        Intrinsics.checkNotNullParameter(arrayFilter, "<set-?>");
        this.filter = arrayFilter;
    }

    public final OnItemClickListener getListener() {
        return this.listener;
    }

    public GameAdapter(Context context, ArrayList<GameInfo> datas, OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(datas, "datas");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.widht = ((SystemUtils.INSTANCE.getWidthPixels(context) - SystemUtils.INSTANCE.dp2px(30.0f)) / 4) - SystemUtils.INSTANCE.dp2px(30.0f);
        this.datas = datas;
        this.filter = new ArrayFilter();
        this.origins = new ArrayList<>();
        this.listener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        MenuItemBinding menuItemBindingInflate = MenuItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(menuItemBindingInflate, "inflate(LayoutInflater.f…t.context),parent, false)");
        menuItemBindingInflate.ivIcon.getLayoutParams().width = this.widht;
        menuItemBindingInflate.ivIcon.getLayoutParams().height = this.widht;
        return new GameViewHolder(menuItemBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.datas.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GameViewHolder holder, final int position) throws NoSuchFieldException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        GameInfo gameInfo = this.datas.get(position);
        Intrinsics.checkNotNullExpressionValue(gameInfo, "datas.get(position)");
        GameInfo gameInfo2 = gameInfo;
        holder.getBinding().tvTitle.setText(gameInfo2.name);
        ImageLoaderUtil.getInstance().loadImage(gameInfo2.icon, holder.getBinding().ivIcon, true, "menu");
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.widget.GameAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameAdapter.m3159onBindViewHolder$lambda0(this.f$0, position, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0, reason: not valid java name */
    public static final void m3159onBindViewHolder$lambda0(GameAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.listener.onClick(i);
    }

    /* compiled from: GameAdapter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/muhua/wz/widget/GameAdapter$ArrayFilter;", "Landroid/widget/Filter;", "(Lcom/muhua/wz/widget/GameAdapter;)V", "performFiltering", "Landroid/widget/Filter$FilterResults;", "prefix", "", "publishResults", "", "constraint", "results", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ArrayFilter extends Filter {
        public ArrayFilter() {
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
        @Override // android.widget.Filter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r15) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.muhua.wz.widget.GameAdapter.ArrayFilter.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence constraint, Filter.FilterResults results) {
            Intrinsics.checkNotNullParameter(constraint, "constraint");
            Intrinsics.checkNotNullParameter(results, "results");
            GameAdapter.this.getDatas().clear();
            ArrayList<GameInfo> datas = GameAdapter.this.getDatas();
            Object obj = results.values;
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Collection<com.muhua.wz.bean.GameInfo>");
            }
            datas.addAll((Collection) obj);
            GameAdapter.this.notifyDataSetChanged();
        }
    }
}
