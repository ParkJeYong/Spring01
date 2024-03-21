package hello.hellotest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
public class BoardController {
    @GetMapping("/boardList")
    public String board1() {
        return "board/boardList";
    }
}