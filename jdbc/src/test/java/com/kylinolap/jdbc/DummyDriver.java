package com.kylinolap.jdbc;

import com.kylinolap.jdbc.Driver;

/**
 * @author xduo
 * 
 */
public class DummyDriver extends Driver {

    @Override
    protected String getFactoryClassName(JdbcVersion jdbcVersion) {
        return "com.kylinolap.kylin.jdbc.DummyJdbc41Factory";
    }

}
