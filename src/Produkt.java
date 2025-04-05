public class Produkt {
    private int id = 0;
    private String nazwa ;
    private double cena ;
    private String kategoria ;

    public int getIloscWMagazynie() {
        return iloscWMagazynie;
    }

    public void setIloscWMagazynie(int iloscWMagazynie) {
        this.iloscWMagazynie = iloscWMagazynie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    private int iloscWMagazynie ;

    //Setter
    public void SetId(int id) {
        if (id < 0) {
            this.id = 0;
        }else{
            this.id =0;
        }
    }
    //getter
    public int GetId() {
        return this.id;
    }

    public void Display(){
        System.out.println("id :" + id);
        System.out.println("nazwa :" + nazwa);
        System.out.println("kategoria :" + kategoria);
        System.out.println("cena :" + cena);
        System.out.println("ilosc Na Magazynie :" + iloscWMagazynie);
    }

}
