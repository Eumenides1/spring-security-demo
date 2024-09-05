package com.rookie.stack.security.test;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rookie.stack.security.Application;
import com.rookie.stack.security.domain.SysUser;
import com.rookie.stack.security.mapper.SysUserMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author eumenides
 * @description
 * @date 2024/9/5
 */
@SpringBootTest(classes = Application.class)
public class ApiTest {
    @Resource
    SysUserMapper sysUserMapper;

    /**
     *  用于测试: 测试代码是否正常
     */
    @Test
    public void test01() {
        SysUser admin = sysUserMapper.selectById(1);
        System.out.println(admin);
    }

}
