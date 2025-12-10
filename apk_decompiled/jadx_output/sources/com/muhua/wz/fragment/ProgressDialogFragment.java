package com.muhua.wz.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import com.info.wz.R;

/* loaded from: classes.dex */
public class ProgressDialogFragment extends BaseDialogFragment {
    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) throws Resources.NotFoundException {
        Dialog dialog = new Dialog(getActivity(), R.style.dialog_transparent);
        dialog.setContentView(R.layout.dialog_progressbar);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.muhua.wz.fragment.ProgressDialogFragment.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return i == 4;
            }
        });
        Window window = dialog.getWindow();
        window.addFlags(1024);
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        int dimensionPixelOffset = getActivity().getResources().getDimensionPixelOffset(R.dimen.progress_dialog_size);
        attributes.height = dimensionPixelOffset;
        attributes.width = dimensionPixelOffset;
        window.setAttributes(attributes);
        window.setBackgroundDrawableResource(R.color.transparent);
        return dialog;
    }
}
