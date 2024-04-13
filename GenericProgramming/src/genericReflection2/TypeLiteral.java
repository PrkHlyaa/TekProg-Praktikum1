package genericReflection2;

import java.lang.reflect.*;

/**
 * A type literal describes a type that can be generic, such as ArrayList<String>. 
 */
class TypeLiteral<T> {
    private Type type;

    /**
     * This constructor must be invoked from an anonymous subclass 
     * as new TypeLiteral<. . .>(){}
     */
    public TypeLiteral() {
        Type parentType = getClass().getGenericSuperclass();
        if (parentType instanceof ParameterizedType) {
            type = ((ParameterizedType) parentType).getActualTypeArguments()[0];
        } else {
            throw new UnsupportedOperationException("Construct as new TypeLiteral<. . .>(){}");
        }
    }

    private TypeLiteral(Type type) {
        this.type = type;
    }

    /**
     * Yields a type literal that describes the given type. 
     */
    public static TypeLiteral<?> of(Type type) {
        return new TypeLiteral<Object>(type);
    }

    public String toString() {
        if (type instanceof Class) 
            return ((Class<?>) type).getName();
        else 
            return type.toString();
    }

    public boolean equals(Object otherObject) {
        return otherObject instanceof TypeLiteral && type.equals(((TypeLiteral<?>) otherObject).type);
    }

    public int hashCode() {
        return type.hashCode();
    }
}