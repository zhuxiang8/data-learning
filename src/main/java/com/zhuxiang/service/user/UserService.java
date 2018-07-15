package com.zhuxiang.service.user;

import com.baomidou.mybatisplus.service.IService;
import com.zhuxiang.common.base.pojo.vo.PageVO;
import com.zhuxiang.controller.web.user.req.CreateUserReq;
import com.zhuxiang.controller.web.user.req.SearchUserReq;
import com.zhuxiang.controller.web.user.req.UpdateUserReq;
import com.zhuxiang.pojo.entity.user.User;
import com.zhuxiang.pojo.vo.web.user.UserVO;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/2 15:09
 */
public interface UserService extends IService<User> {
    /**
     * 新增用户
     *
     * @param req
     */
    void insert(CreateUserReq req);

    /**
     *更新用户
     *
     * @param req
     */
    void update(UpdateUserReq req);

    /**
     * 删除用户
     *
     * @param id
     */
    void delete(Long id);

    /**
     * 查询单个用户
     *
     * @param userId
     */
    UserVO find(Long userId);

    /**
     * 模糊查询
     *
     * @param req
     * @return
     */
    PageVO<UserVO> search(SearchUserReq req);
}
