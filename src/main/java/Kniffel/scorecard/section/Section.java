package Kniffel.scorecard.section;

import Kniffel.scorecard.categoryBox.CategoryBox;

import java.util.Objects;
import java.util.Set;

public abstract class Section
{
    private Set<CategoryBox> categoryBoxSet;

    public Section(Set<CategoryBox> categoryBoxSet)
    {
        this.categoryBoxSet = categoryBoxSet;
    }

    public Set<CategoryBox> getCategoryBoxSet()
    {
        return categoryBoxSet;
    }

    public void setCategoryBoxSet(Set<CategoryBox> categoryBoxSet)
    {
        this.categoryBoxSet = categoryBoxSet;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return Objects.equals(categoryBoxSet, section.categoryBoxSet);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(categoryBoxSet);
    }

    @Override
    public String toString()
    {
        return "Section{" +
                "categoryBoxSet=" + categoryBoxSet +
                '}';
    }
}
