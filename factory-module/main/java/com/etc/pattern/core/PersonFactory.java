package com.etc.pattern.core;

import cn.hutool.core.util.IdUtil;
import com.etc.pattern.enums.PersonEnum;
import com.etc.pattern.pojo.Man;
import com.etc.pattern.pojo.Person;
import com.etc.pattern.pojo.Woman;


/**
 * @author chengkexing
 * @version $Id: Pattern.java,v 1.
 * @since 1.0.0
 * @Date: 2022-09-05
 */
public class PersonFactory {

    /**
     * 创建用户
     * @param personEnum from PersonEnum
     * @return 构建好的对象
     * @throws Exception
     * @See PersonEnum
     */
    public static Person generator(PersonEnum personEnum) throws Exception {
        Person person = null;
        String id = IdUtil.simpleUUID();
        if(PersonEnum.MAN == personEnum) {
            person = new Man(id);
        }else if(PersonEnum.WOMAN == personEnum) {
            person = new Woman(id);
        }else{
            throw new Exception("创建用户失败,无法找到正确的用户");
        }
        return person;
    }
}
