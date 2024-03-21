package hello.hellotest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
//member로 들어오면 controller에 들어오게됨
public class MemberController {
    @GetMapping("/login") //member/login => url-mapping
    public String login1(){
        return "member/loginForm"; //view로 사용할 파일명
    }
    @GetMapping("/membership") // member/membership => url-mapping
    public String join(){
        return "member/membershipForm"; //view로 사용할 파일명
    }
}
