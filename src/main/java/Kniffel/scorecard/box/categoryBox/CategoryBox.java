package Kniffel.scorecard.box.categoryBox;

import Kniffel.scorecard.box.Box;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;
import java.util.Objects;

public abstract class CategoryBox extends Box
{
    private String description;
    private String scoreComposition;
    private List<SectionEnum> sectionsToAddTo;

    public CategoryBox()
    {
    }

    public CategoryBox(String category, String description, String scoreComposition, List<SectionEnum> sectionsToAddTo)
    {
        super(category);
        this.description = description;
        this.scoreComposition = scoreComposition;
        this.sectionsToAddTo = sectionsToAddTo;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getScoreComposition()
    {
        return scoreComposition;
    }

    public void setScoreComposition(String scoreComposition)
    {
        this.scoreComposition = scoreComposition;
    }

    public List<SectionEnum> getSectionsToAddTo()
    {
        return sectionsToAddTo;
    }

    public void setSectionsToAddTo(List<SectionEnum> sectionsToAddTo)
    {
        this.sectionsToAddTo = sectionsToAddTo;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CategoryBox that = (CategoryBox) o;
        return Objects.equals(description, that.description) && Objects.equals(scoreComposition, that.scoreComposition) && Objects.equals(sectionsToAddTo, that.sectionsToAddTo);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), description, scoreComposition, sectionsToAddTo);
    }

    @Override
    public String toString()
    {
        return "\nCategoryBox\n{\n"
                + super.toString()
                + ",\n   \"description\" : \"" + description + "\""
                + ",\n   \"scoreComposition\" : \"" + scoreComposition + "\""
                + ",\n   \"sectionsToAddTo\" : " + sectionsToAddTo
                + "\n}";
    }
}
