package hello.hellotest.DTO;
import lombok.*;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardDTO {

    private int seq;
    private String title;
    private String writer;
    private String content;
    private Date regDate;
    private int count;

}
