package com.censoft.framework.web.page;

import com.censoft.common.utils.ServletUtils;
import com.censoft.common.constant.Constants;

/**
 * 表格数据处理
 * 
 * @author censoft
 */
public class TableSupport
{
    /**
     * 封装分页对象
     */
    public static PageDomain getPageDomain()
    {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(Constants.PAGENUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(Constants.PAGESIZE));
        pageDomain.setOrderByColumn(ServletUtils.getParameter(Constants.ORDERBYCOLUMN));
        pageDomain.setIsAsc(ServletUtils.getParameter(Constants.ISASC));
        return pageDomain;
    }

    public static PageDomain buildPageRequest()
    {
        return getPageDomain();
    }

}