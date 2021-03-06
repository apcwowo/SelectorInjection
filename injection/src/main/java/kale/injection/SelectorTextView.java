package kale.injection;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

public class SelectorTextView extends TextView {

    public SelectorTextView(Context context) {
        super(context);
    }

    public SelectorTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public SelectorTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.SelectorImageButton);
        SelectorInjection injection = new SelectorInjection(this, array);
        injection.injection();
        array.recycle();

        setClickable(true);
        setGravity(Gravity.CENTER);
    }


    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (!enabled) {
            setAlpha(0.3f);
        }
    }
}