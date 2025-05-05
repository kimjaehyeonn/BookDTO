package model;

import lombok.*;

@NoArgsConstructor   // 기본 생성자
@AllArgsConstructor   // 모두 초기화
@Getter
@Setter
@ToString
public class BookDTO {
    private String bNo;   // 도서번호
    private int category; // 도서분류코드
    private String title;  // 도서 제목
    private String author;   // 도서 저자

}
