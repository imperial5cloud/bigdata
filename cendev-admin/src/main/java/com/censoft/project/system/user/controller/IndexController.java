package com.censoft.project.system.user.controller;

import com.censoft.framework.config.CenDevonfig;
import com.censoft.framework.web.controller.BaseController;
import com.censoft.project.system.menu.domain.Menu;
import com.censoft.project.system.menu.service.IMenuService;
import com.censoft.project.system.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 首页 业务处理
 * 
 * @author censoft
 */
@Controller
public class IndexController extends BaseController
{
    @Autowired
    private IMenuService menuService;

    @Autowired
    private CenDevonfig cenDevonfig;

    // 系统首页
    @GetMapping("/index")
    public String index(Model model)
    {
        // 取身份信息
        User user = getUser();
        // 根据用户id取出菜单
        List<Menu> menus = menuService.selectMenusByUserId(user.getUserId());
        model.addAttribute("menus", menus);
        model.addAttribute("user", user);
        model.addAttribute("name", cenDevonfig.getName());
        model.addAttribute("version", cenDevonfig.getVersion());
        model.addAttribute("description", cenDevonfig.getDescription());
        model.addAttribute("copyrightYear", cenDevonfig.getCopyrightYear());
        return "index";
    }

    // 系统介绍
    @GetMapping("/system/main")
    public String main(Model model)
    {
        model.addAttribute("version", cenDevonfig.getVersion());
        return "main";
    }

}
