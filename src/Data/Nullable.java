    public static Object $null = null;

    public static Object nullable = (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (r) ->
        (java.util.function.Function<Object, Object>) (f) -> a == null ? r : ((java.util.function.Function<Object, Object>) f).apply(a);

    public static Object notNull = (java.util.function.Function<Object, Object>) (x) -> x;
