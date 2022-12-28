public class Tartscheshield extends Shield{ //щит вида Тарч :)
    @Override
    public int protectPoint() {
        return 13;
    }

    @Override
    public String toString() {
        return "Деревянный щит " + super.toString();
    }
}