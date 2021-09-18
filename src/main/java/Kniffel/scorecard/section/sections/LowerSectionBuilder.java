package Kniffel.scorecard.section.sections;

import Kniffel.scorecard.box.Box;
import Kniffel.scorecard.box.categoryBox.categoryBoxes.*;
import Kniffel.scorecard.section.SectionBuilder;

import java.util.ArrayList;
import java.util.List;

public class LowerSectionBuilder extends SectionBuilder<LowerSectionBuilder>
{
    private List<Box> boxList = new ArrayList<>(List.of(
            new ThreeOfAKindBuilder().build(),
            new FourOfAKindBuilder().build(),
            new FullHouseBuilder().build(),
            new SmallStraightBuilder().build(),
            new BigStraightBuilder().build(),
            new YahtzeeBuilder().build(),
            new ChanceBuilder().build()
    ));

    public LowerSectionBuilder setBoxList(List<Box> boxList)
    {
        this.boxList = boxList;
        return this;
    }

    public LowerSectionBuilder addYahtzeeBonus()
    {
        boxList.add(new YahtzeeBonusBuilder().build());
        return this;
    }

    @Override
    public LowerSection build()
    {
        return new LowerSection(boxList);
    }

    @Override
    protected LowerSectionBuilder self()
    {
        return this;
    }
}