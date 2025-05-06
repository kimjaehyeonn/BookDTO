# 도서 관리 프로그램

## 📋 프로젝트 개요

도서 정보를 관리할 수 있는 콘솔 기반 프로그램을 구현합니다.

## 📁 프로젝트 구조

```
hw
    ├── model
    │   └── BookDTO.java        # 도서 정보를 담는 클래스
    ├── controller
    │   └── BookManager.java    # 도서 관리 기능 구현
    ├── view
    │   └── BookMenu.java       # 사용자 인터페이스
    └── run
        └── Application.java    # 프로그램 실행
```

## 💻 클래스 및 기능 구현 

### 1. BookDTO (도서 정보)

-  Field: **bNO**(String), **author**(String), **title**(String), **category**(int)
- 생성자, Getter/Setter/ToString 메서드 

### 2. BookManager (도서 관리) & BookMenu(메뉴)

- **ArrayList**로 객체 생성(booklist) 및 관리

#### BookMenu.menu() 메서드

```
// boolean 값을 통해 while loop 
boolean  exit = false

// while switch 이용
while (!exit) 
```


2-1. 도서 추가

 ```
case1: .addBook(inputBook());
    // inputBook(): scanner로 필드 입력받아 return new BookDTO(...)
    // addBook(): ArrayList.add(object) 로 구현
 ```

2-2. 도서 삭제

```
case2: .deleteBook(index);
    // deleteBook(): ArrayList.remove(index-1) 로 구현
```

2- 3. 도서 검색

 ```
case3: .printBook(.searchBook(inputBookTitle()));
    // inputBookTitle(): scanner.nextLine으로 입력받아 return title
    // searchBook(): for문 + ArrayList.get(index).getTitle().equals(title) 로 비교해서 index 반환
    // printBook(): ArrayList.get(index)로 객체 반환.
 ```

2-4. 전체 목록 확인

 ```
case4: .displayAll();
    // int index = -1 
    // 향상된 for문 ( index++) 로 구현
 ```

2-5. 종료

```
case5: if else 문 
    //if (answer.equals("Y") || answer.equals("y")) 이면
    // exit = true로 whilte문 빠져나가도록
```


### 3. Application (실행)

```java
public class Application {
    public static void main(String[] args) {
        // 메뉴실행
        new BookMenu().menu();
    }
}
```




