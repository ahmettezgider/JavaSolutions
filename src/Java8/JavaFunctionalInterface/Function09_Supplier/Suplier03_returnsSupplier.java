package Java8.JavaFunctionalInterface.Function09_Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

// Returns a Supplier
public class Suplier03_returnsSupplier<T> {

    public static void main(String[] args) {

        Suplier03_returnsSupplier<String> obj = new Suplier03_returnsSupplier();

        List<String> list = obj.supplier().get();

    }

    public Supplier<List<T>> supplier() {

        // lambda
        // return () -> new ArrayList<>();

        // constructor reference
        return ArrayList::new;

    }
}
