package com.example.hospital.patient.wx.api.config;

import cn.dev33.satoken.stp.StpInterface;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @className StpInterfaceImpl
 * @description TODO
 * @author: LM理智梦
 * @date: 2023/9/6
 * @version: 1.0
 */
@Component
public class StpInterfaceImpl implements StpInterface {


    /**
     * 返回一个用户所拥有的权限集合
     */
    @Override
    public List<String> getPermissionList(Object loginId, String loginKey) {
        return null;
    }


    /**
     * 返回一个用户所拥有的角色标识集合
     */
    @Override
    public List<String> getRoleList(Object loginId, String loginKey) {
        return null;
    }

}