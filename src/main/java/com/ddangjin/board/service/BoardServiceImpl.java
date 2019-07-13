package com.ddangjin.board.service;

import com.ddangjin.board.model.Board;
import com.ddangjin.board.model.dao.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardMapper boardMapper;

    @Override
    public Board findByBid(int bid) {
        return boardMapper.findByBid(bid);
    }
}
