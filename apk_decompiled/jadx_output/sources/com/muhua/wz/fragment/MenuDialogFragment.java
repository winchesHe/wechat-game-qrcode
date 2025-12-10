package com.muhua.wz.fragment;

import android.content.DialogInterface;
import android.graphics.drawable.VectorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.info.wz.R;
import com.muhua.wz.bean.GameInfo;
import com.muhua.wz.filter.NameFilter;
import com.muhua.wz.menu.MenuAdapter;
import com.muhua.wz.util.DimenUtil;
import java.util.Arrays;

/* loaded from: classes.dex */
public class MenuDialogFragment extends BaseDialogFragment implements AdapterView.OnItemClickListener {
    private View mContentView;
    private ListView mListView;
    private MenuClickListener mListener;
    private MenuAdapter mMenuAdapter;
    private boolean mNeedReset;
    private String mSearchStr;
    private EditText mSearchView;
    private TextView mUpdateView;

    public interface MenuClickListener {
        void onGameSelect(GameInfo gameInfo);

        void onGameUpdateClick();
    }

    static /* synthetic */ boolean lambda$onCreateView$1(TextView textView, int i, KeyEvent keyEvent) {
        return true;
    }

    @Override // android.app.DialogFragment
    public int getTheme() {
        return R.style.menu_dialog_style;
    }

