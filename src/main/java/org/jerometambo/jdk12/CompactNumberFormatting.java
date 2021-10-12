package org.jerometambo.jdk12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {
    
    public static void main(String[] args) {
        NumberFormat likesUS = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        likesUS.setMaximumFractionDigits(1);
        
        System.out.println(likesUS.format(3592) + " likes");
        
        NumberFormat likesUS2 = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        likesUS2.setMaximumFractionDigits(2);
        System.out.println(likesUS2.format(3011) + " likes");
        
        NumberFormat likesFR = NumberFormat
                .getCompactNumberInstance(new Locale("fr", "FR"), NumberFormat.Style.SHORT);
        likesFR.setMaximumFractionDigits(1);
        
        System.out.println(likesFR.format(3592) + " likes");
        
        NumberFormat likesFR2 = NumberFormat
                .getCompactNumberInstance(new Locale("fr", "FR"), NumberFormat.Style.LONG);
        likesFR2.setMaximumFractionDigits(2);
        System.out.println(likesFR2.format(30000) + " likes");
        
        
    }
    
}