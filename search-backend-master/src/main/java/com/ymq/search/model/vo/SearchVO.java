package com.ymq.search.model.vo;

import com.ymq.search.model.entity.Picture;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 杨民青
 */
@Data
public class SearchVO implements Serializable {

    private List<PostVO> postList;

    private List<UserVO> userList;

    private List<Picture> pictureList;

    private List<VideoVo> videoList;

    private List<?> dataList;

    private static final long serialVersionUID = 5265687897079265408L;
}