    public static MenuDialogFragment getInstance(MenuAdapter menuAdapter, MenuClickListener menuClickListener) {
        MenuDialogFragment menuDialogFragment = new MenuDialogFragment();
        menuDialogFragment.setMenuClickListener(menuClickListener);
        menuDialogFragment.setMenuAdapter(menuAdapter);
        return menuDialogFragment;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.mContentView == null) {
            View viewInflate = layoutInflater.inflate(R.layout.menu_list, viewGroup, false);
            this.mContentView = viewInflate;
            this.mListView = (ListView) viewInflate.findViewById(R.id.list);
            TextView textView = (TextView) this.mContentView.findViewById(R.id.tv_update);
            this.mUpdateView = textView;
            VectorDrawable vectorDrawable = (VectorDrawable) textView.getCompoundDrawables()[0];
            vectorDrawable.setTint(getResources().getColor(R.color.colorPrimary));
            int iDp2Px = DimenUtil.Dp2Px(getActivity(), 18.0f);
            vectorDrawable.setBounds(0, 0, iDp2Px, iDp2Px);
            this.mUpdateView.setCompoundDrawables(vectorDrawable, null, null, null);
            this.mUpdateView.setText(getString(R.string.update_game, new Object[]{Integer.valueOf(this.mMenuAdapter.getOriginalCount())}));
            this.mUpdateView.setOnClickListener(new View.OnClickListener() { // from class: com.muhua.wz.fragment.MenuDialogFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m3151lambda$onCreateView$0$commuhuawzfragmentMenuDialogFragment(view);
                }
            });
            EditText editText = (EditText) this.mContentView.findViewById(R.id.et_search);
            this.mSearchView = editText;
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(editText.getFilters(), this.mSearchView.getFilters().length + 1);
            inputFilterArr[inputFilterArr.length - 1] = new NameFilter();
            this.mSearchView.setFilters(inputFilterArr);
            this.mSearchView.addTextChangedListener(new AnonymousClass1());
            this.mSearchView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.muhua.wz.fragment.MenuDialogFragment$$ExternalSyntheticLambda2
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                    return MenuDialogFragment.lambda$onCreateView$1(textView2, i, keyEvent);
                }
            });
            this.mListView.setAdapter((ListAdapter) this.mMenuAdapter);
            this.mListView.setOnItemClickListener(this);
        }
        if (this.mContentView.getParent() != null) {
            ((ViewGroup) this.mContentView.getParent()).removeView(this.mContentView);
        }
        return this.mContentView;
    }

    /* renamed from: lambda$onCreateView$0$com-muhua-wz-fragment-MenuDialogFragment, reason: not valid java name */
    /* synthetic */ void m3151lambda$onCreateView$0$commuhuawzfragmentMenuDialogFragment(View view) {
        MenuClickListener menuClickListener = this.mListener;
        if (menuClickListener != null) {
            menuClickListener.onGameUpdateClick();
        }
        dismissAllowingStateLoss();
    }

    /* renamed from: com.muhua.wz.fragment.MenuDialogFragment$1, reason: invalid class name */
    class AnonymousClass1 implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        AnonymousClass1() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (MenuDialogFragment.this.mMenuAdapter != null) {
                MenuDialogFragment.this.mMenuAdapter.getFilter().filter(editable, new Filter.FilterListener() { // from class: com.muhua.wz.fragment.MenuDialogFragment$1$$ExternalSyntheticLambda0
                    @Override // android.widget.Filter.FilterListener
                    public final void onFilterComplete(int i) {
                        this.f$0.m3153x1666c094(i);
                    }
                });
            }
        }

        /* renamed from: lambda$afterTextChanged$0$com-muhua-wz-fragment-MenuDialogFragment$1, reason: not valid java name */
        /* synthetic */ void m3153x1666c094(int i) {
            if (MenuDialogFragment.this.isVisible()) {
                MenuDialogFragment.this.setSelection(0);
            }
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        getDialog().setCanceledOnTouchOutside(true);
        window.setGravity(85);
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = getActivity().getResources().getDimensionPixelSize(R.dimen.menu_width);
        attributes.height = -1;
        window.setSoftInputMode(16);
        setSearchStr(this.mSearchStr);
        this.mUpdateView.setText(getString(R.string.update_game, new Object[]{Integer.valueOf(this.mMenuAdapter.getOriginalCount())}));
        if (this.mNeedReset) {
            setSelection(0);
        }
        this.mNeedReset = false;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            window.getAttributes().windowAnimations = R.style.menu_dialog_style;
        }
    }

    @Override // com.muhua.wz.fragment.BaseDialogFragment, android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        EditText editText = this.mSearchView;
        if (editText != null) {
            this.mSearchStr = editText.getText().toString();
        }
    }

    public void setMenuAdapter(MenuAdapter menuAdapter) {
        this.mMenuAdapter = menuAdapter;
    }

    public void setMenuClickListener(MenuClickListener menuClickListener) {
        this.mListener = menuClickListener;
    }

    public void setSearchStr(String str) {
        if (TextUtils.isEmpty(str)) {
            this.mSearchStr = "";
        } else {
            this.mSearchStr = str;
        }
        EditText editText = this.mSearchView;
        if (editText == null || this.mSearchStr.equals(editText.getText().toString())) {
            return;
        }
        this.mSearchView.setText(this.mSearchStr);
        this.mSearchView.setSelection(this.mSearchStr.length());
    }

    public void resetView() {
        this.mNeedReset = true;
        setSearchStr("");
        TextView textView = this.mUpdateView;
        if (textView != null) {
            textView.setText(textView.getContext().getString(R.string.update_game, Integer.valueOf(this.mMenuAdapter.getOriginalCount())));
        }
        setSelection(0);
    }

    public void setSelection(final int i) {
        if (this.mListener != null) {
            this.mListView.post(new Runnable() { // from class: com.muhua.wz.fragment.MenuDialogFragment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3152lambda$setSelection$2$commuhuawzfragmentMenuDialogFragment(i);
                }
            });
        }
    }

    /* renamed from: lambda$setSelection$2$com-muhua-wz-fragment-MenuDialogFragment, reason: not valid java name */
    /* synthetic */ void m3152lambda$setSelection$2$commuhuawzfragmentMenuDialogFragment(int i) {
        ListView listView = this.mListView;
        if (listView != null) {
            listView.setSelection(i);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.mListener != null && i >= 0 && i < this.mMenuAdapter.getCount()) {
            this.mListener.onGameSelect(this.mMenuAdapter.getItem(i));
        }
        dismissAllowingStateLoss();
    }
}
