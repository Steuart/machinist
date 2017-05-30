package top.joylife.machinist.service.impl;

import org.springframework.stereotype.Service;
import top.joylife.machinist.dao.TestMapper;
import top.joylife.machinist.model.entity.Test;
import top.joylife.machinist.service.TestService;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/30 0030.
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public Test getTest() {
        Test test = testMapper.selectByPrimaryKey(1);
        return test;
    }
}
