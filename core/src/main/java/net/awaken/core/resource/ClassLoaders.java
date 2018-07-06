package net.awaken.core.resource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

/**
 * ClassLoader Basic Utility Class.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public class ClassLoaders {

    ClassLoader systemClassLoader;

    ClassLoader defaultClassLoader;

    public ClassLoaders() {
        try {
            systemClassLoader = ClassLoader.getSystemClassLoader();
        } catch (SecurityException ignored) {
        }
    }

    /**
     * Get InputStream from specified ClassLoader.
     *
     * @param resource             the resource to locate
     * @param specifiedClassLoader the class loaders to examine
     * @return InputStream
     */
    InputStream getResourceAsStream(String resource, ClassLoader specifiedClassLoader) {
        if (specifiedClassLoader == null) {
            return null;
        }

        // try to find the resource as passed
        InputStream returnValue = specifiedClassLoader.getResourceAsStream(resource);

        // now, some class loaders want this leading "/", so we'll add it and try again if we didn't find the resource
        if (null == returnValue) {
            returnValue = specifiedClassLoader.getResourceAsStream("/" + resource);
        }

        if (null != returnValue) {
            return returnValue;
        }
        return null;
    }

    /**
     * Get URL from specified ClassLoader.
     *
     * @param resource             the resource to locate
     * @param specifiedClassLoader the class loaders to examine
     * @return a URL
     */
    URL getResource(String resource, ClassLoader specifiedClassLoader) {
        if (specifiedClassLoader == null) {
            return null;
        }

        // look for the resource as passed in...
        URL url = specifiedClassLoader.getResource(resource);

        // ...but some class loaders want this leading "/", so we'll add it
        // and try again if we didn't find the resource
        if (null == url) {
            url = specifiedClassLoader.getResource("/" + resource);
        }

        // "It's always in the last place I look for it!"
        // ... because only an idiot would keep looking for it after finding it, so stop looking already.
        if (null != url) {
            return url;
        }

        // didn't find it anywhere.
        return null;
    }

    /**
     * Get URLs from specified ClassLoader.
     *
     * @param resource             the resource to locate
     * @param specifiedClassLoader the class loaders to examine
     * @return URLs
     * @throws IOException
     */
    Enumeration<URL> getResources(String resource, ClassLoader specifiedClassLoader) throws IOException {
        if (specifiedClassLoader == null) {
            return null;
        }

        // look for the resource as passed in...
        Enumeration<URL> urls = specifiedClassLoader.getResources(resource);

        // ...but some class loaders want this leading "/", so we'll add it
        // and try again if we didn't find the resource
        if (null == urls) {
            urls = specifiedClassLoader.getResources("/" + resource);
        }

        // "It's always in the last place I look for it!"
        // ... because only an idiot would keep looking for it after finding it, so stop looking already.
        if (null != urls) {
            return urls;
        }

        // didn't find it anywhere.
        return null;
    }

    /**
     * Attempt to load & initialize a class from a specified ClassLoader.
     *
     * @param name                 the class to load
     * @param specifiedClassLoader the class loaders to examine
     * @return the Class
     * @throws ClassNotFoundException
     */
    Class<?> classForName(String name, ClassLoader specifiedClassLoader) throws ClassNotFoundException {
        if (specifiedClassLoader == null) {
            throw new IllegalArgumentException("specifiedClassLoader can not be null.");
        }
        Class<?> c = null;
        try {
            c = Class.forName(name, true, specifiedClassLoader);
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException("Cannot find class: " + name);
        }
        return c;
    }

    /**
     * Attempt to load a class from a specified ClassLoader.
     *
     * @param name                 the class to load
     * @param specifiedClassLoader the class loaders to examine
     * @return the Class
     * @throws ClassNotFoundException
     */
    Class<?> loadClass(String name, ClassLoader specifiedClassLoader) throws ClassNotFoundException {
        if (specifiedClassLoader == null) {
            throw new IllegalArgumentException("specifiedClassLoader can not be null.");
        }
        Class<?> c = null;
        try {
            c = specifiedClassLoader.loadClass(name);
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException("Cannot find class: " + name);
        }
        return c;
    }

    public void setDefaultClassLoader(ClassLoader defaultClassLoader) {
        this.defaultClassLoader = defaultClassLoader;
    }

    public ClassLoader getContextClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }

    public ClassLoader getDefaultClassLoader() {
        return defaultClassLoader;
    }

    public ClassLoader getSystemClassLoader() {
        return systemClassLoader;
    }

    public ClassLoader getThisClassLoader() {
        return getClass().getClassLoader();
    }
}
