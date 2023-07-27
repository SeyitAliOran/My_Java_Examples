package dersler.gun39_Encapsulation_1.PersonAddress;

    public class Adres {
        private String cadde;
        private String sehir;
        private int number = 1;

        public Adres(String cadde, String sehir, int number) {
            //this.cadde = cadde;
            setCadde(cadde);
            //this.sehir =
            setSehir(sehir);
            //this.number = number;
            setNumber(number);
        }

        public String getCadde() {
            return cadde;
        }

        public void setCadde(String cadde) {
            if(cadde.isBlank() || cadde.isEmpty()){
                this.cadde = "isimsiz";
            }else this.cadde = cadde.trim();
        }

        public String getSehir() {
            return sehir;
        }

        public void setSehir(String sehir) {
            if(sehir.isBlank() || sehir.isEmpty()){
                this.sehir = "isimsiz";
            }else this.sehir = sehir.trim();
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            if(number > 0)
                this.number = number;
        }

        @Override
        public String toString() {
     /*   return "Adres{" +
                "cadde='" + cadde + '\'' +
                ", sehir='" + sehir + '\'' +
                ", number=" + number +
                '}';*/
            return this.getCadde() + " no = " + this.getNumber() + "-" + this.getSehir();
        }
}
