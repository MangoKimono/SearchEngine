package com.ymq.search.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.gson.Gson;
import com.ymq.search.common.BaseResponse;
import com.ymq.search.common.ErrorCode;
import com.ymq.search.common.ResultUtils;
import com.ymq.search.exception.ThrowUtils;
import com.ymq.search.model.dto.pciture.PictureQueryRequest;
import com.ymq.search.model.entity.Picture;
import com.ymq.search.service.PictureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片接口
 *
 * @author 杨民青
 *
 */
@RestController
@RequestMapping("/picture")
@Slf4j
public class PictureController {

    @Resource
    private PictureService pictureService;

    private final static Gson GSON = new Gson();


    /**
     * 分页获取图片（封装类）
     *
     * @param pictureQueryRequest
     * @param request
     * @return
     */
    @PostMapping("/list/page/vo")
    public BaseResponse<Page<Picture>> listPictureVOByPage(@RequestBody PictureQueryRequest pictureQueryRequest,
            HttpServletRequest request) {
        long current = pictureQueryRequest.getCurrent();
        long size = pictureQueryRequest.getPageSize();
        // 限制爬虫
        ThrowUtils.throwIf(size > 20, ErrorCode.PARAMS_ERROR);
        String searchText = pictureQueryRequest.getSearchText();

        Page<Picture> picturePage = pictureService.searchPicture(pictureQueryRequest.getSearchText(), current, size);
        return ResultUtils.success(picturePage);
    }
}
