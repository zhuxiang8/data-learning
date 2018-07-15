package com.zhuxiang.service.user.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhuxiang.common.base.pojo.vo.PageVO;
import com.zhuxiang.controller.web.user.req.CreateUserReq;
import com.zhuxiang.controller.web.user.req.SearchUserReq;
import com.zhuxiang.controller.web.user.req.UpdateUserReq;
import com.zhuxiang.mapper.user.UserMapper;
import com.zhuxiang.pojo.entity.user.User;
import com.zhuxiang.pojo.vo.web.user.UserVO;
import com.zhuxiang.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 用户实现类
 * @Author zhuxiang
 * @Date 2018/4/2 15:11
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    /**
     * 新增用户
     *
     * @param req
     */
    @Override
    @Transactional
    public void insert(CreateUserReq req) {
        log.info("新增用户={}", req);
        User user = new User();
        user.setLoginName(req.getLoginName());
        user.setUserName(req.getUserName());
        user.setPassword(req.getPassword());
        baseMapper.insert(user);
    }

    /**
     * 更新用户
     *
     * @param req
     */
    @Override
    public void update(UpdateUserReq req) {
        log.info("更新用户={}", req);
        User user = new User();
        user.setId(req.getId());
        user.setUserName(req.getUserName());
        baseMapper.updateById(user);
    }

    /**
     * 删除用户
     *
     * @param id
     */
    @Override
    public void delete(Long id) {

    }

    /**
     * 查询单个用户
     *
     * @param userId
     */
    @Override
    public UserVO find(Long userId) {
        log.info("查询单个用户={}", userId);
        User user = baseMapper.selectById(userId);
        return UserVO.getVO(user);
    }

    /**
     * 模糊查询
     *
     * @param req
     * @return
     */
    @Override
    public PageVO<UserVO> search(SearchUserReq req) {
        return null;
    }
}
