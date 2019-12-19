package com.suixingpay.service;

import com.suixingpay.pojo.ButlerUser;

import java.util.List;

/**
 * ClassName ButlerSubordinatesServcie
 *
 * @Description TODO
 * @Author luyun
 * @Date 2019/12/18 17:53
 * @Version 1.0
 **/

public interface ButlerSubordinatesServcie {

    /**
     * 功能描述: <根据父类id查询用户信息>
     * 〈〉
     * @Param: [id]
     * @Return: com.suixingpay.pojo.ButlerSubordinates
     * @Author: luyun
     * @Date: 2019/12/19 13:32
     */
    List<ButlerUser> selectParentInfoBySubId(Integer id);
    /**
     * 功能描述: <根据用户id查询直接父级的信息>
     * 〈〉
     * @Param: [id]
     * @Return: com.suixingpay.pojo.ButlerSubordinates
     * @Author: luyun
     * @Date: 2019/12/19 10:07
     */
    ButlerUser selectParentInfoByid(int id);

    /**
     * 功能描述: <根据id查询用户信息>
     * 〈〉
     * @Param: [id]
     * @Return: com.suixingpay.pojo.ButlerUser
     * @Author: luyun
     * @Date: 2019/12/19 21:10
     */
    ButlerUser selectByid(Integer id);
}
