package com.muhua.wz.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.muhua.wz.databinding.MenuItemBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameAdapter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/muhua/wz/widget/GameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/muhua/wz/databinding/MenuItemBinding;", "(Lcom/muhua/wz/databinding/MenuItemBinding;)V", "getBinding", "()Lcom/muhua/wz/databinding/MenuItemBinding;", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GameViewHolder extends RecyclerView.ViewHolder {
    private final MenuItemBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewHolder(MenuItemBinding binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public final MenuItemBinding getBinding() {
        return this.binding;
    }
}
