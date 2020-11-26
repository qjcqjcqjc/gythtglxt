package com.gythtglxt.dao;

import com.gythtglxt.dataobject.LogDO;
import com.gythtglxt.dataobject.LogDOKey;

public interface LogDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 26 12:29:36 CST 2020
     */
    int deleteByPrimaryKey(LogDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 26 12:29:36 CST 2020
     */
    int insert(LogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 26 12:29:36 CST 2020
     */
    int insertSelective(LogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 26 12:29:36 CST 2020
     */
    LogDO selectByPrimaryKey(LogDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 26 12:29:36 CST 2020
     */
    int updateByPrimaryKeySelective(LogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log
     *
     * @mbg.generated Thu Nov 26 12:29:36 CST 2020
     */
    int updateByPrimaryKey(LogDO record);
}