public class Main {
    public static void main(String[] args) {
        Perro p= new Perro("mamifero","perro", 5 , "Maximo", "cocker");
        System.out.println("Metodos del padre : ");
        p.respirar();
        p.comer();
        p.nacer();
        System.out.println("metodos interface");
        p.bañar();
        p.Vacunar();

    }
}
