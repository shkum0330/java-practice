package compare;

import java.util.HashMap;
import java.util.Map;

public class ShapeConvertor {

    public static String convert(int key){
        if(key==0) return "♠";
        if(key==1) return "♥";
        if(key==2) return "\u2666";
        if(key==3) return "♣";
        return null;
    }
}
