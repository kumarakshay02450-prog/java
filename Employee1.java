class Employe1 {
    String name;
    int salary;

    Employe1() {
        name = "Unknown";
        salary = 0;
    }

    Employe1(String n) {
        name = n;
        salary = 10000;
    }

    Employe1(String n, int s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employe1();
        Employee e2 = new Employe1("John");
        Employee e3 = new Employe1("Alex", 30000);

        e1.display();
        e2.display();
        e3.display();
    }
}
