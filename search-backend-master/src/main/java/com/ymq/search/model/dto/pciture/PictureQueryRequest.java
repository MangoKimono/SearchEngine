package com.ymq.search.model.dto.pciture;

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
public class PictureQueryRequest extends PageRequest implements Serializable {

    /**
     * 搜索词
     */
    private String searchText;

    private static final long serialVersionUID = 1L;
}