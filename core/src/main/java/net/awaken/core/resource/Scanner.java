package net.awaken.core.resource;

/**
 * Strategy interface for scanning resources (e.. class path or file system
 * resources).
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Scanner {

    String WILDCARD_DIRECTORIES = "**";

    String WILDCARD_CHARACTERS = "*";

    String WILDCARD_SINGLE_CHARACTER = "?";

    String DEFAULT_PATH_SEPARATOR = "/";

    /** Pseudo URL prefix for loading from the class path: "classpath*:" */
    String CLASSPATH_ALL_URL_PREFIX = "classpath*:";

    /** Pseudo URL prefix for loading from the class path: "classpath:" */
    String CLASSPATH_URL_PREFIX = "classpath:";

    /** URL prefix for loading from the file system: "file:" */
    String FILE_URL_PREFIX = "file:";

    /** URL protocol for a file in the file system: "file" */
    String URL_PROTOCOL_FILE = "file";

    /** URL protocol for an entry from a jar file: "jar" */
    String URL_PROTOCOL_JAR = "jar";

    /** URL protocol for an entry from a zip file: "zip" */
    String URL_PROTOCOL_ZIP = "zip";

    /** URL protocol for an entry from a WebSphere jar file: "wsjar" */
    String URL_PROTOCOL_WSJAR = "wsjar";

    /** URL protocol for an entry from a JBoss jar file: "vfszip" */
    String URL_PROTOCOL_VFSZIP = "vfszip";

    /** URL protocol for a JBoss file system resource: "vfsfile" */
    String URL_PROTOCOL_VFSFILE = "vfsfile";

    /** URL protocol for a general JBoss VFS resource: "vfs" */
    String URL_PROTOCOL_VFS = "vfs";

    /** URL protocol for an entry from an OC4J jar file: "code-source" */
    String URL_PROTOCOL_CODE_SOURCE = "code-source";

    /** Separator between JAR URL and file path within the JAR */
    String JAR_URL_SEPARATOR = "!/";

    Resource seek(String location);

    Resource[] seekAll(String locationPattern);
}
