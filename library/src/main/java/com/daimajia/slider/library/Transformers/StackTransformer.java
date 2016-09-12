package com.daimajia.slider.library.Transformers;

import android.os.Build;
import android.view.View;


public class StackTransformer extends BaseTransformer
{

    @Override
    protected void onTransform(View view, float position)
    {

        {
            float translationVal = position < 0 ? 0f : -(view.getWidth() * position);

            view.setTranslationX(translationVal);
        }
    }

}
