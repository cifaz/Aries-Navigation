package com.kuretru.web.navigation.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kuretru.web.navigation.entity.data.WebTagDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Mapper
@Repository
public interface WebTagMapper extends BaseMapper<WebTagDO> {

    /**
     * 查询数据库中当前最大的排序号
     *
     * @return 最大的排序号
     */
    Integer getMaxSequence();

}
