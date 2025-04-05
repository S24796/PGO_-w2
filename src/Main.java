public class Main {
    public static void main(String[] args) {


        Produkt produkt1 = new Produkt();
        produkt1.SetId(1);
        produkt1.nazwa = "Produkt1";
        produkt1.kategoria = "Kategoria";
        produkt1.cena = 2.99;
        produkt1.iloscWMagazynie = 10;
        System.out.println(produkt1);
        System.out.println(produkt1.id);
        System.out.println(produkt1.nazwa);

        produkt1.Display();

        Produkt produkt2 = new Produkt();
        produkt2.id = 2;
        produkt2.nazwa = "Produkt2";
        produkt2.kategoria = "Kategoria";
        produkt2.cena = 5.99;
        produkt2.iloscWMagazynie = 30;

        System.out.println(produkt2.id + " " + produkt2.nazwa);

        produkt2.Display();

    }
}