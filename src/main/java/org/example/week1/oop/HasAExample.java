package org.example.week1.oop;


//class Engine {
//
//    private String type;
//    private int count;
//
//    Engine(String type, int count) {
//        this.type = type;
//        this.count = count;
//    }
//
//    public int getCount() {
//        return count;
//    }
//    public String getType() {
//        return type;
//    }
//    public void setCount(int count) {
//        this.count = count;
//    }
//    public void setType(String type) {
//        this.type = type;
//    }
//    @Override
//    public String toString() {
//        return "Engine{" +
//                "type='" + type + '\'' +
//                ", count=" + count +
//                '}';
//    }
//}
//
//class Car {
//
//    private final Engine engine;
//
//    Car(Engine engine) {
//        this.engine = engine;
//    }
//
//    public void start() {
//        System.out.println(engine.toString());
//    }
//}
//
//public class HasAExample {
//
//    public static void main(String[] args) {
//        // TODO example of 'is-a', 'has-a'
//
//        Engine engine = new Engine("forth", 6);
//        Car car1 = new Car(engine);
//        engine.setCount(4);
//        Car car2 = new Car(engine);
//        car1.start();
//        car2.start();
//    }
class Author {
    private String genre;
    private int year;

    Author(String genre, int year) {
        this.genre = genre;
        this.year = year;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getYear() {
        return this.year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Author{" +
                "genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}
   class  Book {
       private final Author author;


       Book(Author author) {
           this.author = author;
       }

       public void read() {
           System.out.println(author.toString());
       }
   }
    class Example {
        public static void main(String[] Arguments) {
            Author author = new Author("horror", 1986);
            Book book1 = new Book(author);
            book1.read();
            author.setGenre("komedy");
            book1.read();
            author.setGenre("fantasy");
            book1.read();
            Book book2 = new Book(author);
            author.setGenre("drama");
            book1.read();
        }
}


