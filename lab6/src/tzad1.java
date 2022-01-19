public class tzad1 {
    public class Zadanie1_main {

        public static void main (String [] args){
            RachunekBankowy saver1 = new RachunekBankowy();
            saver1.setCapital(2000);
            saver1.setRocznaStopaProcentowa(4);
            saver1.obliczMiesieczneOdsetki();

            RachunekBankowy saver2 = new RachunekBankowy();
            saver2.setCapital(3000);
            saver2.setRocznaStopaProcentowa(5);
            saver2.obliczMiesieczneOdsetki();


        }
    }
}