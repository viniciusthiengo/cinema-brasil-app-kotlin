package br.com.thiengo.cinamebrasilapp_kotlin.util;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;


public class Font {

    public static void setFascinateInline(TextView tv){
        Typeface face = Typeface.createFromAsset( tv.getContext().getAssets(), "FascinateInline.ttf");
        tv.setTypeface( face );
    }

    public static Typeface getFascinateInline(Context context){
        return Typeface.createFromAsset( context.getAssets(), "FascinateInline.ttf");
    }

    public static void setAmaticSC(TextView tv){
        Typeface face = Typeface.createFromAsset( tv.getContext().getAssets(), "AmaticSC.ttf");
        tv.setTypeface( face );
    }

    public static Typeface getAmaticSC(Context context){
        return Typeface.createFromAsset( context.getAssets(), "AmaticSC.ttf");
    }
}
