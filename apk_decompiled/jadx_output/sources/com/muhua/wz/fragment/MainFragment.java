package com.muhua.wz.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.core.base.image.ImageLoader;
import com.core.base.image.transformation.CropCornerTransformation;
import com.muhua.wz.HomeActivity;
import com.muhua.wz.WebViewActivity;
import com.muhua.wz.bean.Banners;
import com.muhua.wz.bean.GameInfo;
import com.muhua.wz.bean.MenuList;
import com.muhua.wz.databinding.FragmentMainBinding;
import com.muhua.wz.fragment.MainFragment;
import com.muhua.wz.util.MenuUtil;
import com.muhua.wz.widget.GameAdapter;
import com.muhua.wz.widget.OnItemClickListener;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.RectangleIndicator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001bH\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\b\u0010$\u001a\u00020\u001bH\u0016J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u000bJ\u0006\u0010'\u001a\u00020\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/muhua/wz/fragment/MainFragment;", "Lcom/muhua/wz/fragment/BaseFragment;", "Lcom/muhua/wz/databinding/FragmentMainBinding;", "()V", "adapter", "Lcom/muhua/wz/widget/GameAdapter;", "getAdapter", "()Lcom/muhua/wz/widget/GameAdapter;", "setAdapter", "(Lcom/muhua/wz/widget/GameAdapter;)V", "banners", "Lcom/muhua/wz/bean/Banners;", "getBanners", "()Lcom/muhua/wz/bean/Banners;", "setBanners", "(Lcom/muhua/wz/bean/Banners;)V", "datas", "Ljava/util/ArrayList;", "Lcom/muhua/wz/bean/GameInfo;", "Lkotlin/collections/ArrayList;", "getDatas", "()Ljava/util/ArrayList;", "setDatas", "(Ljava/util/ArrayList;)V", "mMenuList", "Lcom/muhua/wz/bean/MenuList;", "initBinding", "", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initData", "initViews", "onResume", "setBanner", "t", "showBanners", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainFragment extends BaseFragment<FragmentMainBinding> {
    public GameAdapter adapter;
    private Banners banners;
    private ArrayList<GameInfo> datas = new ArrayList<>();
    private MenuList mMenuList;

    public final ArrayList<GameInfo> getDatas() {
        return this.datas;
    }

    public final void setDatas(ArrayList<GameInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.datas = arrayList;
    }

    public final GameAdapter getAdapter() {
        GameAdapter gameAdapter = this.adapter;
        if (gameAdapter != null) {
            return gameAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final void setAdapter(GameAdapter gameAdapter) {
        Intrinsics.checkNotNullParameter(gameAdapter, "<set-?>");
        this.adapter = gameAdapter;
    }

    public final Banners getBanners() {
        return this.banners;
    }

    public final void setBanners(Banners banners) {
        this.banners = banners;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Binding, com.muhua.wz.databinding.FragmentMainBinding] */
    @Override // com.muhua.wz.fragment.BaseFragment
    public void initBinding(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.binding = FragmentMainBinding.inflate(inflater, container, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.muhua.wz.fragment.BaseFragment
    public void initViews() {
        ((FragmentMainBinding) this.binding).list.setLayoutManager(new GridLayoutManager(getContext(), 4));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        setAdapter(new GameAdapter(contextRequireContext, this.datas, new OnItemClickListener() { // from class: com.muhua.wz.fragment.MainFragment.initViews.1
            @Override // com.muhua.wz.widget.OnItemClickListener
            public void onClick(int position) {
                FragmentActivity activity = MainFragment.this.getActivity();
                if (activity == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.muhua.wz.HomeActivity");
                }
                GameInfo gameInfo = MainFragment.this.getDatas().get(position);
                Intrinsics.checkNotNullExpressionValue(gameInfo, "datas[position]");
                ((HomeActivity) activity).setGame(gameInfo);
            }
        }));
        ((FragmentMainBinding) this.binding).list.setAdapter(getAdapter());
        ((FragmentMainBinding) this.binding).confirm.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.fragment.MainFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainFragment.m3148initViews$lambda0(this.f$0, view);
            }
        });
        ((FragmentMainBinding) this.binding).cancel.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.fragment.MainFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainFragment.m3149initViews$lambda1(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: initViews$lambda-0, reason: not valid java name */
    public static final void m3148initViews$lambda0(MainFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getAdapter().getFilter().filter(((FragmentMainBinding) this$0.binding).search.getEditableText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: initViews$lambda-1, reason: not valid java name */
    public static final void m3149initViews$lambda1(MainFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((FragmentMainBinding) this$0.binding).search.setText("");
        this$0.getAdapter().getFilter().filter("");
    }

    @Override // com.muhua.wz.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        showBanners();
    }

    @Override // com.muhua.wz.fragment.BaseFragment
    public void initData() {
        Map<String, GameInfo> map;
        Collection<GameInfo> collectionValues;
        MenuList menu = MenuUtil.getMenu(getContext());
        this.mMenuList = menu;
        if (menu != null && (map = menu.menu) != null && (collectionValues = map.values()) != null) {
            this.datas.addAll(collectionValues);
        }
        getAdapter().notifyDataSetChanged();
    }

    public final void setBanner(Banners t) {
        Intrinsics.checkNotNullParameter(t, "t");
        if (t.getLists() == null || t.getLists().size() == 0) {
            return;
        }
        this.banners = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showBanners() {
        if (this.banners == null) {
            return;
        }
        ((FragmentMainBinding) this.binding).banner.setVisibility(0);
        Banner bannerAddBannerLifecycleObserver = ((FragmentMainBinding) this.binding).banner.addBannerLifecycleObserver(this);
        Banners banners = this.banners;
        Intrinsics.checkNotNull(banners);
        Banner indicatorNormalColor = bannerAddBannerLifecycleObserver.setAdapter(new C04341(banners.getLists())).setIndicator(new RectangleIndicator(this.context)).setIndicatorSelectedColor(268435455).setIndicatorNormalColor(2030043135);
        Intrinsics.checkNotNull(this.banners);
        indicatorNormalColor.setLoopTime(r1.getShowDuration() * 1000);
    }

    /* compiled from: MainFragment.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/muhua/wz/fragment/MainFragment$showBanners$1", "Lcom/youth/banner/adapter/BannerImageAdapter;", "Lcom/muhua/wz/bean/Banner;", "onBindView", "", "holder", "Lcom/youth/banner/holder/BannerImageHolder;", "data", "position", "", "size", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.muhua.wz.fragment.MainFragment$showBanners$1, reason: invalid class name and case insensitive filesystem */
    public static final class C04341 extends BannerImageAdapter<com.muhua.wz.bean.Banner> {
        C04341(ArrayList<com.muhua.wz.bean.Banner> arrayList) {
            super(arrayList);
        }

        @Override // com.youth.banner.holder.IViewHolder
        public void onBindView(BannerImageHolder holder, final com.muhua.wz.bean.Banner data, int position, int size) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            ImageLoader.with(MainFragment.this.context).load(data.getImageUrl()).apply(new CropCornerTransformation(12, true)).into(holder.imageView);
            holder.imageView.setTag(data.getLinkUrl());
            ImageView imageView = holder.imageView;
            final MainFragment mainFragment = MainFragment.this;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.fragment.MainFragment$showBanners$1$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainFragment.C04341.m3150onBindView$lambda0(mainFragment, data, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onBindView$lambda-0, reason: not valid java name */
        public static final void m3150onBindView$lambda0(MainFragment this$0, com.muhua.wz.bean.Banner data, View v) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(data, "$data");
            Intrinsics.checkNotNullParameter(v, "v");
            WebViewActivity.Companion companion = WebViewActivity.INSTANCE;
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
            companion.open(contextRequireContext, data.getLinkUrl());
        }
    }
}
