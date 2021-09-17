package Kniffel.scorecard.pointsColumn;

import Kniffel.scorecard.section.Section;

import java.util.ArrayList;
import java.util.List;

public class PointsColumnListBuilder
{
    private List<PointsColumn> listOfPointsColumn = List.of(
            new PointsColumnBuilder()
                    .setGameNumber(1)
                    .build(),
            new PointsColumnBuilder()
                    .setGameNumber(2)
                    .build(),
            new PointsColumnBuilder()
                    .setGameNumber(3)
                    .build(),
            new PointsColumnBuilder()
                    .setGameNumber(4)
                    .build(),
            new PointsColumnBuilder()
                    .setGameNumber(5)
                    .build(),
            new PointsColumnBuilder()
                    .setGameNumber(6)
                    .build()
    );

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
        return List.of(
                new PointsColumnBuilder()
                        .setGameNumber(1)
                        .setPointsBoxes(sections)
                        .build(),
                new PointsColumnBuilder()
                        .setGameNumber(2)
                        .setPointsBoxes(sections)
                        .build(),
                new PointsColumnBuilder()
                        .setGameNumber(3)
                        .setPointsBoxes(sections)
                        .build(),
                new PointsColumnBuilder()
                        .setGameNumber(4)
                        .setPointsBoxes(sections)
                        .build(),
                new PointsColumnBuilder()
                        .setGameNumber(5)
                        .setPointsBoxes(sections)
                        .build(),
                new PointsColumnBuilder()
                        .setGameNumber(6)
                        .setPointsBoxes(sections)
                        .build()
        );
    }
}
