package Kniffel.service;

import Kniffel.Game;
import Kniffel.scorecard.Scorecard;
import Kniffel.scorecard.box.categoryBox.CategoryBox;
import Kniffel.scorecard.box.totalsBox.TotalsBox;
import Kniffel.scorecard.pointsColumn.PointsBox;
import Kniffel.scorecard.pointsColumn.PointsColumn;
import Kniffel.scorecard.section.sections.SectionEnum;

import java.util.List;
import java.util.Optional;

public class PointsCalculator
{
    public static boolean addPointsToCategory(Scorecard scorecard, String category, List<Integer> currentThrow)
    {
        Optional<PointsBox> oPointsBox = scorecard.getPointsColumns().get(Game.getCurrentRound()).getPointsBoxes().stream()
                                                  .filter(pointsBox -> pointsBox.getBox().getCategory().equalsIgnoreCase(category))
                                                  .findFirst();

        if (oPointsBox.isPresent())
            if (oPointsBox.get().getPoints() == null)
            {
                PointsBox pointsBox = oPointsBox.get();
                CategoryBox categoryBox = (CategoryBox) pointsBox.getBox();
                pointsBox.setPoints(categoryBox.calculate(currentThrow));
            } else
                return false;
        else
            return false;

        return true;
    }

    public static void addPointsToCategory(Scorecard scorecard, String category)
    {
        Optional<PointsBox> oPointsBox = scorecard.getPointsColumns().get(Game.getCurrentRound()).getPointsBoxes().stream()
                                                  .filter(pointsBox -> pointsBox.getBox().getCategory().equalsIgnoreCase(category))
                                                  .findFirst();

        if (oPointsBox.isPresent())
        {
            PointsBox pointsBox = oPointsBox.get();
            TotalsBox totalsBox = (TotalsBox) pointsBox.getBox();
            pointsBox.setPoints(totalsBox.calculate(scorecard));
        }
    }

    public static int getTotalOfUpperSectionWithoutBonus(Scorecard scorecard)
    {
        return getTotalOfSection(scorecard, SectionEnum.UPPER_SECTION_WITHOUT_BONUS);
    }

    public static int getTotalOfUpperSection(Scorecard scorecard)
    {
        return getTotalOfSection(scorecard, SectionEnum.UPPER_SECTION);
    }

    public static int getTotalOfLowerSection(Scorecard scorecard)
    {
        return getTotalOfSection(scorecard, SectionEnum.LOWER_SECTION);
    }

    public static int getGrandTotal(Scorecard scorecard)
    {
        return getTotalOfSection(scorecard, SectionEnum.GRAND_TOTAL);
    }

    private static int getTotalOfSection(Scorecard scorecard, SectionEnum sectionEnum)
    {
        return scorecard.getPointsColumns().stream()
                        .map(PointsColumn::getPointsBoxes)
                        .map(pointsBoxes -> pointsBoxes.stream()
                                                       .filter(pointsBox -> ((CategoryBox) pointsBox.getBox())
                                                               .getSectionsToAddTo().contains(sectionEnum))
                                                       .map(PointsBox::getPoints)
                                                       .reduce(0, Integer::sum))
                        .findFirst().orElse(0);
    }
}
