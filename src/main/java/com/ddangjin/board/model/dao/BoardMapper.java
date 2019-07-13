package com.ddangjin.board.model.dao;

import com.ddangjin.board.model.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BoardMapper {

    @Select("SELECT * FROM board WHERE bid = #{bid}")
    public Board findByBid(@Param("bid") int bid);
}
