package Kniffel.scorecard.section;

import Kniffel.scorecard.categoryBox.CategoryBox;

import java.util.List;

public class UpperSectionBuilder extends SectionBuilder<UpperSectionBuilder>
{
// TODO IMPLEMENT DEFAULT VALUE INCLUDING IN THIS ORDER
//  ACES, TWOS, THREES, FOURS, FIVES, SIXES, TOTAL SCORE, BONUS, TOTAL OF UPPER SECTION

    private List<CategoryBox> categoryBoxList;

    public UpperSectionBuilder setCategoryBoxList(List<CategoryBox> categoryBoxList)
    {
        this.categoryBoxList = categoryBoxList;
        return this;
    }

    @Override
    protected UpperSection build()
    {
        return new UpperSection(categoryBoxList);
    }

    @Override
    protected UpperSectionBuilder self()
    {
        return this;
    }
}