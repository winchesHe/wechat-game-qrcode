package com.muhua.wz.filter;

import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class NameFilter extends EmojiFilter {
    private static final String PATTERN_STR = "\\s";
    private static final Pattern PATTERN = Pattern.compile(PATTERN_STR, 2);

    @Override // com.muhua.wz.filter.EmojiFilter, android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if ((TextUtils.isEmpty(charSequence) && i == i2) || (charSequence instanceof Spannable)) {
            return null;
        }
        return PATTERN.matcher(super.filter(charSequence, i, i2, spanned, i3, i4)).replaceAll("");
    }
}
