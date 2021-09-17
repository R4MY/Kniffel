package Kniffel.scorecard.section;

import Kniffel.scorecard.box.Box;

import java.util.ArrayList;
import java.util.List;

public abstract class SectionBuilder<T extends SectionBuilder<T>>
{
    private List<Box> boxList = new ArrayList<>();

    public T setBoxList(List<Box> boxList)
    {
        this.boxList = boxList;
        return self();
    }

    public abstract Section build();

    protected abstract T self();
}