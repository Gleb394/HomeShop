package com.homeShop.dao;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Gleb on 01.02.18.
 */
public interface GetFirstAndLastId {

    Integer getFirstElem () throws IOException, SQLException;
    Integer getLastElem () throws IOException, SQLException;

}
