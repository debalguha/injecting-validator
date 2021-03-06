package com.sankar.injectingvalidator;

import java.lang.reflect.Type;

public interface ValueResolver {
	Object lookup(String path, Class<?> type, Type genericType) throws UnmatchedTypeException;
	Object lookup(String pathPrefix, String path, Class<?> type, Type genericType) throws UnmatchedTypeException;
}
