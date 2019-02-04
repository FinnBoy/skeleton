package net.awaken.core.infrastructure.network;

/**
 * connection type which you will connect to Server by.
 */
public enum StoreOption {
    /**
     *
     */
    DB(1),
    /**
     *
     */
    HTTP(2),
    /**
     *
     */
    SMTP(3),
    /**
     *
     */
    FTP(4),
    /**
     * Customized RPC
     */
    RPC(5);

    private int state;

    private StoreOption(int state) {
        this.state = state;
    }
}
