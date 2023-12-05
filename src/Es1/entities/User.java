package Es1.entities;

public class User {
    private int n;
    private String nparole;

    public User(int n, String nparole) {
        this.n = n;
        this.nparole = nparole;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getNparole() {
        return nparole;
    }

    public void setNparole(String nparole) {
        this.nparole = nparole;
    }

    @Override
    public String toString() {
        return "User{" +
                "n=" + n +
                ", nparole='" + nparole + '\'' +
                '}';
    }
}
