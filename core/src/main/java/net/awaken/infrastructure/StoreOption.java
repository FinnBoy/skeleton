package net.awaken.infrastructure;

/**
 * connection type which you will connect to Server by.
 */
public enum StoreOption {
    /**
     *
     */
    DB,
    /**
     *
     */
    Http,
    /**
     *
     */
    Smtp,
    /**
     *
     */
    Ftp,
    /**
     * Customized RPC
     */
    Rpc;
}
