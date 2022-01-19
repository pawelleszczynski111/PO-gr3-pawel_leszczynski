public class RachunekBankowy {
    private static double rocznaStopaProcentowa;
    private double saldo;


    public void setCapital (double capital) {
        this.saldo = capital;
    }

    public void obliczMiesieczneOdsetki(){
        double odsetki = (saldo*(rocznaStopaProcentowa/100))/12;
        saldo += odsetki;
        System.out.println("Odsetki: " + odsetki);
        System.out.println("Saldo: " + saldo);
    }
    public void setRocznaStopaProcentowa(double nowa_wartosc){
        this.rocznaStopaProcentowa = nowa_wartosc;
    }
}