package com.rookie.stack.security.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rookie.stack.security.domain.SysUser;
import org.springframework.stereotype.Repository;

/**
* @author eumenides
* @description 针对表【sys_user】的数据库操作Mapper
* @createDate 2024-09-05 23:29:33
* @Entity generator.domain.SysUser
*/

public interface SysUserMapper extends BaseMapper<SysUser> {

    SysUser selectUserByUsername(String username);
}




