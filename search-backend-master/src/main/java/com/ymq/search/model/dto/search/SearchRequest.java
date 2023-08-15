package com.ymq.search.model.dto.search;

import com.ymq.search.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询请求
 *
 * @author 杨民青
 * 
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SearchRequest extends PageRequest implements Serializable {

    /**
     * 搜索词
     */
    private String searchText;

    private String type;

    private static final long serialVersionUID = 1L;
}