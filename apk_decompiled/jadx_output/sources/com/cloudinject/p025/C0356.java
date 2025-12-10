package com.cloudinject.p025;

import android.R;
import android.net.C0083;
import androidx.core.p007.C0089;
import com.cloudinject.core.p009.p012.C0164;
import com.cloudinject.customview.C0183;
import com.cloudinject.customview.C0184;
import com.cloudinject.feature.p018.C0229;
import com.px.C0368;
import mirrorb.android.accounts.C0376;
import mirrorb.android.hardware.fingerprint.C0382;
import mirrorb.android.hardware.location.C0383;
import mirrorb.android.media.session.C0386;
import mirrorb.android.net.C0389;
import mirrorb.android.net.wifi.C0387;
import mirrorb.android.util.C0393;
import mirrorb.com.android.internal.content.C0395;
import mirrorb.com.android.internal.view.C0397;

/* renamed from: com.cloudinject.̗.̗̙̖, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0356 {
    public static final int[] ActionBar;
    public static final int[] ActionBarLayout;
    public static final int ActionBarLayout_android_layout_gravity = 0;
    public static final int ActionBar_background = 0;
    public static final int ActionBar_backgroundSplit = 1;
    public static final int ActionBar_backgroundStacked = 2;
    public static final int ActionBar_contentInsetEnd = 3;
    public static final int ActionBar_contentInsetEndWithActions = 4;
    public static final int ActionBar_contentInsetLeft = 5;
    public static final int ActionBar_contentInsetRight = 6;
    public static final int ActionBar_contentInsetStart = 7;
    public static final int ActionBar_contentInsetStartWithNavigation = 8;
    public static final int ActionBar_customNavigationLayout = 9;
    public static final int ActionBar_displayOptions = 10;
    public static final int ActionBar_divider = 11;
    public static final int ActionBar_elevation = 12;
    public static final int ActionBar_height = 13;
    public static final int ActionBar_hideOnContentScroll = 14;
    public static final int ActionBar_homeAsUpIndicator = 15;
    public static final int ActionBar_homeLayout = 16;
    public static final int ActionBar_icon = 17;
    public static final int ActionBar_indeterminateProgressStyle = 18;
    public static final int ActionBar_itemPadding = 19;
    public static final int ActionBar_logo = 20;
    public static final int ActionBar_navigationMode = 21;
    public static final int ActionBar_popupTheme = 22;
    public static final int ActionBar_progressBarPadding = 23;
    public static final int ActionBar_progressBarStyle = 24;
    public static final int ActionBar_subtitle = 25;
    public static final int ActionBar_subtitleTextStyle = 26;
    public static final int ActionBar_title = 27;
    public static final int ActionBar_titleTextStyle = 28;
    public static final int[] ActionMenuItemView;
    public static final int ActionMenuItemView_android_minWidth = 0;
    public static final int[] ActionMode;
    public static final int ActionMode_background = 0;
    public static final int ActionMode_backgroundSplit = 1;
    public static final int ActionMode_closeItemLayout = 2;
    public static final int ActionMode_height = 3;
    public static final int ActionMode_subtitleTextStyle = 4;
    public static final int ActionMode_titleTextStyle = 5;
    public static final int[] ActivityChooserView;
    public static final int ActivityChooserView_expandActivityOverflowButtonDrawable = 0;
    public static final int ActivityChooserView_initialActivityCount = 1;
    public static final int[] AlertDialog;
    public static final int AlertDialog_android_layout = 0;
    public static final int AlertDialog_buttonIconDimen = 1;
    public static final int AlertDialog_buttonPanelSideLayout = 2;
    public static final int AlertDialog_listItemLayout = 3;
    public static final int AlertDialog_listLayout = 4;
    public static final int AlertDialog_multiChoiceItemLayout = 5;
    public static final int AlertDialog_showTitle = 6;
    public static final int AlertDialog_singleChoiceItemLayout = 7;
    public static final int[] AppCompatImageView;
    public static final int AppCompatImageView_android_src = 0;
    public static final int AppCompatImageView_srcCompat = 1;
    public static final int AppCompatImageView_tint = 2;
    public static final int AppCompatImageView_tintMode = 3;
    public static final int[] AppCompatSeekBar;
    public static final int AppCompatSeekBar_android_thumb = 0;
    public static final int AppCompatSeekBar_tickMark = 1;
    public static final int AppCompatSeekBar_tickMarkTint = 2;
    public static final int AppCompatSeekBar_tickMarkTintMode = 3;
    public static final int[] AppCompatTextHelper;
    public static final int AppCompatTextHelper_android_drawableBottom = 2;
    public static final int AppCompatTextHelper_android_drawableEnd = 6;
    public static final int AppCompatTextHelper_android_drawableLeft = 3;
    public static final int AppCompatTextHelper_android_drawableRight = 4;
    public static final int AppCompatTextHelper_android_drawableStart = 5;
    public static final int AppCompatTextHelper_android_drawableTop = 1;
    public static final int AppCompatTextHelper_android_textAppearance = 0;
    public static final int[] AppCompatTextView;
    public static final int AppCompatTextView_android_textAppearance = 0;
    public static final int AppCompatTextView_autoSizeMaxTextSize = 1;
    public static final int AppCompatTextView_autoSizeMinTextSize = 2;
    public static final int AppCompatTextView_autoSizePresetSizes = 3;
    public static final int AppCompatTextView_autoSizeStepGranularity = 4;
    public static final int AppCompatTextView_autoSizeTextType = 5;
    public static final int AppCompatTextView_firstBaselineToTopHeight = 6;
    public static final int AppCompatTextView_fontFamily = 7;
    public static final int AppCompatTextView_lastBaselineToBottomHeight = 8;
    public static final int AppCompatTextView_lineHeight = 9;
    public static final int AppCompatTextView_textAllCaps = 10;
    public static final int[] AppCompatTheme;
    public static final int AppCompatTheme_actionBarDivider = 2;
    public static final int AppCompatTheme_actionBarItemBackground = 3;
    public static final int AppCompatTheme_actionBarPopupTheme = 4;
    public static final int AppCompatTheme_actionBarSize = 5;
    public static final int AppCompatTheme_actionBarSplitStyle = 6;
    public static final int AppCompatTheme_actionBarStyle = 7;
    public static final int AppCompatTheme_actionBarTabBarStyle = 8;
    public static final int AppCompatTheme_actionBarTabStyle = 9;
    public static final int AppCompatTheme_actionBarTabTextStyle = 10;
    public static final int AppCompatTheme_actionBarTheme = 11;
    public static final int AppCompatTheme_actionBarWidgetTheme = 12;
    public static final int AppCompatTheme_actionButtonStyle = 13;
    public static final int AppCompatTheme_actionDropDownStyle = 14;
    public static final int AppCompatTheme_actionMenuTextAppearance = 15;
    public static final int AppCompatTheme_actionMenuTextColor = 16;
    public static final int AppCompatTheme_actionModeBackground = 17;
    public static final int AppCompatTheme_actionModeCloseButtonStyle = 18;
    public static final int AppCompatTheme_actionModeCloseDrawable = 19;
    public static final int AppCompatTheme_actionModeCopyDrawable = 20;
    public static final int AppCompatTheme_actionModeCutDrawable = 21;
    public static final int AppCompatTheme_actionModeFindDrawable = 22;
    public static final int AppCompatTheme_actionModePasteDrawable = 23;
    public static final int AppCompatTheme_actionModePopupWindowStyle = 24;
    public static final int AppCompatTheme_actionModeSelectAllDrawable = 25;
    public static final int AppCompatTheme_actionModeShareDrawable = 26;
    public static final int AppCompatTheme_actionModeSplitBackground = 27;
    public static final int AppCompatTheme_actionModeStyle = 28;
    public static final int AppCompatTheme_actionModeWebSearchDrawable = 29;
    public static final int AppCompatTheme_actionOverflowButtonStyle = 30;
    public static final int AppCompatTheme_actionOverflowMenuStyle = 31;
    public static final int AppCompatTheme_activityChooserViewStyle = 32;
    public static final int AppCompatTheme_alertDialogButtonGroupStyle = 33;
    public static final int AppCompatTheme_alertDialogCenterButtons = 34;
    public static final int AppCompatTheme_alertDialogStyle = 35;
    public static final int AppCompatTheme_alertDialogTheme = 36;
    public static final int AppCompatTheme_android_windowAnimationStyle = 1;
    public static final int AppCompatTheme_android_windowIsFloating = 0;
    public static final int AppCompatTheme_autoCompleteTextViewStyle = 37;
    public static final int AppCompatTheme_borderlessButtonStyle = 38;
    public static final int AppCompatTheme_buttonBarButtonStyle = 39;
    public static final int AppCompatTheme_buttonBarNegativeButtonStyle = 40;
    public static final int AppCompatTheme_buttonBarNeutralButtonStyle = 41;
    public static final int AppCompatTheme_buttonBarPositiveButtonStyle = 42;
    public static final int AppCompatTheme_buttonBarStyle = 43;
    public static final int AppCompatTheme_buttonStyle = 44;
    public static final int AppCompatTheme_buttonStyleSmall = 45;
    public static final int AppCompatTheme_checkboxStyle = 46;
    public static final int AppCompatTheme_checkedTextViewStyle = 47;
    public static final int AppCompatTheme_colorAccent = 48;
    public static final int AppCompatTheme_colorBackgroundFloating = 49;
    public static final int AppCompatTheme_colorButtonNormal = 50;
    public static final int AppCompatTheme_colorControlActivated = 51;
    public static final int AppCompatTheme_colorControlHighlight = 52;
    public static final int AppCompatTheme_colorControlNormal = 53;
    public static final int AppCompatTheme_colorError = 54;
    public static final int AppCompatTheme_colorPrimary = 55;
    public static final int AppCompatTheme_colorPrimaryDark = 56;
    public static final int AppCompatTheme_colorSwitchThumbNormal = 57;
    public static final int AppCompatTheme_controlBackground = 58;
    public static final int AppCompatTheme_dialogCornerRadius = 59;
    public static final int AppCompatTheme_dialogPreferredPadding = 60;
    public static final int AppCompatTheme_dialogTheme = 61;
    public static final int AppCompatTheme_dividerHorizontal = 62;
    public static final int AppCompatTheme_dividerVertical = 63;
    public static final int AppCompatTheme_dropDownListViewStyle = 64;
    public static final int AppCompatTheme_dropdownListPreferredItemHeight = 65;
    public static final int AppCompatTheme_editTextBackground = 66;
    public static final int AppCompatTheme_editTextColor = 67;
    public static final int AppCompatTheme_editTextStyle = 68;
    public static final int AppCompatTheme_homeAsUpIndicator = 69;
    public static final int AppCompatTheme_imageButtonStyle = 70;
    public static final int AppCompatTheme_listChoiceBackgroundIndicator = 71;
    public static final int AppCompatTheme_listDividerAlertDialog = 72;
    public static final int AppCompatTheme_listMenuViewStyle = 73;
    public static final int AppCompatTheme_listPopupWindowStyle = 74;
    public static final int AppCompatTheme_listPreferredItemHeight = 75;
    public static final int AppCompatTheme_listPreferredItemHeightLarge = 76;
    public static final int AppCompatTheme_listPreferredItemHeightSmall = 77;
    public static final int AppCompatTheme_listPreferredItemPaddingLeft = 78;
    public static final int AppCompatTheme_listPreferredItemPaddingRight = 79;
    public static final int AppCompatTheme_panelBackground = 80;
    public static final int AppCompatTheme_panelMenuListTheme = 81;
    public static final int AppCompatTheme_panelMenuListWidth = 82;
    public static final int AppCompatTheme_popupMenuStyle = 83;
    public static final int AppCompatTheme_popupWindowStyle = 84;
    public static final int AppCompatTheme_radioButtonStyle = 85;
    public static final int AppCompatTheme_ratingBarStyle = 86;
    public static final int AppCompatTheme_ratingBarStyleIndicator = 87;
    public static final int AppCompatTheme_ratingBarStyleSmall = 88;
    public static final int AppCompatTheme_searchViewStyle = 89;
    public static final int AppCompatTheme_seekBarStyle = 90;
    public static final int AppCompatTheme_selectableItemBackground = 91;
    public static final int AppCompatTheme_selectableItemBackgroundBorderless = 92;
    public static final int AppCompatTheme_spinnerDropDownItemStyle = 93;
    public static final int AppCompatTheme_spinnerStyle = 94;
    public static final int AppCompatTheme_switchStyle = 95;
    public static final int AppCompatTheme_textAppearanceLargePopupMenu = 96;
    public static final int AppCompatTheme_textAppearanceListItem = 97;
    public static final int AppCompatTheme_textAppearanceListItemSecondary = 98;
    public static final int AppCompatTheme_textAppearanceListItemSmall = 99;
    public static final int AppCompatTheme_textAppearancePopupMenuHeader = 100;
    public static final int AppCompatTheme_textAppearanceSearchResultSubtitle = 101;
    public static final int AppCompatTheme_textAppearanceSearchResultTitle = 102;
    public static final int AppCompatTheme_textAppearanceSmallPopupMenu = 103;
    public static final int AppCompatTheme_textColorAlertDialogListItem = 104;
    public static final int AppCompatTheme_textColorSearchUrl = 105;
    public static final int AppCompatTheme_toolbarNavigationButtonStyle = 106;
    public static final int AppCompatTheme_toolbarStyle = 107;
    public static final int AppCompatTheme_tooltipForegroundColor = 108;
    public static final int AppCompatTheme_tooltipFrameBackground = 109;
    public static final int AppCompatTheme_viewInflaterClass = 110;
    public static final int AppCompatTheme_windowActionBar = 111;
    public static final int AppCompatTheme_windowActionBarOverlay = 112;
    public static final int AppCompatTheme_windowActionModeOverlay = 113;
    public static final int AppCompatTheme_windowFixedHeightMajor = 114;
    public static final int AppCompatTheme_windowFixedHeightMinor = 115;
    public static final int AppCompatTheme_windowFixedWidthMajor = 116;
    public static final int AppCompatTheme_windowFixedWidthMinor = 117;
    public static final int AppCompatTheme_windowMinWidthMajor = 118;
    public static final int AppCompatTheme_windowMinWidthMinor = 119;
    public static final int AppCompatTheme_windowNoTitle = 120;
    public static final int[] ButtonBarLayout;
    public static final int ButtonBarLayout_allowStacking = 0;
    public static final int[] ColorStateListItem;
    public static final int ColorStateListItem_alpha = 2;
    public static final int ColorStateListItem_android_alpha = 1;
    public static final int ColorStateListItem_android_color = 0;
    public static final int[] CompoundButton;
    public static final int CompoundButton_android_button = 0;
    public static final int CompoundButton_buttonTint = 1;
    public static final int CompoundButton_buttonTintMode = 2;
    public static final int[] CoordinatorLayout;
    public static final int[] CoordinatorLayout_Layout;
    public static final int CoordinatorLayout_Layout_android_layout_gravity = 0;
    public static final int CoordinatorLayout_Layout_layout_anchor = 1;
    public static final int CoordinatorLayout_Layout_layout_anchorGravity = 2;
    public static final int CoordinatorLayout_Layout_layout_behavior = 3;
    public static final int CoordinatorLayout_Layout_layout_dodgeInsetEdges = 4;
    public static final int CoordinatorLayout_Layout_layout_insetEdge = 5;
    public static final int CoordinatorLayout_Layout_layout_keyline = 6;
    public static final int CoordinatorLayout_keylines = 0;
    public static final int CoordinatorLayout_statusBarBackground = 1;
    public static final int[] DrawerArrowToggle;
    public static final int DrawerArrowToggle_arrowHeadLength = 0;
    public static final int DrawerArrowToggle_arrowShaftLength = 1;
    public static final int DrawerArrowToggle_barLength = 2;
    public static final int DrawerArrowToggle_color = 3;
    public static final int DrawerArrowToggle_drawableSize = 4;
    public static final int DrawerArrowToggle_gapBetweenBars = 5;
    public static final int DrawerArrowToggle_spinBars = 6;
    public static final int DrawerArrowToggle_thickness = 7;
    public static final int[] FontFamily;
    public static final int[] FontFamilyFont;
    public static final int FontFamilyFont_android_font = 0;
    public static final int FontFamilyFont_android_fontStyle = 2;
    public static final int FontFamilyFont_android_fontVariationSettings = 4;
    public static final int FontFamilyFont_android_fontWeight = 1;
    public static final int FontFamilyFont_android_ttcIndex = 3;
    public static final int FontFamilyFont_font = 5;
    public static final int FontFamilyFont_fontStyle = 6;
    public static final int FontFamilyFont_fontVariationSettings = 7;
    public static final int FontFamilyFont_fontWeight = 8;
    public static final int FontFamilyFont_ttcIndex = 9;
    public static final int FontFamily_fontProviderAuthority = 0;
    public static final int FontFamily_fontProviderCerts = 1;
    public static final int FontFamily_fontProviderFetchStrategy = 2;
    public static final int FontFamily_fontProviderFetchTimeout = 3;
    public static final int FontFamily_fontProviderPackage = 4;
    public static final int FontFamily_fontProviderQuery = 5;
    public static final int[] LinearLayoutCompat;
    public static final int[] LinearLayoutCompat_Layout;
    public static final int LinearLayoutCompat_Layout_android_layout_gravity = 0;
    public static final int LinearLayoutCompat_Layout_android_layout_height = 2;
    public static final int LinearLayoutCompat_Layout_android_layout_weight = 3;
    public static final int LinearLayoutCompat_Layout_android_layout_width = 1;
    public static final int LinearLayoutCompat_android_baselineAligned = 2;
    public static final int LinearLayoutCompat_android_baselineAlignedChildIndex = 3;
    public static final int LinearLayoutCompat_android_gravity = 0;
    public static final int LinearLayoutCompat_android_orientation = 1;
    public static final int LinearLayoutCompat_android_weightSum = 4;
    public static final int LinearLayoutCompat_divider = 5;
    public static final int LinearLayoutCompat_dividerPadding = 6;
    public static final int LinearLayoutCompat_measureWithLargestChild = 7;
    public static final int LinearLayoutCompat_showDividers = 8;
    public static final int[] ListPopupWindow;
    public static final int ListPopupWindow_android_dropDownHorizontalOffset = 0;
    public static final int ListPopupWindow_android_dropDownVerticalOffset = 1;
    public static final int[] MenuGroup;
    public static final int MenuGroup_android_checkableBehavior = 5;
    public static final int MenuGroup_android_enabled = 0;
    public static final int MenuGroup_android_id = 1;
    public static final int MenuGroup_android_menuCategory = 3;
    public static final int MenuGroup_android_orderInCategory = 4;
    public static final int MenuGroup_android_visible = 2;
    public static final int[] MenuItem;
    public static final int MenuItem_actionLayout = 13;
    public static final int MenuItem_actionProviderClass = 14;
    public static final int MenuItem_actionViewClass = 15;
    public static final int MenuItem_alphabeticModifiers = 16;
    public static final int MenuItem_android_alphabeticShortcut = 9;
    public static final int MenuItem_android_checkable = 11;
    public static final int MenuItem_android_checked = 3;
    public static final int MenuItem_android_enabled = 1;
    public static final int MenuItem_android_icon = 0;
    public static final int MenuItem_android_id = 2;
    public static final int MenuItem_android_menuCategory = 5;
    public static final int MenuItem_android_numericShortcut = 10;
    public static final int MenuItem_android_onClick = 12;
    public static final int MenuItem_android_orderInCategory = 6;
    public static final int MenuItem_android_title = 7;
    public static final int MenuItem_android_titleCondensed = 8;
    public static final int MenuItem_android_visible = 4;
    public static final int MenuItem_contentDescription = 17;
    public static final int MenuItem_iconTint = 18;
    public static final int MenuItem_iconTintMode = 19;
    public static final int MenuItem_numericModifiers = 20;
    public static final int MenuItem_showAsAction = 21;
    public static final int MenuItem_tooltipText = 22;
    public static final int[] MenuView;
    public static final int MenuView_android_headerBackground = 4;
    public static final int MenuView_android_horizontalDivider = 2;
    public static final int MenuView_android_itemBackground = 5;
    public static final int MenuView_android_itemIconDisabledAlpha = 6;
    public static final int MenuView_android_itemTextAppearance = 1;
    public static final int MenuView_android_verticalDivider = 3;
    public static final int MenuView_android_windowAnimationStyle = 0;
    public static final int MenuView_preserveIconSpacing = 7;
    public static final int MenuView_subMenuArrow = 8;
    public static final int[] PopupWindow;
    public static final int[] PopupWindowBackgroundState;
    public static final int PopupWindowBackgroundState_state_above_anchor = 0;
    public static final int PopupWindow_android_popupAnimationStyle = 1;
    public static final int PopupWindow_android_popupBackground = 0;
    public static final int PopupWindow_overlapAnchor = 2;
    public static final int[] RecycleListView;
    public static final int RecycleListView_paddingBottomNoButtons = 0;
    public static final int RecycleListView_paddingTopNoTitle = 1;
    public static final int[] SearchView;
    public static final int SearchView_android_focusable = 0;
    public static final int SearchView_android_imeOptions = 3;
    public static final int SearchView_android_inputType = 2;
    public static final int SearchView_android_maxWidth = 1;
    public static final int SearchView_closeIcon = 4;
    public static final int SearchView_commitIcon = 5;
    public static final int SearchView_defaultQueryHint = 6;
    public static final int SearchView_goIcon = 7;
    public static final int SearchView_iconifiedByDefault = 8;
    public static final int SearchView_layout = 9;
    public static final int SearchView_queryBackground = 10;
    public static final int SearchView_queryHint = 11;
    public static final int SearchView_searchHintIcon = 12;
    public static final int SearchView_searchIcon = 13;
    public static final int SearchView_submitBackground = 14;
    public static final int SearchView_suggestionRowLayout = 15;
    public static final int SearchView_voiceIcon = 16;
    public static final int[] Spinner;
    public static final int Spinner_android_dropDownWidth = 3;
    public static final int Spinner_android_entries = 0;
    public static final int Spinner_android_popupBackground = 1;
    public static final int Spinner_android_prompt = 2;
    public static final int Spinner_popupTheme = 4;
    public static final int[] SwitchCompat;
    public static final int SwitchCompat_android_textOff = 1;
    public static final int SwitchCompat_android_textOn = 0;
    public static final int SwitchCompat_android_thumb = 2;
    public static final int SwitchCompat_showText = 3;
    public static final int SwitchCompat_splitTrack = 4;
    public static final int SwitchCompat_switchMinWidth = 5;
    public static final int SwitchCompat_switchPadding = 6;
    public static final int SwitchCompat_switchTextAppearance = 7;
    public static final int SwitchCompat_thumbTextPadding = 8;
    public static final int SwitchCompat_thumbTint = 9;
    public static final int SwitchCompat_thumbTintMode = 10;
    public static final int SwitchCompat_track = 11;
    public static final int SwitchCompat_trackTint = 12;
    public static final int SwitchCompat_trackTintMode = 13;
    public static final int[] TextAppearance;
    public static final int TextAppearance_android_fontFamily = 10;
    public static final int TextAppearance_android_shadowColor = 6;
    public static final int TextAppearance_android_shadowDx = 7;
    public static final int TextAppearance_android_shadowDy = 8;
    public static final int TextAppearance_android_shadowRadius = 9;
    public static final int TextAppearance_android_textColor = 3;
    public static final int TextAppearance_android_textColorHint = 4;
    public static final int TextAppearance_android_textColorLink = 5;
    public static final int TextAppearance_android_textSize = 0;
    public static final int TextAppearance_android_textStyle = 2;
    public static final int TextAppearance_android_typeface = 1;
    public static final int TextAppearance_fontFamily = 11;
    public static final int TextAppearance_textAllCaps = 12;
    public static final int[] Toolbar;
    public static final int Toolbar_android_gravity = 0;
    public static final int Toolbar_android_minHeight = 1;
    public static final int Toolbar_buttonGravity = 2;
    public static final int Toolbar_collapseContentDescription = 3;
    public static final int Toolbar_collapseIcon = 4;
    public static final int Toolbar_contentInsetEnd = 5;
    public static final int Toolbar_contentInsetEndWithActions = 6;
    public static final int Toolbar_contentInsetLeft = 7;
    public static final int Toolbar_contentInsetRight = 8;
    public static final int Toolbar_contentInsetStart = 9;
    public static final int Toolbar_contentInsetStartWithNavigation = 10;
    public static final int Toolbar_logo = 11;
    public static final int Toolbar_logoDescription = 12;
    public static final int Toolbar_maxButtonHeight = 13;
    public static final int Toolbar_navigationContentDescription = 14;
    public static final int Toolbar_navigationIcon = 15;
    public static final int Toolbar_popupTheme = 16;
    public static final int Toolbar_subtitle = 17;
    public static final int Toolbar_subtitleTextAppearance = 18;
    public static final int Toolbar_subtitleTextColor = 19;
    public static final int Toolbar_title = 20;
    public static final int Toolbar_titleMargin = 21;
    public static final int Toolbar_titleMarginBottom = 22;
    public static final int Toolbar_titleMarginEnd = 23;
    public static final int Toolbar_titleMarginStart = 24;
    public static final int Toolbar_titleMarginTop = 25;
    public static final int Toolbar_titleMargins = 26;
    public static final int Toolbar_titleTextAppearance = 27;
    public static final int Toolbar_titleTextColor = 28;
    public static final int[] View;
    public static final int[] ViewBackgroundHelper;
    public static final int ViewBackgroundHelper_android_background = 0;
    public static final int ViewBackgroundHelper_backgroundTint = 1;
    public static final int ViewBackgroundHelper_backgroundTintMode = 2;
    public static final int[] ViewStubCompat;
    public static final int ViewStubCompat_android_id = 0;
    public static final int ViewStubCompat_android_inflatedId = 2;
    public static final int ViewStubCompat_android_layout = 1;
    public static final int View_android_focusable = 1;
    public static final int View_android_theme = 0;
    public static final int View_paddingEnd = 2;
    public static final int View_paddingStart = 3;
    public static final int View_theme = 4;

    static {
        String str = "۟ۧۢ";
        while (true) {
            switch (C0395.m5690((Object) str) ^ 56445) {
                case 1709236:
                    ColorStateListItem = new int[]{R.attr.color, R.attr.alpha, 2130837543};
                    CompoundButton = new int[]{R.attr.button, 2130837570, 2130837571};
                    str = "۟۟ۤ";
                    break;
                case 1710522:
                    SearchView = new int[]{R.attr.focusable, R.attr.maxWidth, R.attr.inputType, R.attr.imeOptions, 2130837574, 2130837589, 2130837600, 2130837631, 2130837639, 2130837647, 2130837689, 2130837690, 2130837695, 2130837696, 2130837714, 2130837719, 2130837765};
                    Spinner = new int[]{R.attr.entries, R.attr.popupBackground, R.attr.prompt, R.attr.dropDownWidth, 2130837684};
                    if (C0164.m1359() < 0) {
                        str = "ۦۣۢ";
                        break;
                    } else {
                        C0229.m2064();
                        break;
                    }
                case 1710524:
                    ActivityChooserView = new int[]{2130837617, 2130837642};
                    AlertDialog = new int[]{R.attr.layout, 2130837566, 2130837567, 2130837657, 2130837658, 2130837670, 2130837704, 2130837705};
                    if (C0083.m448() < 0) {
                        str = "ۣ۟ۡ";
                        break;
                    } else {
                        C0393.m5668();
                        break;
                    }
                case 1711414:
                    AppCompatTextHelper = new int[]{R.attr.textAppearance, R.attr.drawableTop, R.attr.drawableBottom, R.attr.drawableLeft, R.attr.drawableRight, R.attr.drawableStart, R.attr.drawableEnd};
                    AppCompatTextView = new int[]{R.attr.textAppearance, 2130837548, 2130837549, 2130837550, 2130837551, 2130837552, 2130837618, 2130837620, 2130837646, 2130837654, 2130837724};
                    if (C0382.m5180() > 0) {
                        str = "ۢۦۨ";
                        break;
                    } else {
                        C0376.m4906();
                        break;
                    }
                case 1711578:
                    SwitchCompat = new int[]{R.attr.textOn, R.attr.textOff, R.attr.thumb, 2130837703, 2130837709, 2130837720, 2130837721, 2130837723, 2130837737, 2130837738, 2130837739, 2130837760, 2130837761, 2130837762};
                    TextAppearance = new int[]{R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, 2130837620, 2130837724};
                    str = "۠ۥۤ";
                    break;
                case 1729011:
                    FontFamilyFont = new int[]{R.attr.font, R.attr.fontWeight, R.attr.fontStyle, R.attr.ttcIndex, R.attr.fontVariationSettings, 2130837619, 2130837627, 2130837628, 2130837629, 2130837763};
                    LinearLayoutCompat = new int[]{R.attr.gravity, R.attr.orientation, R.attr.baselineAligned, R.attr.baselineAlignedChildIndex, R.attr.weightSum, 2130837605, 2130837607, 2130837669, 2130837702};
                    if (C0383.m5203() > 0) {
                        str = "ۤۢ۟";
                        break;
                    } else {
                        C0393.m5668();
                        break;
                    }
                case 1730108:
                    return;
                case 1730140:
                    LinearLayoutCompat_Layout = new int[]{R.attr.layout_gravity, R.attr.layout_width, R.attr.layout_height, R.attr.layout_weight};
                    ListPopupWindow = new int[]{R.attr.dropDownHorizontalOffset, R.attr.dropDownVerticalOffset};
                    if (C0183.m1464() > 0) {
                        str = "۟ۨۡ";
                        break;
                    } else {
                        C0383.m5203();
                        break;
                    }
                case 1732345:
                    DrawerArrowToggle = new int[]{2130837545, 2130837546, 2130837558, 2130837578, 2130837609, 2130837630, 2130837706, 2130837736};
                    FontFamily = new int[]{2130837621, 2130837622, 2130837623, 2130837624, 2130837625, 2130837626};
                    if (C0184.m1524() >= 0) {
                        break;
                    } else {
                        str = "ۥ۟ۨ";
                        break;
                    }
                case 1732441:
                    AppCompatTheme = new int[]{R.attr.windowIsFloating, R.attr.windowAnimationStyle, com.info.wz.R.animator.design_appbar_state_list_animator, com.info.wz.R.animator.design_fab_hide_motion_spec, com.info.wz.R.animator.design_fab_show_motion_spec, com.info.wz.R.animator.fragment_close_enter, com.info.wz.R.animator.fragment_close_exit, com.info.wz.R.animator.fragment_fade_enter, com.info.wz.R.animator.fragment_fade_exit, com.info.wz.R.animator.fragment_open_enter, com.info.wz.R.animator.fragment_open_exit, com.info.wz.R.animator.linear_indeterminate_line1_head_interpolator, com.info.wz.R.animator.linear_indeterminate_line1_tail_interpolator, com.info.wz.R.animator.linear_indeterminate_line2_head_interpolator, com.info.wz.R.animator.linear_indeterminate_line2_tail_interpolator, com.info.wz.R.animator.m3_btn_state_list_anim, com.info.wz.R.animator.m3_card_elevated_state_list_anim, com.info.wz.R.animator.m3_card_state_list_anim, com.info.wz.R.animator.m3_chip_state_list_anim, com.info.wz.R.animator.m3_elevated_chip_state_list_anim, com.info.wz.R.animator.mtrl_btn_state_list_anim, com.info.wz.R.animator.mtrl_btn_unelevated_state_list_anim, com.info.wz.R.animator.mtrl_card_state_list_anim, com.info.wz.R.animator.mtrl_chip_state_list_anim, com.info.wz.R.animator.mtrl_extended_fab_change_size_collapse_motion_spec, com.info.wz.R.animator.mtrl_extended_fab_change_size_expand_motion_spec, com.info.wz.R.animator.mtrl_extended_fab_hide_motion_spec, com.info.wz.R.animator.mtrl_extended_fab_show_motion_spec, com.info.wz.R.animator.mtrl_extended_fab_state_list_animator, com.info.wz.R.animator.mtrl_fab_hide_motion_spec, com.info.wz.R.animator.mtrl_fab_show_motion_spec, com.info.wz.R.animator.mtrl_fab_transformation_sheet_collapse_spec, 2130837537, 2130837538, 2130837539, 2130837540, 2130837541, 2130837547, 2130837559, 2130837560, 2130837561, 2130837562, 2130837563, 2130837564, 2130837568, 2130837569, 2130837572, 2130837573, 2130837579, 2130837580, 2130837581, 2130837582, 2130837583, 2130837584, 2130837585, 2130837586, 2130837587, 2130837588, 2130837597, 2130837601, 2130837602, 2130837603, 2130837606, 2130837608, 2130837611, 2130837612, 2130837613, 2130837614, 2130837615, 2130837634, 2130837640, 2130837655, 2130837656, 2130837659, 2130837660, 2130837661, 2130837662, 2130837663, 2130837664, 2130837665, 2130837680, 2130837681, 2130837682, 2130837683, 2130837685, 2130837691, 2130837692, 2130837693, 2130837694, 2130837697, 2130837698, 2130837699, 2130837700, 2130837707, 2130837708, 2130837722, 2130837725, 2130837726, 2130837727, 2130837728, 2130837729, 2130837730, 2130837731, 2130837732, 2130837733, 2130837734, 2130837755, 2130837756, 2130837757, 2130837758, 2130837764, 2130837766, 2130837767, 2130837768, 2130837769, 2130837770, 2130837771, 2130837772, 2130837773, 2130837774, 2130837775};
                    ButtonBarLayout = new int[]{2130837542};
                    if (C0089.m592() > 0) {
                        str = "ۨ۟۠";
                        break;
                    } else {
                        C0362.m3122();
                        break;
                    }
                case 1733250:
                    MenuView = new int[]{R.attr.windowAnimationStyle, R.attr.itemTextAppearance, R.attr.horizontalDivider, R.attr.verticalDivider, R.attr.headerBackground, R.attr.itemBackground, R.attr.itemIconDisabledAlpha, 2130837686, 2130837713};
                    PopupWindow = new int[]{R.attr.popupBackground, R.attr.popupAnimationStyle, 2130837675};
                    str = "۟ۧۤ";
                    break;
                case 1733378:
                    if (C0184.m1524() < 0) {
                        str = "۟ۧۢ";
                        break;
                    } else {
                        C0397.m5814();
                        str = "ۣۢۡ";
                        break;
                    }
                case 1733733:
                    MenuGroup = new int[]{R.attr.enabled, R.attr.id, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.checkableBehavior};
                    MenuItem = new int[]{R.attr.icon, R.attr.enabled, R.attr.id, R.attr.checked, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.title, R.attr.titleCondensed, R.attr.alphabeticShortcut, R.attr.numericShortcut, R.attr.checkable, R.attr.onClick, com.info.wz.R.animator.m3_btn_elevated_btn_state_list_anim, com.info.wz.R.animator.mtrl_fab_transformation_sheet_expand_spec, 2130837536, 2130837544, 2130837590, 2130837637, 2130837638, 2130837674, 2130837701, 2130837759};
                    if (C0386.m5322() > 0) {
                        str = "ۣۡۡ";
                        break;
                    } else {
                        C0389.m5481();
                        break;
                    }
                case 1734402:
                    Toolbar = new int[]{R.attr.gravity, R.attr.minHeight, 2130837565, 2130837576, 2130837577, 2130837591, 2130837592, 2130837593, 2130837594, 2130837595, 2130837596, 2130837666, 2130837667, 2130837668, 2130837671, 2130837672, 2130837684, 2130837715, 2130837716, 2130837717, 2130837745, 2130837746, 2130837747, 2130837748, 2130837749, 2130837750, 2130837751, 2130837752, 2130837753};
                    View = new int[]{R.attr.theme, R.attr.focusable, 2130837677, 2130837678, 2130837735};
                    if (C0368.m3171() < 0) {
                        str = "۠ۢ۟";
                        break;
                    } else {
                        C0387.m5374();
                        str = "ۣۡۧ";
                        break;
                    }
                case 1734496:
                    ViewBackgroundHelper = new int[]{R.attr.background, 2130837556, 2130837557};
                    ViewStubCompat = new int[]{R.attr.id, R.attr.layout, R.attr.inflatedId};
                    if (C0389.m5481() <= 0) {
                        break;
                    } else {
                        str = "ۣۤ۠";
                        break;
                    }
                case 1735424:
                    AppCompatImageView = new int[]{R.attr.src, 2130837710, 2130837743, 2130837744};
                    AppCompatSeekBar = new int[]{R.attr.thumb, 2130837740, 2130837741, 2130837742};
                    str = "ۦ۟ۤ";
                    break;
                case 1735514:
                    ActionMenuItemView = new int[]{R.attr.minWidth};
                    ActionMode = new int[]{2130837553, 2130837554, 2130837575, 2130837632, 2130837718, 2130837754};
                    str = "ۧۥ۟";
                    break;
                case 1735545:
                    CoordinatorLayout = new int[]{2130837645, 2130837712};
                    CoordinatorLayout_Layout = new int[]{R.attr.layout_gravity, 2130837648, 2130837649, 2130837650, 2130837651, 2130837652, 2130837653};
                    str = "ۣۢۡ";
                    break;
                case 1735553:
                    PopupWindowBackgroundState = new int[]{2130837711};
                    RecycleListView = new int[]{2130837676, 2130837679};
                    str = "ۧۥۥ";
                    break;
                case 1735559:
                    ActionBar = new int[]{2130837553, 2130837554, 2130837555, 2130837591, 2130837592, 2130837593, 2130837594, 2130837595, 2130837596, 2130837599, 2130837604, 2130837605, 2130837616, 2130837632, 2130837633, 2130837634, 2130837635, 2130837636, 2130837641, 2130837644, 2130837666, 2130837673, 2130837684, 2130837687, 2130837688, 2130837715, 2130837718, 2130837745, 2130837754};
                    ActionBarLayout = new int[]{R.attr.layout_gravity};
                    if (C0164.m1359() >= 0) {
                        break;
                    } else {
                        str = "۟۠ۨ";
                        break;
                    }
            }
        }
    }

    private C0356() {
    }
}
