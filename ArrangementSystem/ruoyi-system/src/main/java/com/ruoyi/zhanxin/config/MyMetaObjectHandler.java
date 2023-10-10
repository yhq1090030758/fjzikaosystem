package com.ruoyi.zhanxin.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
//字段自动填充
    @Override
    public void insertFill(MetaObject metaObject) {
        String user = SecurityUtils.getUsername();
        log.info("start insert fill ....");
        this.strictInsertFill(metaObject, "createTime",LocalDateTime.class,LocalDateTime.now());
        this.setFieldValByName("creator", user, metaObject);
        log.info("====>"+SecurityUtils.getUsername());


    }

    @Override
    public void updateFill(MetaObject metaObject) {
        String user = SecurityUtils.getUsername();
        log.info("start update fill ....");
        this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
        this.setFieldValByName("updater", user, metaObject);
    }
}