package Kniffel.scorecard.section;

import Kniffel.scorecard.categoryBox.CategoryBox;

import java.util.List;

public class TotalsSectionBuilder extends SectionBuilder<TotalsSectionBuilder>
{
// TODO IMPLEMENT DEFAULT VALUE INCLUDING IN THIS ORDER
//  TOTAL_OF_LOWER_SECTION, TOTAL_OF_UPPER_SECTION, GRAND_TOTAL

    private List<CategoryBox> categoryBoxList;

    public TotalsSectionBuilder setCategoryBoxList(List<CategoryBox> categoryBoxList)
    {
        this.categoryBoxList = categoryBoxList;
        return this;
    }

    @Override
    protected TotalsSection build()
    {
        return new TotalsSection(categoryBoxList);
    }

    @Override
    protected TotalsSectionBuilder self()
    {
        return this;
    }
}