package com.muhua.wz.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.info.wz.R;
import com.muhua.wz.util.DimenUtil;

/* loaded from: classes.dex */
public class MsgDialogFragment extends BaseDialogFragment implements View.OnClickListener {
    private View contextView;
    private Dialog dialog;
    private Button left;
    private ButtonClickListener leftButtonClickListener;
    private boolean leftGone;
    private CharSequence leftText;
    private DialogInterface.OnCancelListener listener;
    private TextView msg;
    private CharSequence msgText;
    private DialogInterface.OnDismissListener onDismissListener;
    private Button right;
    private ButtonClickListener rightButtonClickListener;
    private boolean rightGone;
    private CharSequence rightText;
    private TextView title;
    private CharSequence titleText;
    private int mRotation = 0;
    private int dialogStyle = R.style.dialog_transparent;

    public interface ButtonClickListener {
        void onButtonClick(MsgDialogFragment msgDialogFragment);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.dialog == null) {
            View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_msg_common, (ViewGroup) null);
            this.contextView = viewInflate;
            this.title = (TextView) viewInflate.findViewById(R.id.tv_title);
            Button button = (Button) this.contextView.findViewById(R.id.btn_left);
            this.left = button;
            button.setVisibility(this.leftGone ? 8 : 0);
            this.left.setOnClickListener(this);
            Button button2 = (Button) this.contextView.findViewById(R.id.btn_right);
            this.right = button2;
            button2.setVisibility(this.rightGone ? 8 : 0);
            this.right.setOnClickListener(this);
            this.msg = (TextView) this.contextView.findViewById(R.id.tv_content);
            Dialog dialog = new Dialog(getActivity(), this.dialogStyle);
            this.dialog = dialog;
            dialog.setContentView(this.contextView);
            this.dialog.setCanceledOnTouchOutside(true);
            Window window = this.dialog.getWindow();
            window.setGravity(17);
            window.setLayout(-1, -2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (DimenUtil.getScreenWidth(getActivity()) * 0.75d);
            window.setAttributes(attributes);
        }
        if (!TextUtils.isEmpty(this.leftText)) {
            this.left.setText(this.leftText);
        }
        if (!TextUtils.isEmpty(this.rightText)) {
            this.right.setText(this.rightText);
        }
        if (!TextUtils.isEmpty(this.titleText)) {
            this.title.setText(this.titleText);
            this.title.setVisibility(0);
        } else {
            this.title.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.msgText)) {
            this.msg.setText(this.msgText);
        }
        setRotation(this.mRotation);
        return this.dialog;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.listener;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // com.muhua.wz.fragment.BaseDialogFragment, android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public void setRotation(int i) {
        View view;
        if (i < 0) {
            return;
        }
        this.mRotation = i;
        if (this.dialog == null || (view = this.contextView) == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((int) (DimenUtil.getScreenWidth(r6.getContext()) * 0.75d), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.contextView.getMeasuredWidth();
        int measuredHeight = this.contextView.getMeasuredHeight();
        this.contextView.setRotation(this.mRotation);
        Window window = this.dialog.getWindow();
        window.setGravity(17);
        int i2 = this.mRotation;
        if (i2 == 90 || i2 == 270) {
            window.setLayout(measuredHeight, measuredWidth);
            this.contextView.getLayoutParams().height = measuredHeight;
            this.contextView.getLayoutParams().width = measuredWidth;
            View view2 = this.contextView;
            view2.setLayoutParams(view2.getLayoutParams());
            this.contextView.setTranslationX((measuredHeight - measuredWidth) / 2);
            this.contextView.setTranslationY((measuredWidth - measuredHeight) / 2);
            return;
        }
        window.setLayout(measuredWidth, measuredHeight);
        this.contextView.getLayoutParams().height = measuredHeight;
        this.contextView.getLayoutParams().width = measuredWidth;
        View view3 = this.contextView;
        view3.setLayoutParams(view3.getLayoutParams());
        this.contextView.setTranslationX(0.0f);
        this.contextView.setTranslationY(0.0f);
    }

    public MsgDialogFragment setLeftText(CharSequence charSequence) {
        this.leftText = charSequence;
        return this;
    }

    public MsgDialogFragment setRightText(CharSequence charSequence) {
        this.rightText = charSequence;
        return this;
    }

    public MsgDialogFragment setLeftGone(boolean z) {
        this.leftGone = z;
        return this;
    }

    public MsgDialogFragment setRightGone(boolean z) {
        this.rightGone = z;
        return this;
    }

    public MsgDialogFragment setTitleText(CharSequence charSequence) {
        this.titleText = charSequence;
        return this;
    }

    public MsgDialogFragment setMsgText(CharSequence charSequence) {
        this.msgText = charSequence;
        return this;
    }

    public MsgDialogFragment setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.listener = onCancelListener;
        return this;
    }

    public View getContextView() {
        return this.contextView;
    }

    @Override // com.muhua.wz.fragment.BaseDialogFragment
    public MsgDialogFragment setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
        return this;
    }

    public MsgDialogFragment setLeftButtonClickListener(ButtonClickListener buttonClickListener) {
        this.leftButtonClickListener = buttonClickListener;
        return this;
    }

    public MsgDialogFragment setRightButtonClickListener(ButtonClickListener buttonClickListener) {
        this.rightButtonClickListener = buttonClickListener;
        return this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_left) {
            ButtonClickListener buttonClickListener = this.leftButtonClickListener;
            if (buttonClickListener != null) {
                buttonClickListener.onButtonClick(this);
                return;
            } else {
                dismissAllowingStateLoss();
                return;
            }
        }
        if (id == R.id.btn_right) {
            ButtonClickListener buttonClickListener2 = this.rightButtonClickListener;
            if (buttonClickListener2 != null) {
                buttonClickListener2.onButtonClick(this);
            } else {
                dismissAllowingStateLoss();
            }
        }
    }
}
