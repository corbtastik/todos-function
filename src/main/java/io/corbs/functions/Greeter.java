package io.corbs.functions;

import java.util.function.Function;

public class Greeter implements Function<String, String> {

    @Override
    public String apply(String name) {
        return "Hello " + name;
    }
}
