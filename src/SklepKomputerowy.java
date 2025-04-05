public class SklepKomputerowy {
    private Produkt[] produkty = new Produkt[10];
    private Klient[] klienci = new Klient[10];
    private Zamowienie[] zamowienia = new Zamowienie[10];
    private int liczbaProduktów;
    private int liczbaKlientów;
    private int liczbaZamowien;

    public Zamowienie utworzZamowienie(
            Klient klient1,
            Produkt[] produktyZamowienia1,
            int[] iloscZamowienia1) {
        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setKlient(klient1);
        zamowienie.setProdukty(produktyZamowienia1);
        zamowienie.

    }
}
