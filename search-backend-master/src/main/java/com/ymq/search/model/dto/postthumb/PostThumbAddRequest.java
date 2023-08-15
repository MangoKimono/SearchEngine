package com.ymq.search.model.dto.postthumb;

import lombok.Data;

import java.io.Serializable;

/**
 * 帖子点赞请求
 *
 * @author 杨民青
 * 
 */
@Data
public class PostThumbAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}