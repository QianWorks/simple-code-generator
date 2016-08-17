package me.qiancheng.qianworks.codegen.controller;

import me.qiancheng.qianworks.codegen.dao.DatabaseMetaDataDao;
import me.qiancheng.qianworks.codegen.domain.TableDesc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author <a href="i@qiancheng.me">千橙</a>
 */
@RestController
public class MetaDataController {

    @Autowired
    DatabaseMetaDataDao metaDataDao;

    /**
     * 主要用来调度用
     *
     * @param response
     */
    @ModelAttribute
    public void enableCors(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Headers", "X-Requested-With");
    }

    /**
     * 查询所有数据表名称
     *
     * @return 所有数据表名称集合
     */
    @RequestMapping("/tables")
    public List<String> tables() {

        return metaDataDao.tables();
    }

    /**
     * 获取单个数据表的元信息
     *
     * @param table 表名
     * @return 给定名称的表的元信息
     */
    @RequestMapping("/{table}/desc")
    public TableDesc desc(@PathVariable String table) {

        return metaDataDao.desc(table);
    }

}
