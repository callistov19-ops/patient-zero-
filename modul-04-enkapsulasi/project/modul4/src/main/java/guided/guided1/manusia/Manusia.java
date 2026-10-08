package guided.guided1.manusia;

public class Manusia {
    private String nama;
    private int umur;    
    //4.2 costructor
    public Manusia(){} //constructor pertama = default tanpa parameter
    public Manusia(String nama){ //constructor kedua
        this.nama = nama;
    }
    public Manusia(String nama, int umur){ //constructor ketiga
        this.nama = nama;
        this.umur = umur;
    }


    //method setter
    public void setNama(String a) {
        nama = a;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    //method getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}
