import java.util.List;

public class Banco {
    private String name;
    private List<Conta> accounts;

    public Banco(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Conta> getAccounts() {
        return accounts;
    }

}
