
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Lab_9 {
    public static void main(String[] args) {
        performMethod(TestClass.class.getName(), "printTestText");
    }

    public static void performMethod(String className, String methodName) {
        try {
            Class<?> clazz = Class.forName(className);
            Object currentObject = (Object) clazz.newInstance();
            Method currentMethod = clazz.getDeclaredMethod(methodName);
            currentMethod.invoke(currentObject);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}