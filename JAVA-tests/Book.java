public class Book {

  static int totalNoOfBooks;
  String author ;
  String title;
  String isbn;
  boolean isBorrowed ;


  static{
    totalNoOfBooks = 0;
  }

  {
    totalNoOfBooks++;
  }

  Book(String isbn ,  String title , String author){
    this.isbn = isbn;
    this.title = title;
    this.author = author;

  }

  Book(String isbn ){
    this(isbn ,"Unknown" ,  "Unknown");

  }

  static int getNoOfBooks(){
    return totalNoOfBooks;
  }

  void borrowBook(){
        if(isBorrowed){
          System.out.println("Book is already borrowed....");
        }else{

         this.isBorrowed = true;
         System.out.println("enjoy the book " + this.title + " by " + this.author + "  ....and please return in 1 week");

        }

    }



   void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false ;
            System.out.println("Hope you enjoyed, please leave a review.");
        }else{
            System.out.println("this book is alraedy in the library");
        }
    }



   public static void main(String[] args) {
    
    Book thinkAndGrowRich = new Book ("1", "Think & grow rich", "Napolien Hill");
    Book models = new Book ("2" , "models" , "Mark Manson");
    Book pythoncrashcourse = new Book("3");

    System.out.println(Book.getNoOfBooks());
    models.borrowBook();
    thinkAndGrowRich.borrowBook();
    models.borrowBook();
    models.returnBook();
    models.returnBook();





   }



}
