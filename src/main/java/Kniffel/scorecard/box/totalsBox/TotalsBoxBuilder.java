package Kniffel.scorecard.box.totalsBox;

public abstract class TotalsBoxBuilder<T extends TotalsBoxBuilder<T>>
{
    private String category;
    private String calculatedScore;
    private TotalsBoxListBuilder totalsBoxListBuilder;

    public TotalsBoxBuilder()
    {
    }

    public TotalsBoxBuilder(TotalsBoxListBuilder totalsBoxListBuilder)
    {
        this.totalsBoxListBuilder = totalsBoxListBuilder;
    }

    public T setCategory(String category)
    {
        this.category = category;
        return self();
    }

    public T setCalculatedScore(String calculatedScore)
    {
        this.calculatedScore = calculatedScore;
        return self();
    }

    public abstract TotalsBox build();

    TotalsBoxListBuilder totalsBoxListBuilder()
    {
        TotalsBox totalsBox = build();
        this.totalsBoxListBuilder.addTotalsBox(totalsBox);
        return this.totalsBoxListBuilder;
    }

    protected abstract T self();
}