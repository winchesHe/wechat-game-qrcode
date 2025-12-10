package com.core.base.weight;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class EndlessRecyclerOnScrollListener extends RecyclerView.OnScrollListener {
    private boolean isSlidingUpward = false;
    private boolean isFirstTimeCall = true;

    public abstract void onLoadMore();

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (i == 0) {
            if (!this.isFirstTimeCall) {
                return;
            }
            if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1 && this.isSlidingUpward) {
                onLoadMore();
                this.isFirstTimeCall = false;
            }
        }
        if (i == 1) {
            this.isFirstTimeCall = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        this.isSlidingUpward = i2 > 0 || i > 0;
    }
}
