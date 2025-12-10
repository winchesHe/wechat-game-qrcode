package com.muhua.wz.filter;

import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class EmojiFilter implements InputFilter {
    public static final Pattern EMOJI_PATTERN = Pattern.compile("(?:[🌀-🗿]|[🤀-🧿]|[😀-🙏]|[🚀-\u1f6ff]|[☀-⛿]️?|[✀-➿]️?|Ⓜ️?|[🇦-🇿]{1,2}|[🅰🅱🅾🅿🆎🆑-🆚]️?|[#*0-9]️?⃣|[↔-↙↩-↪]️?|[⬅-⬇⬛⬜⭐⭕]️?|[⤴⤵]️?|[〰〽]️?|[㊗㊙]️?|[🈁🈂🈚🈯🈲-🈺🉐🉑]️?|[‼⁉]️?|[▪▫▶◀◻-◾]️?|[©®]️?|[™ℹ]️?|🀄️?|🃏️?|[⌚⌛⌨⏏⏩-⏳⏸-⏺]️?)", 66);

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if ((TextUtils.isEmpty(charSequence) && i == i2) || (charSequence instanceof Spannable)) {
            return null;
        }
        if (!needFilter(charSequence)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i5 = i;
        while (i < i2) {
            if (isEmoji(String.valueOf(charSequence.charAt(i)))) {
                if (i != i5) {
                    spannableStringBuilder.append(charSequence.subSequence(i5, i));
                }
                i5 = i + 1;
            } else {
                int i6 = i + 1;
                if (i6 <= i2) {
                    int i7 = i + 2;
                    if (isEmoji(charSequence.subSequence(i, i7))) {
                        if (i != i5) {
                            spannableStringBuilder.append(charSequence.subSequence(i5, i));
                        }
                        i = i6;
                        i5 = i7;
                    }
                }
            }
            i++;
        }
        if (i5 < i2) {
            spannableStringBuilder.append(charSequence.subSequence(i5, i2));
        }
        return spannableStringBuilder;
    }

    private boolean needFilter(CharSequence charSequence) {
        return EMOJI_PATTERN.matcher(charSequence).find();
    }

    private boolean isEmoji(CharSequence charSequence) {
        return EMOJI_PATTERN.matcher(charSequence).matches();
    }
}
