package com.booway.dataview.dashboard.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.mvc.LastModified;

import com.booway.dataview.application.biz.AppInfoBiz;
import com.booway.daer;
import com.booway.dataview.dashboard.biz.DashboardInfoBiz;
import com.booway.dataview.dashboard.biz.DashboardTagInfoBiz;
import com.booway.dataview.dashboard.biz.DashboardTagRelInfoBiz;
import com.booway.dataview.security.utils.SecurityUtils;
import com.booway.dataview.uam.api.entity.UserInfo;
import com.booway.dataview.uam.biz.UserInfoBiz;

/**
 * 控制层基类
 * @author ljq
 */
public abstract class AbstractBaseController extends BaseController implements LastModified, Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    @Autowired
    public UserInfoBiz userInfoBiz;
    
    @Autowired
    public PageInfoBiz pageInfoBiz;
    
    @Autowired
    public AppInfoBiz appInfoBiz;
    
    @Autowired
    public DashboardTagRelInfoBiz dashboardTagRelInfoBiz;
    
    @Autowired
    public DashboardTagInfoBiz dashboardTagInfoBiz;
    
    @Autowired
    public DashboardInfoBiz dashboardInfoBiz;

    AbstractBaseController()
    {
    	
    }

    }

    /**
     * @Description: 获取当前用户信息
     */
    public UserInfo getCurrentUserInfo()
    {
       
    }

    public UserInfo getUserInfo(String loginName)
    {
}
