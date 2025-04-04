public class SklepKomputerowy {
    private Produkt[] produkty = new Produkt[12];
    private Klient[] klienci = new Klient[15];
    private Zamowienie[] zamowienia = new Zamowienie[15];
    private int liczbaProduktow;
    private int liczbaKlientow;
    private int liczbaZamowien;

    public void dodajProdukt(Produkt produkt1) {
    }

    public void dodajKlienta(Klient klient1) {
    }

    public Zamowienie utworzZamowienie(Klient klient1, Produkt[] produktyZamowienia1, int[] ilosciZamowienia1) {
        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setKlient(klient1);
        zamowienie.setProdukty(produktyZamowienia1);
        zamowienie.setIlosci(ilosciZamowienia1);
        zamowienie.setId(liczbaZamowien);
        zamowienie.setStatus("Nowe zamowienie");

        return zamowienie;
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie1) {
    }

    public void wyswietlProduktyWKategorii(String laptop) {
    }

    public void zmienStatusZamowienia(int id, String zrealizowane) {
    }

    public void wyswietlZamowieniaKlienta(int i) {
    }
}
