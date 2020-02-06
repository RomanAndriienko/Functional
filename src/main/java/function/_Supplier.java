package function;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlsSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDBConnectionUrlsSupplier = ()
            -> Lists.newArrayList(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/customer");

}
