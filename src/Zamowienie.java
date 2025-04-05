public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String Status;

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public int[] getIlosci() {
        return ilosci;
    }

    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public double WartoscZamowienia() {
        double suma = 0;
        for (int i = 0; i < produkty.length; i++) {
            suma = Produkt.getCena + suma;
        }
    return 0.0;
    }

    public void zastosujZnizke(){
        if (klient.isCzyStały()){

        };

    }

    public void Display(){
        System.out.println("Id: " + id);
        System.out.println("Klient: " + klient);
        for (int i = 0; i < produkty.length; i++) {
            System.out.println("Produkty: " + produkty[i]);
        }
        for (int i = 0; i < ilosci.length; i++) {
            System.out.println("Ilosci: " + ilosci[i]);
        }
        System.out.println("Status: " + Status);;
    }

}
