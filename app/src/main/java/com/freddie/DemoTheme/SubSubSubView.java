package com.freddie.DemoTheme;

import android.content.Context;
import android.util.AttributeSet;

public class SubSubSubView extends SubView {
    public SubSubSubView(Context context) {
        super(context);
    }

    public SubSubSubView(Context context, AttributeSet attrs) {
        super(context, attrs, R.attr.styleSubSubView,R.style.SubSubSubView);
    }


}
