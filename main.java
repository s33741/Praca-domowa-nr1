public class main {
    public static void main(String[] args) {
        // Tworzymy instancję sklepu komputerowego
        SklepKomputerowy sklep = new SklepKomputerowy();

// Dodajemy produkty
        Produkt produkt1 = new Produkt();
        produkt1.setId(1);
        produkt1.setNazwa("Laptop Dell");
        produkt1.setKategoria("Laptop");
        produkt1.setCena(51234.99);
        produkt1.setIloscWMagazynie(17);
        Produkt produkt2 = new Produkt();
        produkt2.setId(2);
        produkt2.setNazwa("Mysz Dell");
        produkt2.setKategoria("Mysz");
        produkt2.setCena(150.50);
        produkt2.setIloscWMagazynie(60);
        Produkt produkt3 = new Produkt();
        produkt3.setId(3);
        produkt3.setNazwa("Klawiatura Apple\"");
        produkt3.setKategoria("Klawiatura");
        produkt3.setCena(700.50);
        produkt3.setIloscWMagazynie(62);
        sklep.dodajProdukt(produkt1);
        sklep.dodajProdukt(produkt2);
        sklep.dodajProdukt(produkt3);

// Dodajemy klientów
        Klient klient1 = new Klient();
        klient1.setId(1);
        klient1.setImie("Aleksandra");
        klient1.setNazwisko("Łęska");
        klient1.setEmail("s33741@pjwstk.edu.pl");
        klient1.setCzyStaly(true);
        Klient klient2 = new Klient();
        klient2.setId(2);
        klient2.setImie("Jakub");
        klient2.setNazwisko("Nowak");
        klient2.setEmail("jakub.nowak@gmail.com");
        klient2.setCzyStaly(false);

        sklep.dodajKlienta(klient1);
        sklep.dodajKlienta(klient2);

// Tworzymy zamówienia
        Produkt[] produktyZamowienia1 = {produkt1, produkt2};
        int[] ilosciZamowienia1 = {1, 1};
        Zamowienie zamowienie1 = sklep.utworzZamowienie(klient1, produktyZamowienia1, ilosciZamowienia1);
        zamowienie1.zastosujZnizke(); // Zastosuj zniżkę dla stałego klienta
        sklep.aktualizujStanMagazynowy(zamowienie1);

// Wyświetlamy informacje
        System.out.println("Informacje o zamówieniu:");
        zamowienie1.wyswietlSzczegoly();
        System.out.println("\nStan magazynowy po zamówieniu:");
        sklep.wyswietlProduktyWKategorii("Laptop");
        sklep.wyswietlProduktyWKategorii("Mysz");

// Zmiana statusu zamówienia
        sklep.zmienStatusZamowienia(zamowienie1.getId(), "Zrealizowane");
        System.out.println("\nStatus zamówienia po aktualizacji:");
        zamowienie1.wyswietlSzczegoly();

// Dodanie kolejnego zamówienia
        Produkt[] produktyZamowienia2 = {produkt3, produkt2};
        int[] ilosciZamowienia2 = {2, 1};
        Zamowienie zamowienie2 = sklep.utworzZamowienie(klient2, produktyZamowienia2, ilosciZamowienia2);
        sklep.aktualizujStanMagazynowy(zamowienie2);

// Wyświetlanie zamówień klienta
        System.out.println("\nZamówienia klienta Aleksandra Łęska:");
        sklep.wyswietlZamowieniaKlienta(1);
    }

}
