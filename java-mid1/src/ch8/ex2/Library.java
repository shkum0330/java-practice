package ch8.ex2;

public class Library {

    private Book[] book;
    private int idx;

    public Library(int num) {
        book = new Book[num];
    }

    public void addBook(String title,String author){
        if(idx == book.length){
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        book[idx++]=new Book(title,author);
    }

    public void showBooks(){
        System.out.println("== 책 목록 출력 ==");
        for (int i=0;i<book.length;i++){
            System.out.println("도서 제목: "+book[i].title+", 저자: "+book[i].author);
        }
    }
    class Book{
        private String title,author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
