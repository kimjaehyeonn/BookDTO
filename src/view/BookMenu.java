package view;

import controller.BookManager;
import model.BookDTO;

import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();
    boolean exit = false;

    public BookMenu() {

    }

    public void menu() {
        while (!exit) {
            System.out.print("""
                    *** 도서 관리 프로그램 ***
                       1. 새 도서 추가
                       2. 도서 삭제
                       3. 도서 검색출력
                       4. 전체 출력
                       5. 끝내기
                       메뉴 선택 : 
                    """);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    System.out.print("삭제할 도서의 인덱스를 입력해주세요. : ");
                    int index = sc.nextInt();
                    try {
                        bm.deleteBook(index);
                    } catch (IndexOutOfBoundsException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    bm.printBook(bm.searchBook(inputBookTitle()));
                    break;
                case 4:
                    bm.displayAll();
                    break;
                case 5:
                    System.out.println("정말 끝내시겠습니까? Y/N");
                    String answer = sc.nextLine();
                    if (answer.equals("Y") || answer.equals("y")) {
                        exit = true;
                    } else if (answer.equals("n") || answer.equals("N")) {
                    }
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
        sc.close();
    }

    public BookDTO inputBook() {
        System.out.print("도서 번호 : ");
        String bNo = sc.nextLine();

        System.out.print("도서 제목 : ");
        String title = sc.nextLine();


        System.out.print("도서 장르(1:인문/2:자연과학/3:의료/4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(bNo, category, title, author);

    }

    public String inputBookTitle() {
        System.out.println("도서 제목 : ");
        String title = sc.nextLine();
        return title;

        // "도서 제목 : " 입력 받아 리턴

    }
}
