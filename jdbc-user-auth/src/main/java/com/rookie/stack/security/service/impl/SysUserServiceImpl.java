package com.rookie.stack.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.rookie.stack.security.domain.SysUser;
import com.rookie.stack.security.mapper.SysUserMapper;
import com.rookie.stack.security.service.SysUserService;
import jakarta.annotation.Resource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
* @author eumenides
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2024-09-05 23:39:17
*/
@Service
public class SysUserServiceImpl implements UserDetailsService {
    @Resource
    private SysUserMapper userMapper;

    // 因为这里只是做简单的登录认证，关于具体的权限等我们后面接着聊。
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = userMapper.selectUserByUsername(username);
        if (sysUser == null) {
            throw new UsernameNotFoundException("用户名不存在！");
        }
        return sysUser;
    }
}




