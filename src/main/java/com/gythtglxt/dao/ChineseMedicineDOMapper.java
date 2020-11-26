package com.gythtglxt.dao;

import com.gythtglxt.dataobject.ChineseMedicineDO;
import com.gythtglxt.dataobject.ChineseMedicineDOKey;

public interface ChineseMedicineDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_natmeha_chinese_medicine
     *
     * @mbg.generated Thu Nov 26 12:29:36 CST 2020
     */
    int deleteByPrimaryKey(ChineseMedicineDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_natmeha_chinese_medicine
     *
     * @mbg.generated Thu Nov 26 12:29:36 CST 2020
     */
    int insert(ChineseMedicineDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_natmeha_chinese_medicine
     *
     * @mbg.generated Thu Nov 26 12:29:36 CST 2020
     */
    int insertSelective(ChineseMedicineDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_natmeha_chinese_medicine
     *
     * @mbg.generated Thu Nov 26 12:29:36 CST 2020
     */
    ChineseMedicineDO selectByPrimaryKey(ChineseMedicineDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_natmeha_chinese_medicine
     *
     * @mbg.generated Thu Nov 26 12:29:36 CST 2020
     */
    int updateByPrimaryKeySelective(ChineseMedicineDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_natmeha_chinese_medicine
     *
     * @mbg.generated Thu Nov 26 12:29:36 CST 2020
     */
    int updateByPrimaryKey(ChineseMedicineDO record);
}