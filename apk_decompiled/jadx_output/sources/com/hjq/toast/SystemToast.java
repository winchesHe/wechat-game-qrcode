package com.hjq.toast;

import android.app.Application;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.hjq.toast.config.IToast;

/* loaded from: classes.dex */
public class SystemToast extends Toast implements IToast {
    private TextView mMessageView;

    @Override // com.hjq.toast.config.IToast
    public /* synthetic */ TextView findMessageView(View view) {
        return IToast.CC.$default$findMessageView(this, view);
    }

    public SystemToast(Application application) {
        super(application);
    }

    @Override // android.widget.Toast, com.hjq.toast.config.IToast
    public void setView(View view) {
        super.setView(view);
        if (view == null) {
            this.mMessageView = null;
        } else {
            this.mMessageView = findMessageView(view);
        }
    }

    @Override // android.widget.Toast, com.hjq.toast.config.IToast
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
        TextView textView = this.mMessageView;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }
}
