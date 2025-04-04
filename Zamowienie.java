public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
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
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void wyswietlInformacje() {
        System.out.println("Zamówienie ID: " + id);

        if (klient != null) {
            System.out.println("Klient: " + klient.getImie() + " " + klient.getNazwisko());
        }

        if (produkty != null && ilosci != null) {
            System.out.println("Produkty w zamówieniu:");
            for (int i = 0; i < produkty.length; i++) {
                if (produkty[i] != null && i < ilosci.length) {
                    System.out.println("- " + produkty[i].getNazwa() + " | Ilość: " + ilosci[i]);
                }
            }
        }

        System.out.println("Status: " + status);
    }

    public void zastosujZnizke() {
    }

    public void wyswietlSzczegoly() {
    }
}
