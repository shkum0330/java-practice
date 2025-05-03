package annotation.java;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningCase {

    @SuppressWarnings("unused")
    public void unusedWarning() {
        int unusedVariable = 10;
    }

    @SuppressWarnings("deprecation")
    public void deprecatedMethod() {
        java.util.Date date = new java.util.Date();
        int date1 = date.getDate();
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public void uncheckedCast(){
        List list=new ArrayList();

        List<String> stringList=(List<String>)list;
    }

    @SuppressWarnings("all")
    public void suppressAllWarning() {
        // 모든 경고 억제
        java.util.Date date = new java.util.Date();
        date.getDate();
        List list = new ArrayList();
        List<String> stringList = (List<String>)list;
    }
}
