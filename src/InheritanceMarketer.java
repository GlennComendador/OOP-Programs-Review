public class InheritanceMarketer extends InheritanceEmployee {

    //CHILDREN CLASS

    //Marketer Specific
    public boolean insideMarket() {

        return true;
    }

    @Override
    public int getHours() {
        //Changes and Overrides Working Hours of Marketer
        return 50;
    }

    @Override
    public int getVacationDays() {
        return 20;
    }

    @Override
    public double getSalary() {
        return 5500;
    }
}
