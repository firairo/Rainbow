public interface StringPrinter {
    default void print(String string){
        System.out.println(string);
    }
}
