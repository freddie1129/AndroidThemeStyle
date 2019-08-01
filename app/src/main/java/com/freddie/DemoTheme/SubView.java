package com.freddie.DemoTheme;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class SubView extends View {
    public SubView(Context context) {
        super(context);
    }

    public SubView(Context context, AttributeSet attrs) {
      //  this(context, attrs, R.attr.styleSubView,0);
        super(context,attrs, R.attr.styleSubView,0);
    }

    public SubView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
