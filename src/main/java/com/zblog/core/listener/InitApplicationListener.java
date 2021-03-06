package com.zblog.core.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.zblog.core.plugin.ApplicationContextUtil;
import com.zblog.core.util.constants.CategoryConstants;
import com.zblog.core.util.constants.WebConstants;
import com.zblog.service.CategoryService;

public class InitApplicationListener implements ServletContextListener{
  @Override
  public void contextInitialized(ServletContextEvent sce){
    WebConstants.APPLICATION_PATH = sce.getServletContext().getRealPath("/");
    
    initApp();
  }

  private void initApp(){
    CategoryService categoryService = ApplicationContextUtil.getBean(CategoryService.class);
    if(categoryService.loadByName(CategoryConstants.ROOT) == null){
      categoryService.init();
    }
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce){

  }

}
