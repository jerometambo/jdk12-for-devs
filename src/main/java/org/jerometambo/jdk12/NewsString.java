package org.jerometambo.jdk12;

import java.util.Arrays;
import java.util.List;

public class NewsString {
    
    public static void main(String... args) {
        indent();
    
        transform();
    }
    
    private static void transform() {
        String s = "Space,Soul,Power,Time,Reality,Mind";
        List<String> infinityStones = s.transform(s1 -> {return Arrays.asList(s1.split(","));});
        System.out.println(infinityStones);
    }
    
    private static void indent() {
        String str = "*****\nT'es tendue comme une crampe\n  \tMais nan j'suis pas tendue\rSi t'es tendue !\n*****";
        System.out.println(str.indent(0));
        System.out.println(str.indent(3));
        System.out.println(str.indent(-3));
    }
}
