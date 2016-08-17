package me.qiancheng.qianworks.codegen.dao;

import me.qiancheng.qianworks.codegen.domain.TableDesc;

import java.util.List;

/**
 * 用来获取数据库相关的元信息
 *
 * @author <a href="i@qiancheng.me">千橙</a>
 */
public interface DatabaseMetaDataDao {

    /**
     * 获取一个库中的所有表名
     *
     * @return 数据中所有表的名称集合
     */
    List<String> tables();

    /**
     * 获取表的元信息
     *
     * @param tableName 表名称
     * @return 表的元信息
     */
    TableDesc desc(String tableName);
}
