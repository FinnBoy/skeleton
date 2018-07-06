package net.awaken.core.resource;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public abstract class ScannerBase implements Scanner {

    private String pathSeparator = DEFAULT_PATH_SEPARATOR;

    public void setPathSeparator(String pathSeparator) {
        this.pathSeparator = pathSeparator;
    }

    protected boolean containsWildcard(String path) {
        return (path.indexOf('*') != -1 || path.indexOf('?') != -1);
    }

    protected String getRootDirWithoutWildcard(String location) {
        int prefixEnd = location.indexOf(":") + 1;
        int rootDirEnd = location.length();
        while (rootDirEnd > prefixEnd && containsWildcard(location.substring(prefixEnd, rootDirEnd))) {
            rootDirEnd = location.lastIndexOf('/', rootDirEnd - 2) + 1;
        }
        if (rootDirEnd == 0) {
            rootDirEnd = prefixEnd;
        }
        return location.substring(0, rootDirEnd);
    }

    protected String getClasspathLocation(String path) {
        if (path.startsWith(CLASSPATH_URL_PREFIX)) {
            return path.substring(CLASSPATH_URL_PREFIX.length());
        }
        if (path.startsWith(CLASSPATH_ALL_URL_PREFIX)) {
            return path.substring(CLASSPATH_ALL_URL_PREFIX.length());
        }
        return null;
    }

    protected boolean isClasspathPattern(String path) {
        if (path.startsWith(CLASSPATH_URL_PREFIX)) {
            return true;
        }
        if (path.startsWith(CLASSPATH_ALL_URL_PREFIX)) {
            return true;
        }
        return false;
    }

    protected boolean isFilePattern(String path) {
        if (path.startsWith(FILE_URL_PREFIX)) {
            return true;
        }
        // TODO
        return false;
    }
}
