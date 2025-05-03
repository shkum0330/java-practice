package annotation.mapping;

import java.lang.reflect.Method;

public class TestControllerMain {
    public static void main(String[] args) {
        TestController testController = new TestController();

        Class<? extends TestController> clazz = testController.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            SimpleMapping simpleMapping = method.getAnnotation(SimpleMapping.class);
            if(simpleMapping != null) {
                System.out.println("["+simpleMapping.value() + "] -> " + method);
            }
        }
    }
}
