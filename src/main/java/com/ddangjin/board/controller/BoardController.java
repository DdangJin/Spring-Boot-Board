package com.ddangjin.board.controller;

import com.ddangjin.board.model.Board;
import com.ddangjin.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("/")
    public String root() {
        return "hi";
    }

    @GetMapping("/boards/{bid}")
    public Board getBoard(@PathVariable int bid) {
        return boardService.findByBid(bid);
    }
}
