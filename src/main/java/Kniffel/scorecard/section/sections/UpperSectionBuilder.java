package Kniffel.scorecard.section.sections;

import Kniffel.scorecard.box.Box;
import Kniffel.scorecard.box.categoryBox.categoryBoxes.*;
import Kniffel.scorecard.box.totalsBox.totalsBoxes.TotalOfUpperSectionBuilder;
import Kniffel.scorecard.box.totalsBox.totalsBoxes.TotalOfUpperSectionWithoutBonusBuilder;
import Kniffel.scorecard.section.SectionBuilder;

import java.util.List;

public class UpperSectionBuilder extends SectionBuilder<UpperSectionBuilder>
{
    private List<Box> boxList = List.of(
            new AcesBuilder().build(),
            new TwosBuilder().build(),
            new ThreesBuilder().build(),
            new FoursBuilder().build(),
            new FivesBuilder().build(),
            new SixesBuilder().build(),
            new TotalOfUpperSectionWithoutBonusBuilder().build(),
            new UpperBonusBuilder().build(),
            new TotalOfUpperSectionBuilder().build()
            );

    public UpperSectionBuilder setBoxList(List<Box> boxList)
    {
        this.boxList = boxList;
        return this;
    }

    @Override
    public UpperSection build()
    {
        return new UpperSection(boxList);
    }

    @Override
    protected UpperSectionBuilder self()
    {
        return this;
    }
}