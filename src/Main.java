import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?> conteiner = TextContainer.class;
        try {
            if (conteiner.isAnnotationPresent(SaveTo.class)) {
                String path = conteiner.getDeclaredAnnotation(SaveTo.class).path();
                Method[] methods = conteiner.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(Saver.class)) {
                        method.invoke(new TextContainer(), path);
                    }
                }
            }
        } catch (ReflectiveOperationException e){
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}