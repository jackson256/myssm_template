package com.hudson.ssm.utils;

import java.util.List;

import com.github.pagehelper.Page;

/**
 * 
 * @className: BeanUtil
 * @Description:
 * @author: hudson
 * @date: 2018年6月2日 下午11:27:32
 * @version: 1.0
 */
public class BeanUtil {

    public static <T> PagedResult<T> toPagedResult(List<T> datas) {
        PagedResult<T> result = new PagedResult<T>();
        if (datas instanceof Page) {
            Page page = (Page) datas;
            result.setPageNo(page.getPageNum());
            result.setPageSize(page.getPageSize());
            result.setDataList(page.getResult());
            result.setTotal(page.getTotal());
            result.setPages(page.getPages());
        }
        else {
            result.setPageNo(1);
            result.setPageSize(datas.size());
            result.setDataList(datas);
            result.setTotal(datas.size());
        }

        return result;
    }

}
