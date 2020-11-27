package com.gythtglxt.service;

import com.gythtglxt.dataobject.HotspotDO;
import com.gythtglxt.dataobject.HotspotDOKey;

import java.util.List;

/**
 * Author:wangzh
 * Date: 2020/11/26 17:41
 * Version: 1.0
 */
public interface IHotspotService {
    HotspotDO getHotspot(HotspotDOKey key, String dataType);
    List<HotspotDO> getAll(String dataType, List<String> dataStatus);
    int addHotspot(HotspotDO record);
    int removeHotspot(HotspotDOKey key);
    int updateHotspot(HotspotDO record);
}