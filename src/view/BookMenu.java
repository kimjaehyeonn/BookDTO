package view;

import controller.BookManager;
import model.BookDTO;

import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {

    }

    public void menu() {
        // 메뉴 출력
        /*
        *** 도서 관리 프로그램 ***
        1. 새 도서 추가
        2. 도서 삭제
        3. 도서 검색출력
        4. 전체 출력
        5. 끝내기
        */
        // 메뉴 번호 입력 받기
        // 잘못된 입력 처리
        // 각 메뉴에 따른 기능 실행
    }

    public BookDTO inputBook() {
        // 도서 번호 : 입력받음
        // 도서 제목 : 입력 받음
        // 도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : 입력 받음 (숫자로)
        // 도서 저자 : 입력 받음
        // 매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO객체 리턴
    }

    public String inputBookTitle() {
        // "도서 제목 : " 입력 받아 리턴

    }
}
