package Kniffel.scorecard.box.totalsBox;

import java.util.ArrayList;
import java.util.List;

public class TotalsBoxListBuilder
{
    private List<TotalsBox> listOfTotalsBox;

    public TotalsBoxListBuilder addList()
    {
        this.listOfTotalsBox = new ArrayList<>();
        return this;
    }

    public TotalsBoxListBuilder addTotalsBox(TotalsBox totalsBox)
    {
        listOfTotalsBox.add(totalsBox);
        return this;
    }

    public TotalsBoxListBuilder addTotalsBox()
    {
        return new TotalsBoxListBuilder();
    }

    public List<TotalsBox> buildList()
    {
        return listOfTotalsBox;
    }
}
