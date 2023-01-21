public class Family {
    private double height;
    private double years;

    Family(double h, double y){
        this.height = h;
        this.years = y;
    }

    public double getHeight() {                   //   GET
        return height;                           //
    }

    public double getYears() {                  //
        return years;                            //    GET
    }

    public void setHeight(double height) {         //           SET
        this.height = height;                       //
    }

    public void setYears(double years) {             //
        this.years = years;                        //           SET
    }


    public void showInfo() {
        System.out.println("Height: " + height);
        System.out.println("Years: " + years);
    }
}


class Father extends Family {
    private String style;

    Father(String name, double h, double y) {
        super(h, y);                               // Вызвать конструктор супер класса с двумя аргументами
        setStyle(name);
    }


    public void setStyle(String style) {
        this.style = style;
    }


    void showStile() {
        System.out.println("Father: " + style);
    }
}

class Mother extends Family {
    private String style;

    Mother(String name, double h, double y) {
        super(h, y);                               // Вызвать конструктор супер класса с двумя аргументами
        setStyle(name);
    }


    public void setStyle(String style) {
        this.style = style;
    }


    void showStile() {
        System.out.println("Mother: " + style);
    }
}

class Son extends Family {
    private String style;

    Son(String name, double h, double y) {
        super(h, y);                               // Вызвать конструктор супер класса с двумя аргументами
        setStyle(name);
    }


    public void setStyle(String style) {
        this.style = style;
    }


    void showStile() {
        System.out.println("Son: " + style);
    }
}

class People {
    public static void main(String[] args) {
        Father f1 = new Father("Андрей", 200, 40);
        Mother f2 = new Mother("Ольга", 180, 35);
        Son f3 = new Son("Серёжа", 180, 17);


        System.out.println("Info Father");
        f1.showStile();
        f1.showInfo();

        System.out.println();

        System.out.println("Info Mother");
        f2.showStile();
        f2.showInfo();

        System.out.println();

        System.out.println("Info Son");
        f3.showStile();
        f3.showInfo();

    }
}