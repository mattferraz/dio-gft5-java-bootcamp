import java.text.NumberFormat;

public class Loan {
    public static final NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

    public static void getLoan(double desiredAmount, int installments) {
        final float interestRate = 0.04F;

        System.out.println("Empréstimo realizado com sucesso!");
        System.out.printf("Valor: %s \nQuantidade de Parcelas: %d\n",
                currencyFormatter.format(desiredAmount), installments);

        System.out.println("-".repeat(30));

        showPayTable(desiredAmount, installments, interestRate);
    }

    public static void showPayTable(double desiredAmount, int installments, float interestRate) {
        double debt = desiredAmount;
        double totalInterest = 0.0;

        System.out.printf("%3s %12s %s", "n", "Juros", "Saldo Devedor\n");
        System.out.printf("%3d %12s %s\n", 0, currencyFormatter.format(0),
                currencyFormatter.format(debt));

        for (int i = 1; i <= installments; i++) {
            double juros = debt * interestRate;
            debt += juros;
            totalInterest += juros;
            System.out.printf("%3d %12s %s\n", i, currencyFormatter.format(juros),
                    currencyFormatter.format(debt));
        }

        System.out.printf("%3s %12s %s\n", "-->", currencyFormatter.format(totalInterest),
                currencyFormatter.format(debt));
    }

}
