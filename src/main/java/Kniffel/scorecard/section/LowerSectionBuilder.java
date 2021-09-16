package Kniffel.scorecard.section;

import Kniffel.scorecard.categoryBox.CategoryBox;

import java.util.List;

public class LowerSectionBuilder extends SectionBuilder<LowerSectionBuilder>
{
// TODO IMPLEMENT DEFAULT VALUE INCLUDING IN THIS ORDER
//  THREE_OF_A_KIND, FOUR_OF_A_KIND, FULL_HOUSE, SMALL_STRAIGHT, BIG_STRAIGHT, YAHTZEE, CHANCE, YAHTZEE BONUS

    private List<CategoryBox> categoryBoxList;

    public LowerSectionBuilder setCategoryBoxList(List<CategoryBox> categoryBoxList)
    {
        this.categoryBoxList = categoryBoxList;
        return this;
    }

    @Override
    protected LowerSection build()
    {
        return new LowerSection(categoryBoxList);
    }

    @Override
    protected LowerSectionBuilder self()
    {
        return this;
    }
}