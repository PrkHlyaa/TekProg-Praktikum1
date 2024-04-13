package genericReflection2;

import java.lang.reflect.*;
import java.util.*;
import java.util.function.*;

/**
 * Formats objects, using rules that associate types with formatting functions.
 */
class Formatter {
    private Map<TypeLiteral<?>, Function<?, String>> rules = new HashMap<>();

    /**
     * Add a formatting rule to this formatter.
     * @param type the type to which this rule applies
     * @param formatterForType the function that formats objects of this type
     */
    public <T> void forType(TypeLiteral<T> type, Function<T, String> formatterForType) {
        rules.put(type, formatterForType);
    }

    /**
     * Formats all fields of an object using the rules of this formatter.
     * @param obj an object
     * @return a string with all field names and formatted values
     */
    public String formatFields(Object obj) throws IllegalArgumentException, IllegalAccessException {
        var result = new StringBuilder();
        for (Field f : obj.getClass().getDeclaredFields()) {
            result.append(f.getName());
            result.append("=");
            f.setAccessible(true);
            Function<?, String> formatterForType = rules.get(TypeLiteral.of(f.getGenericType()));
            if (formatterForType != null) {
                @SuppressWarnings("unchecked")
                Function<Object, String> objectFormatter = (Function<Object, String>) formatterForType;
                result.append(objectFormatter.apply(f.get(obj)));
            } else {
                result.append(f.get(obj).toString());
            }
            result.append("\n");
        }
        return result.toString();
    }
}