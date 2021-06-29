public class TesteSort {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Carlos Andre", "356.456.789");
        Pessoa pessoa2 = new Pessoa("Jose Carlos", "123.456.790");
        Pessoa pessoa3 = new Pessoa("Jose Carlos", "123.456.139");
        Pessoa pessoa4 = new Pessoa("Daniela Andrade", "458.456.457");
        Pessoa pessoa5 = new Pessoa("Vinicius Jorge", "675.432.123");
        Pessoa pessoa6 = new Pessoa("Leticia Omega", "254.478.333");

        Pessoa[] pessoas = {pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6};
        SortUtil.sort(pessoas);
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome() + " - " + p.getCpf());
        }

        Celular c1 = new Celular("998019923", "Jose Carlos");
        Celular c2 = new Celular("987745231", "Daniela Andrade");
        Celular c3 = new Celular("885666124", "Vinicius Jorge");

        Celular[] celulares = {c1, c2, c3};
        SortUtil.sort(celulares);
        for (Celular c : celulares) {
            System.out.println(c.getHolder() + " - " + c.getNumber());
        }
    }
}
