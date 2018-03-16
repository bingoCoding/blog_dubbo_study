package com.bingo.bloginterface.service;

import com.bingo.bloginterface.Entity.SysMenu;

import java.util.List;

public interface SysMenuService {

    List<SysMenu> selectList(SysMenu o);

    List<SysMenu> getUserMenuList(Long userId);

    List<SysMenu> queryListParentId(Long parentId, List<Long> menuIdList);

    List<SysMenu> queryListParentId(Long parentId);
}
