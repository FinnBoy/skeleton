package net.awaken.core;

/**
 * Interface for delegation which will invoke actual handling.
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 06.24.2018
 */
public interface Service {

    Response execute(Request request);

    /*~~~~~~~~ Resource ~~~~~~~~*/

    void search();

    void create();

    void modifyParts();

    void modify();

    void remove();

    /*~~~~~~~~ Service ~~~~~~~~*/

    void perform();

    void proceed();

    void handle();

    /*~~~~~~~~ Document ~~~~~~~~*/

    void download();

    void upload();

    void upgrade();

    void discard();

    /*~~~~~~~~ Report ~~~~~~~~*/

    void inline();

    void attachment();
}
