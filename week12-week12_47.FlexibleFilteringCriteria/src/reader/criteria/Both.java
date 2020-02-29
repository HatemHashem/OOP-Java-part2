package reader.criteria;

public class Both implements Criterion{
    private Criterion firstCondition;
    private Criterion secondCondition;

    public Both(Criterion firstCondition, Criterion secondCondition) {
        this.firstCondition = firstCondition;
        this.secondCondition = secondCondition;
    }

    @Override
    public boolean complies(String line) {
        return firstCondition.complies(line)&&secondCondition.complies(line);
    }
}
