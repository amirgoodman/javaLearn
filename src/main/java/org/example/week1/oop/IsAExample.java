package org.example.week1.oop;

abstract  class Tv {

    private int year;

    public Tv(){}

    public Tv(int year) {
        this.year = year;
    }
    public void connect(String outputKanal){
    }
}
//    public abstract void disconnect(String input);

class SomeTv extends Tv{

    private String company;

    public SomeTv(){}

    public SomeTv(int year){
        super(year);
    }

    public SomeTv(int year, String company) {
        super(year);
        this.company = company;
    }

    private void findConnection() {
        // find Телевышки
    }

    @Override
    public void connect(String outputKanal) {
        System.out.println("Всунул в резетку" + outputKanal);
        findConnection();

    }
}
class ColoredTv extends SomeTv {
        private int count;

        public ColoredTv(){}
        public ColoredTv(int year){
            super(year);
        }
        public ColoredTv(int year,int count){
            super(year);
            this.count = count;
        }
        public ColoredTv(int year, String company,int count) {
            super(year);
            this.count = count;

        }
    }

 class CableTv extends ColoredTv {
        private String console;

        public CableTv(int year, int count, String console) {
            super(year, count);
            this.console = console;
        }

        @Override
        public void connect(String outputKanal) {
            System.out.println("Всунул в резетку, переключил на канал" + outputKanal);
        }

    }

class SmartTv extends CableTv {
        private String operationSystem;

        public SmartTv(int year, int countKanal, String console, String operationSystem) {
            super(year, countKanal, console);
            this.operationSystem = operationSystem;
        }

        public void install(String program) {
            System.out.println("Установил" + program + "для" + operationSystem);
        }

    }
 class Experiment{
     public static void main(String[] args) {
         SomeTv firstTv = new SomeTv(1950, "Samsung");
         firstTv.connect("Cartoon");
         }
 }

