package controller;

import lombok.NoArgsConstructor;
import model.BookDTO;

import java.util.ArrayList;

@NoArgsConstructor
public class BookManager {
    private ArrayList<BookDTO> booklist = new ArrayList<>(); // 도서목록

    // 도서 추가
    public void addBook(BookDTO book) {
        booklist.add(book);
    }

    // 전달 받은 index로 도서 삭제
    public void deleteBook(int index){
        booklist.remove(index-1);
    }

    // 도서명이 일치하는 객체 찾아 해당 index 리턴
    // 도서명이 일치하는 객체가 리스트에 없으면 -1 리턴
    public int searchBook(String title) {
        return booklist.indexOf(title);

    }

    // 인덱스 위치의 객체 정보 출력
    // 인덱스 도서가 없으면 적절한 메시지 출력
    public void printBook (int index) {
        if (false) {
            System.out.println("원하시는 도서가 존재하지 않습니다.");
        } else {
            System.out.println(booklist.get(index));
        }
    }

    // 도서 전체 리스트 출력
    // 도서가 없는 경우 적절한 메시지 출력
    public void displayAll() {
        if ( booklist == null) {
            System.out.println(" 등록된 도서가 존재하지 않습니다. ");
        }
        System.out.println("인덱스\t도서번호\t장르\t제목\t저자");
        System.out.println("----------------------------------------");
        int index = 1;
        for (BookDTO book : booklist) {
            System.out.println(index + "\t"+book.getBNo() + "\t" + book.getCategory() + "\t" + book.getTitle() + "\t"+ book.getAuthor());
            index++;

        };
    }


}
