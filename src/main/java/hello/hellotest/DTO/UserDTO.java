package hello.hellotest.DTO;

import lombok.*;

@Getter
@Setter
//@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자
//@RequiredArgsConstructor // final 등을 받는 생성자
@ToString // toString
public class UserDTO {

    private String id;
    private String password;
    private String name;
    private String address;
    private String phone;
    private String role;


}
