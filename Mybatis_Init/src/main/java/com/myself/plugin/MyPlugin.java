package com.myself.plugin;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

/**
 * Created by Administrator on 2017/6/28 0028.
 */

/*拦截器*/
@Intercepts({@Signature(type= Executor.class,method = "update",
        args = {MappedStatement.class,Object.class})})
public class MyPlugin implements Interceptor {

    public Object intercept(Invocation invocation) throws Throwable {

        return invocation.proceed();
    }

    public Object plugin(Object target) {

        return Plugin.wrap(target,this);
    }

    public void setProperties(Properties properties) {

    }
}
