package com.ymq.search.model.dto.file;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件上传请求
 *
 * @author 杨民青
 * 
 */
@Data
public class UploadFileRequest implements Serializable {

    /**
     * 业务
     */
    private String biz;

    private static final long serialVersionUID = 1L;
}