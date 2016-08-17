package me.qiancheng.qianworks.codegen.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 表格元信息
 *
 * @author <a href="i@qiancheng.me">千橙</a>
 */
@Data
public class TableDesc {
    /**
     * 表名
     */
    private final String table;
    /**
     * 查询是否成功
     */
    private boolean ok;
    /**
     * 列元信息
     */
    private List<ColumnDesc> rows = new ArrayList<>();

    public TableDesc(String table) {
        this.table = table;
    }

    /**
     * 添加列元信息
     *
     * @param field 列名
     * @param type  列类型
     */
    public void addColumnDesc(String field, String type) {
        ColumnDesc columnDesc = new ColumnDesc();
        columnDesc.setField(field);
        columnDesc.setType(type);
        rows.add(columnDesc);
    }


    @Data
    public static class ColumnDesc {
        /**
         * 列名
         */
        String field;
        /**
         * 列类型
         */
        String type;
    }
}
