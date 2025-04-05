public class Klient {
    private int id;
    private String imie;
    private String nazwisko;
    private String email;
    private boolean czyStały;

    public void Display(){
        System.out.println("Id: " + id);
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Email: " + email);

    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCzyStały() {
        return czyStały;
    }

    public void setCzyStały(boolean czyStały) {
        this.czyStały = czyStały;
    }
}
