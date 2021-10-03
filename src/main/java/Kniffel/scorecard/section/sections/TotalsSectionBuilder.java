package Kniffel.scorecard.section.sections;

import Kniffel.scorecard.box.Box;
import Kniffel.scorecard.box.totalsBox.totalsBoxes.*;
import Kniffel.scorecard.section.SectionBuilder;

import java.util.List;

public class TotalsSectionBuilder extends SectionBuilder<TotalsSectionBuilder>
{
    private List<Box> boxList = List.of(
            new TotalOfLowerSectionBuilder().build(),
            new TotalOfUpperSectionBuilder().build(),
            new GrandTotalBuilder().build()
    );

    public TotalsSectionBuilder setBoxList(List<Box> boxList)
    {
        this.boxList = boxList;
        return this;
    }

    @Override
    public TotalsSection build()
    {
        return new TotalsSection(boxList);
    }

    @Override
    protected TotalsSectionBuilder self()
    {
        return this;
    }
}