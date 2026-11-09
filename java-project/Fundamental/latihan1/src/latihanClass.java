public class latihanClass {
    public static class Modular {
        String name;
        int age;
        double weigth;
        double heigth;

        public Modular(String n, int a, double w, double h){
        this.name = n;
        this.age = a;
        this.weigth = w;
        this.heigth = h;
        }
    }
    

    public static void main(String[] args) {
      
        
      Modular Orang1 = new Modular("Akmal", 25, 70.0, 169.0);

      System.out.println("Nama :"+ Orang1.name);
      System.out.println("Usia :"+ Orang1.age + "tahun");
      System.out.println("Berat Badan :"+ Orang1.weigth + "Kg");
      System.out.println("Tinggi Badan :"+ Orang1.heigth + "Cm");
    }
}
