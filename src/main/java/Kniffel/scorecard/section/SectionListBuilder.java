package Kniffel.scorecard.section;

import Kniffel.scorecard.section.sections.LowerSectionBuilder;
import Kniffel.scorecard.section.sections.TotalsSectionBuilder;
import Kniffel.scorecard.section.sections.UpperSectionBuilder;

import java.util.ArrayList;
import java.util.List;

public class SectionListBuilder
{
    private List<Section> listOfSection = List.of(
            new UpperSectionBuilder().build(),
            new LowerSectionBuilder().build(),
            new TotalsSectionBuilder().build());

    public SectionListBuilder addList()
    {
        listOfSection = new ArrayList<>();
        return this;
    }

    public SectionListBuilder addSection(Section section)
    {
        listOfSection.add(section);
        return this;
    }

    public SectionListBuilder addSection()
    {
        return new SectionListBuilder();
    }

    public List<Section> buildList()
    {
        return listOfSection;
    }
}
