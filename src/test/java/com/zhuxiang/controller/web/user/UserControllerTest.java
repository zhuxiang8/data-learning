package com.zhuxiang.controller.web.user;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Description
 * @Author:zhuxiang
 * @Date:2018/7/15 16:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@WebAppConfiguration
@Slf4j
public class UserControllerTest {

    private MockMvc mvc;

    @Autowired
    private WebApplicationContext context;


    @Autowired
    UserController userController;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() {
    }

    @Test
    public void update() {
    }

    @Test
    public void find() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.get("/api/user/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        log.info("查找单个用户={}" + result.getResponse().getContentAsString());
    }

    @Test
    public void search() {
    }
}