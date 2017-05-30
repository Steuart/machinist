package top.joylife.machinist.dao;

import org.apache.ibatis.annotations.Mapper;
import top.joylife.machinist.model.entity.Test;

@Mapper
public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}