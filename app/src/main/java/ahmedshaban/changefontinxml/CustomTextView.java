package ahmedshaban.changefontinxml;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Ahmed shaban on 2/17/2018.
 */

public class CustomTextView extends TextView {
    private  String font = null;
    public CustomTextView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        init(context);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);


        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.font_family);
        font = a.getString(R.styleable.font_family_fontPath);

        Typeface   tf = null;
        try {
               tf = Typeface.createFromAsset(context.getAssets(), font);
        } catch (Exception e) {
            Log.d("customFontError","Error parsing font");
        }

        setTypeface(tf);
        a.recycle();
    }
}
