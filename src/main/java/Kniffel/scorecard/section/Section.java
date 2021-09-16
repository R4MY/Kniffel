package Kniffel.scorecard.section;

import Kniffel.scorecard.categoryBox.CategoryBox;

import java.util.List;
import java.util.Objects;

public abstract class Section
{
    private List<CategoryBox> categoryBoxList;

    Section(List<CategoryBox> categoryBoxList)
    {
        this.categoryBoxList = categoryBoxList;
    }

    public List<CategoryBox> getCategoryBoxList()
    {
        return categoryBoxList;
    }

    public void setCategoryBoxList(List<CategoryBox> categoryBoxList)
    {
        this.categoryBoxList = categoryBoxList;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return Objects.equals(categoryBoxList, section.categoryBoxList);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(categoryBoxList);
    }

    @Override
    public String toString()
    {
        return "Section{" +
                "categoryBoxList=" + categoryBoxList +
                '}';
    }
}
