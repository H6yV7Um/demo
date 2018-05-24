package com.victor.spring.mapper;

import com.victor.spring.entity.SceneCodeInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zhangcs on 2018/5/24.
 */
@Mapper
public interface SceneCodeInfoMapper {

    @Select("select * from scene_code_infos")
    List<SceneCodeInfoEntity> list();
}
