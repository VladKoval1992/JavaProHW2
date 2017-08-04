import java.lang.annotation.ElementType;
        import java.lang.annotation.Retention;
        import java.lang.annotation.RetentionPolicy;
        import java.lang.annotation.Target;


@Retention(value= RetentionPolicy.RUNTIME)
@interface SaveTo{
    String path() ;
}
@Target(value= ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
@interface Saver{
}
