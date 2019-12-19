package com.suixingpay.mapper;

import com.suixingpay.pojo.ButlerSubordinates;
import com.suixingpay.pojo.ButlerUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 詹文良
 * @program: butler-meeting-3th
 * @description: 用户下属表的 mapper
 * <p>
 * Created by jalr on 2019/12/18.
 */
@Mapper
public interface ButlerSubordinatesMapper {
    /**
     * 功能描述: <根据用户id查询所有父级信息>
     * 〈〉
     * @Param: [id]
     * @Return: java.lang.Integer
     * @Author: luyun
     * @Date: 2019/12/18 17:52
     */
    Integer selectUserIdBySubId(Integer id);
    /**
     * 功能描述: <根据id查询直接父类id>
     * 〈〉
     * @Param: [id]
     * @Return: com.suixingpay.pojo.ButlerSubordinates
     * @Author: luyun
     * @Date: 2019/12/19 11:06
     */
    ButlerSubordinates selectParentInfoByid(Integer id);
    /**
     * 功能描述: <根据id获取父类id>
     * 〈〉
     * @Param: [id]
     * @Return: java.lang.Integer
     * @Author: luyun
     * @Date: 2019/12/19 11:08
     */
    Integer selectLeaderByid(Integer id);

}
