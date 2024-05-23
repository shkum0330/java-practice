package generic.ex2;

public class UnitUtil {

    public static <T extends BioUnit> T maxHp(T t1, T t2) {
        T resultUnit;
        if(t1.getHp()> t2.getHp()){
            resultUnit=t1;
        }else{
            resultUnit=t2;
        }
        return resultUnit;
    }

}
