package Kniffel.scorecard.section;

import Kniffel.scorecard.categoryBox.CategoryBox;

import java.util.ArrayList;
import java.util.List;

public abstract class SectionBuilder<T extends SectionBuilder<T>>
{
    private List<CategoryBox> categoryBoxList = new ArrayList<>();

    public T setCategoryBoxList(List<CategoryBox> categoryBoxList)
    {
        this.categoryBoxList = categoryBoxList;
        return self();
    }

    protected abstract Section build();

    protected abstract T self();
}