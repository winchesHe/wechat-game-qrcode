package com.baidu.mobstat;

import android.text.TextUtils;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class cd {
    private static final cd b = new cd();
    private HashMap<String, String> a = new HashMap<>();

    public static cd a() {
        return b;
    }

    private cd() {
        b();
    }

    private void a(Throwable th) {
        if (ci.c().b()) {
            ci.c().b(th.toString());
        }
    }

    private void b() {
        if (this.a.size() != 0) {
            return;
        }
        try {
            a("AutoCompleteTextView", "A0");
        } catch (Throwable th) {
            a(th);
        }
        try {
            a("ActionBar", "A1");
        } catch (Throwable th2) {
            a(th2);
        }
        try {
            a("AlertDialog", "A2");
        } catch (Throwable th3) {
            a(th3);
        }
        try {
            a("Button", "B0");
        } catch (Throwable th4) {
            a(th4);
        }
        try {
            a("CheckBox", "C0");
        } catch (Throwable th5) {
            a(th5);
        }
        try {
            a("CheckedTextView", "C1");
        } catch (Throwable th6) {
            a(th6);
        }
        try {
            a(Class.forName("com.android.internal.policy.DecorView").getSimpleName(), "D0");
        } catch (Throwable th7) {
            a(th7);
        }
        try {
            a(DrawerLayout.class.getSimpleName(), "D1");
        } catch (Throwable th8) {
            a(th8);
        }
        try {
            a("EditText", "E0");
        } catch (Throwable th9) {
            a(th9);
        }
        try {
            a("ExpandableListView", "E1");
        } catch (Throwable th10) {
            a(th10);
        }
        try {
            a("FrameLayout", "F0");
        } catch (Throwable th11) {
            a(th11);
        }
        try {
            a(Fragment.class.getSimpleName(), "F1");
        } catch (Throwable th12) {
            a(th12);
        }
        try {
            a("Gallery", "G0");
        } catch (Throwable th13) {
            a(th13);
        }
        try {
            a("GridView", "G1");
        } catch (Throwable th14) {
            a(th14);
        }
        try {
            a("HorizontalScrollView", "H0");
        } catch (Throwable th15) {
            a(th15);
        }
        try {
            a("ImageButton", "I0");
        } catch (Throwable th16) {
            a(th16);
        }
        try {
            a("ImageSwitcher", "I1");
        } catch (Throwable th17) {
            a(th17);
        }
        try {
            a("ImageView", "I2");
        } catch (Throwable th18) {
            a(th18);
        }
        try {
            a("LinearLayout", "L0");
        } catch (Throwable th19) {
            a(th19);
        }
        try {
            a("ListView", "L1");
        } catch (Throwable th20) {
            a(th20);
        }
        try {
            a("ListFragment", "L2");
        } catch (Throwable th21) {
            a(th21);
        }
        try {
            a("MultiAutoCompleteTextView", "M0");
        } catch (Throwable th22) {
            a(th22);
        }
        try {
            a(NestedScrollView.class.getSimpleName(), "N0");
        } catch (Throwable th23) {
            a(th23);
        }
        try {
            a("ProgressBar", "P0");
        } catch (Throwable th24) {
            a(th24);
        }
        try {
            a("RadioButton", "R0");
        } catch (Throwable th25) {
            a(th25);
        }
        try {
            a("RadioGroup", "R1");
        } catch (Throwable th26) {
            a(th26);
        }
        try {
            a("RatingBar", "R2");
        } catch (Throwable th27) {
            a(th27);
        }
        try {
            a("RelativeLayout", "R3");
        } catch (Throwable th28) {
            a(th28);
        }
        try {
            a(RecyclerView.class.getSimpleName(), "R4");
        } catch (Throwable th29) {
            a(th29);
        }
        try {
            a("ScrollView", "S0");
        } catch (Throwable th30) {
            a(th30);
        }
        try {
            a(SearchView.class.getSimpleName(), "S1");
        } catch (Throwable th31) {
            a(th31);
        }
        try {
            a("SeekBar", "S2");
        } catch (Throwable th32) {
            a(th32);
        }
        try {
            a("Spinner", "S3");
        } catch (Throwable th33) {
            a(th33);
        }
        try {
            a("Switch", "S4");
        } catch (Throwable th34) {
            a(th34);
        }
        try {
            a("SurfaceView", "S5");
        } catch (Throwable th35) {
            a(th35);
        }
        try {
            a(SwipeRefreshLayout.class.getSimpleName(), "S6");
        } catch (Throwable th36) {
            a(th36);
        }
        try {
            a("TabHost", "T0");
        } catch (Throwable th37) {
            a(th37);
        }
        try {
            a("TableLayout", "T1");
        } catch (Throwable th38) {
            a(th38);
        }
        try {
            a("TableRow", "T2");
        } catch (Throwable th39) {
            a(th39);
        }
        try {
            a("TabWidget", "T3");
        } catch (Throwable th40) {
            a(th40);
        }
        try {
            a("TextSwitcher", "T4");
        } catch (Throwable th41) {
            a(th41);
        }
        try {
            a("TextView", "T5");
        } catch (Throwable th42) {
            a(th42);
        }
        try {
            a("Toast", "T6");
        } catch (Throwable th43) {
            a(th43);
        }
        try {
            a("ToggleButton", "T7");
        } catch (Throwable th44) {
            a(th44);
        }
        try {
            a("TextureView", "T8");
        } catch (Throwable th45) {
            a(th45);
        }
        try {
            a(Toolbar.class.getSimpleName(), "T9");
        } catch (Throwable th46) {
            a(th46);
        }
        try {
            a("View", "V0");
        } catch (Throwable th47) {
            a(th47);
        }
        try {
            a("ViewGroup", "V1");
        } catch (Throwable th48) {
            a(th48);
        }
        try {
            a("ViewStub", "V2");
        } catch (Throwable th49) {
            a(th49);
        }
        try {
            a("VideoView", "V3");
        } catch (Throwable th50) {
            a(th50);
        }
        try {
            a("ViewSwitcher", "V4");
        } catch (Throwable th51) {
            a(th51);
        }
        try {
            a("ViewFlipper", "V5");
        } catch (Throwable th52) {
            a(th52);
        }
        try {
            a(ViewPager.class.getSimpleName(), "V6");
        } catch (Throwable th53) {
            a(th53);
        }
        try {
            a("WebView", "W0");
        } catch (Throwable th54) {
            a(th54);
        }
        try {
            a("WebViewFragment", "W1");
        } catch (Throwable th55) {
            a(th55);
        }
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || this.a.containsKey(str)) {
            return;
        }
        this.a.put(str, str2.toUpperCase(Locale.ENGLISH));
    }

    public String a(String str) {
        return this.a.get(str);
    }
}
