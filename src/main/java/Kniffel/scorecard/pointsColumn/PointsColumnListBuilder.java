package Kniffel.scorecard.pointsColumn;

import Kniffel.Game;
import Kniffel.scorecard.section.Section;

import java.util.ArrayList;
import java.util.List;

public class PointsColumnListBuilder
{
    private List<PointsColumn> listOfPointsColumn = new ArrayList<>();

    public PointsColumnListBuilder addList()
    {
        this.listOfPointsColumn = new ArrayList<>();
        return this;
    }

    public PointsColumnListBuilder addPointsColumn(PointsColumn pointsColumn)
    {
        listOfPointsColumn.add(pointsColumn);
        return this;
    }

    public PointsColumnListBuilder addPointsColumn()
    {
        return new PointsColumnListBuilder();
    }

    public List<PointsColumn> buildList()
    {
        return listOfPointsColumn;
    }

    public List<PointsColumn> buildList(List<Section> sections)
    {
        List<PointsColumn> pointsColumnList = new ArrayList<>();
        for (int i = 1; i <= Game.getAmountOfRounds(); i++)
        {
            pointsColumnList.add(new PointsColumnBuilder()
                                         .setGameNumber(i)
                                         .setPointsBoxes(sections)
                                         .build());
        }
        return pointsColumnList;
    }
}
