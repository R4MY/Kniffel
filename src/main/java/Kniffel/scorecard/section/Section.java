package Kniffel.scorecard.section;

import Kniffel.scorecard.box.Box;

import java.util.List;
import java.util.Objects;

public abstract class Section
{
    private List<Box> boxList;

    public Section(List<Box> boxList)
    {
        this.boxList = boxList;
    }

    public List<Box> getBoxList()
    {
        return boxList;
    }

    public void setBoxList(List<Box> boxList)
    {
        this.boxList = boxList;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return Objects.equals(boxList, section.boxList);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(boxList);
    }

    @Override
    public String toString()
    {
        return ""
                + "   \"boxList\" : " + boxList
                + "";
    }

}
