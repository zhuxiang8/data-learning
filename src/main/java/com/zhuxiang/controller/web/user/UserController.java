package com.zhuxiang.controller.web.user;

import com.zhuxiang.common.base.controller.response.AbstractResponse;
import com.zhuxiang.common.base.controller.response.DataResponse;
import com.zhuxiang.common.base.controller.response.ObjectResponse;
import com.zhuxiang.common.base.controller.response.PageResponse;
import com.zhuxiang.common.base.pojo.vo.PageVO;
import com.zhuxiang.controller.web.user.req.CreateUserReq;
import com.zhuxiang.controller.web.user.req.SearchUserReq;
import com.zhuxiang.controller.web.user.req.UpdateUserReq;
import com.zhuxiang.pojo.vo.web.user.UserVO;
import com.zhuxiang.service.user.UserService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author:zhuxiang
 * @Date:2018/7/15 10:19
 */
@Api(tags = "用户注册controller")
@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户创建
     *
     * @return
     */
    @ApiOperation(value = "用户注册", notes = "输入用户名、密码等信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "loginName", value = "登录名", required = true, paramType = "path", dataType = "Integer"),
            @ApiImplicitParam(name = "userName", value = "用户名", required = true, paramType = "path", dataType = "Integer"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "path", dataType = "Integer")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful — 请求已完成"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")}
    )
    @PostMapping
    public AbstractResponse insert(@RequestBody @Validated CreateUserReq request) {
        userService.insert(request);
        return DataResponse.getInstance().success();
    }

    /**
     * 用户更新
     *
     * @return
     */
    @PutMapping
    public AbstractResponse update(@RequestBody @Validated UpdateUserReq request) {
        userService.update(request);
        return DataResponse.getInstance().success();
    }

    /**
     * 查询单个用户
     *
     * @return
     */
    @ApiOperation(value = "查询单个用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", required = true, paramType = "path", dataType = "Integer")
    })
    @GetMapping("/{id}")
    public AbstractResponse find(@PathVariable Long id) {
        log.info("查询单个用户={}", id);
        UserVO userVO = userService.find(id);
        return ObjectResponse.getInstance().success(userVO);
    }

    /**
     * 分页查询用户信息
     *
     * @return
     */
    @PostMapping("/list")
    public PageResponse<UserVO> search(@RequestBody SearchUserReq req) {
        PageVO<UserVO> userVOPage = userService.search(req);
        return PageResponse.getInstance().success(userVOPage);
    }
}
