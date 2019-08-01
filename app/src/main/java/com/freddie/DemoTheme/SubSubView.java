package com.freddie.DemoTheme;

import android.content.Context;
import android.util.AttributeSet;

public class SubSubView extends SubView {
    public SubSubView(Context context) {
        super(context);
    }

    public SubSubView(Context context, AttributeSet attrs) {
        super(context,attrs,0,R.style.SubSubSubView);
    }
}
