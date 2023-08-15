package com.ymq.search.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ymq.search.model.entity.Picture;

/**
 * @author 杨民青
 */
public interface PictureService {

    Page<Picture> searchPicture(String searchText, long pageNum, long pageSize);
}
