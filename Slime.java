public class Slime extends Musuh implements BisaLoot {

    public Slime() {

    super("Slime Asam", 50);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + "melompat dan menyiram cairan asam! Player -15 HP");
    }
    public void suaraKhas() {
        System.out.println(this.namaMusuh + " Plug..Plug.. ");
    }
    @Override
    public void jatuhkanItem() {
        System.out.println(this.namaMusuh + " Musuh telah dijatuhkan!");
    }
}
