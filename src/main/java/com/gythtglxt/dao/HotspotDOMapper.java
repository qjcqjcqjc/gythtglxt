package com.gythtglxt.dao;

import com.gythtglxt.dataobject.HotspotDO;
import com.gythtglxt.dataobject.HotspotDOKey;

public interface HotspotDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_natmeha_hotspot
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    int deleteByPrimaryKey(HotspotDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_natmeha_hotspot
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    int insert(HotspotDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_natmeha_hotspot
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    int insertSelective(HotspotDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_natmeha_hotspot
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    HotspotDO selectByPrimaryKey(HotspotDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_natmeha_hotspot
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    int updateByPrimaryKeySelective(HotspotDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_natmeha_hotspot
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(HotspotDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_natmeha_hotspot
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    int updateByPrimaryKey(HotspotDO record);
}