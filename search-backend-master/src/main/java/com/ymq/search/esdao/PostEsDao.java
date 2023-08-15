package com.ymq.search.esdao;

import com.ymq.search.model.dto.post.PostEsDTO;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 帖子 ES 操作
 *
 * @author 杨民青
 * 
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}