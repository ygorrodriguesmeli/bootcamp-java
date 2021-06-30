public class Celular implements Precedente<Celular>{
    private String number;
    private String holder;

    public Celular(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Celular() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public int precedeA(Celular celular) {
        int comparison = this.holder.compareTo(celular.getHolder());
        if(comparison == 0) {
            return this.number.compareTo(celular.getNumber());
        }
        return comparison;
    }
}
