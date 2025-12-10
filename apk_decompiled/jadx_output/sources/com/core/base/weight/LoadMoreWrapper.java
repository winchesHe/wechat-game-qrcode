package com.core.base.weight;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.core.base.R;
import java.util.List;

/* loaded from: classes.dex */
public class LoadMoreWrapper extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int LOADING = 1;
    public static final int LOADING_COMPLETE = 2;
    public static final int LOADING_END = 3;
    private RecyclerView.Adapter adapter;
    private final int TYPE_ITEM = 1;
    private final int TYPE_FOOTER = 2;
    private int loadState = 2;

    public LoadMoreWrapper(RecyclerView.Adapter adapter) {
        this.adapter = adapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i + 1 == getItemCount() ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return new FootViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.base_layout_refresh_footer, viewGroup, false));
        }
        return this.adapter.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
        } else if (list.get(0) instanceof String) {
            this.adapter.onBindViewHolder(viewHolder, i, list);
        } else {
            onBindViewHolder(viewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof FootViewHolder) {
            FootViewHolder footViewHolder = (FootViewHolder) viewHolder;
            int i2 = this.loadState;
            if (i2 == 1) {
                footViewHolder.pbLoading.setVisibility(0);
                footViewHolder.tvLoading.setVisibility(0);
                footViewHolder.llEnd.setVisibility(8);
                return;
            } else if (i2 == 2) {
                footViewHolder.pbLoading.setVisibility(4);
                footViewHolder.tvLoading.setVisibility(4);
                footViewHolder.llEnd.setVisibility(8);
                return;
            } else {
                if (i2 != 3) {
                    return;
                }
                footViewHolder.pbLoading.setVisibility(8);
                footViewHolder.tvLoading.setVisibility(8);
                footViewHolder.llEnd.setVisibility(0);
                return;
            }
        }
        this.adapter.onBindViewHolder(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.adapter.getItemCount() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.core.base.weight.LoadMoreWrapper.1
                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i) {
                    if (LoadMoreWrapper.this.getItemViewType(i) == 2) {
                        return gridLayoutManager.getSpanCount();
                    }
                    return 1;
                }
            });
        }
        this.adapter.onAttachedToRecyclerView(recyclerView);
    }

    private static class FootViewHolder extends RecyclerView.ViewHolder {
        LinearLayout llEnd;
        ProgressBar pbLoading;
        TextView tvLoading;

        FootViewHolder(View view) {
            super(view);
            this.pbLoading = (ProgressBar) view.findViewById(R.id.pb_loading);
            this.tvLoading = (TextView) view.findViewById(R.id.tv_loading);
            this.llEnd = (LinearLayout) view.findViewById(R.id.ll_end);
        }
    }

    public void setLoadState(int i) {
        this.loadState = i;
        notifyItemRangeChanged(this.adapter.getItemCount(), 1, 1);
    }
}
