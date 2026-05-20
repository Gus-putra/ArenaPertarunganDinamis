public class NamaException extends Exception {
    // Constructor minimal
    public NamaException(String pesan) {
        super(pesan);
    }

    // Constructor opsional dengan cause
    public NamaException(String pesan, Throwable cause) {
        super(pesan, cause);
    }
}
